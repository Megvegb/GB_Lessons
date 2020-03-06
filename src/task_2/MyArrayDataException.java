package task_2;

public class MyArrayDataException extends Exception {

   public MyArrayDataException (String message, String cause){
       super(message + cause); // передача сообщения об ошибки в родительский класс и вывод в StackTrace

   }
}
