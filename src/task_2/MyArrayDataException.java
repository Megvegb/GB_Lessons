package task_2;

public class MyArrayDataException extends Exception {


   public MyArrayDataException (String message, String s){
       super(message);
       System.out.println(s);
   }
}
