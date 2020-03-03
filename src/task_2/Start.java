package task_2;

/**
 * @Autor Vladimir Medvedev
 * @Group GU_Android_394
 * @Date 02/03/2020
 */

/*
1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого
размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то
элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
MyArrayDataException и вывести результат расчета.
 */

import java.util.Scanner;

public class Start {
    private static final int correctSIZE = 2;
    private static int stringSize;
    private static int columnSize;
    private static String[][] arr;
    private static Scanner sc = new Scanner(System.in);
    private static int sum = 0;
    public static String incorrectString;


    public static void main(String[] args) { // главный метод, запускает работу приложения и обрабатывает исключения
        userSizeArrayInput();
        arr = new String[stringSize][columnSize];
        try {
            test(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("Результат сложения = " + fillArray(arr));
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        }
    }

    public static void userSizeArrayInput() {  // метод принимает на вход данные
        System.out.println("Пожалуйста создайте двумерный массив размером " + correctSIZE + " x " + correctSIZE);
        stringSize = sc.nextInt();
        columnSize = sc.nextInt();
    }

    public static void test(String[][] arr) throws MyArraySizeException {
        if (stringSize != correctSIZE || columnSize != correctSIZE) { // обработать позже, если вводить 2 и 3
            throw new MyArraySizeException("Размер массива некорректен - " + stringSize + " x " + columnSize, arr.length);
        }
    }

    public static int fillArray(String[][] arr) throws MyArrayDataException {
        System.out.println("Теперь введите числовые значения для заполнения строк,\n" +
                "в данном случае значений будет " + stringSize * columnSize);
        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.next();
            }
        }
        sumArray(arr);
        return sum;
    }

    public static void sumArray(String[][] arr) throws MyArrayDataException {

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (isInteger(arr[i][j])) {
                    sum += Integer.parseInt(arr[i][j]);
                    incorrectString = i + "" + j;
                } else
                    throw new MyArrayDataException("В строке найдены символы или текст, см. ячейку №", incorrectString);
            }
        }
    }

    public static boolean isInteger(String s) {
        boolean result = false;
        if (!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isLetter(s.charAt(i))) {
                    result = true;
                } else
                    result = false;
            }
        }
        return result;
    }
}






