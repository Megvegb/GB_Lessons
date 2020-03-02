package task_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Start {
    private static final int correctSIZE = 2;
    private static int stringSize;
    private static int columnSize;
    private static String[][] arr;
    private static Scanner sc = new Scanner(System.in);
    private static int sum = 0;


    public static void main(String[] args) throws MyArraySizeException {
        userSizeArrayInput();
        arr = new String[stringSize][columnSize];
        try {
            test(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } finally {
            fillArray(arr);
        }
    }

    public static void userSizeArrayInput() {
        System.out.println("Пожалуйста создайте двумерный массив размером " + correctSIZE + " x " + correctSIZE);
        stringSize = sc.nextInt();
        columnSize = sc.nextInt();
    }

    public static void test(String[][] arr) throws MyArraySizeException {
        if (stringSize != correctSIZE || columnSize != correctSIZE) { // обработать позже, если вводить 2 и 3
            throw new MyArraySizeException("Размер массива некорректен - " + stringSize + " x " + columnSize, arr.length);
        }
    }

    public static void fillArray(String[][] arr) {
        System.out.println("Теперь введите числовые значения для заполнения строк,\n" +
                "в данном случае значений будет " + stringSize * columnSize);
        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.next();
            }
        }

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (isInteger(arr[i][j])) {
                    sum += Integer.parseInt(arr[i][j]);
                } else
                    System.out.println("В строке найдены символы или текст");
//                    throw new MyArrayDataException("В строке найдены символы или текст");
            }
        }
        System.out.println("Результат работы метода = " + sum);
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






