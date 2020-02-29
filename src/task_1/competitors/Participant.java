package task_1.competitors;
import task_1.competitors.Cat;

public interface Participant {

  void jump(int weight);

  void run(int length);

  void printInfo(String result); // метод печатает в консоль результат работы jump, run

  void info(); // метод выводит в консоль true или false

  boolean isOnDistance();
}