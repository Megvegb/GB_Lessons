package task_2;

public class MyArraySizeException extends Exception {
    private int length;

    public MyArraySizeException(String message, int length){
        super(message);

        this.length = length;

    }

}
