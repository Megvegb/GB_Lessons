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
        if (arr.length != correctSIZE) { // обработать позже, если вводить 2 и 3
            throw new MyArraySizeException("Размер массива некорректен - " + arr.length + " x " + arr.length, arr.length);
        }
    }

    public static void fillArray(String[][] arr) { // печатается на одно значение меньше чем должно
        System.out.println("Теперь введите числовые значения для заполнения строк,\n" +
                "в данном случае значений будет " + stringSize * columnSize);
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.next();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (isInteger(arr[i][j])) {
                    System.out.println(arr[i][j]);
//                    int num = Integer.parseInt(arr[i][j]);//  System.out.println(num);
                } else System.out.println("Обнаружен символ");
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






