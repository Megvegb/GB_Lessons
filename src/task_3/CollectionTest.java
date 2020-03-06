/**
 * @author Vladimir Medvedev
 *  @version dated March 6, 2020
 *  @task 3.1
 */

package task_3;

import java.util.*;

public class CollectionTest {
    private static PhoneBook phoneBook;

    public static void main(String[] args) {
        findString(); // task_3.1
        phoneBookInit(); // task 3.2

    }

    public static void findString() {
        List<String> words = Arrays.asList(
                "next", "cancel", "close", "other", "application",
                "accept", "restart", "computer", "laptop", "monitor",
                "flash", "disk", "projector", "computer", "scanner",
                "printer", "keyboard", "key", "mouse", "computer", "projector");

        Collections.sort(words);
        Map<String, Integer> map = new LinkedHashMap<>();
        String result = "";
        int count = 0;
        for (int i = 1; i < words.size(); i++) {
            if (!words.get(i - 1).equals(words.get(i))) {
                result = words.get(i);
                count = 1;
                map.put(result, count);
            }
            else if (words.get(i - 1).equals(words.get(i)))
                count += 1;
                map.put(result,count);

        }

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() +
                    " - " + entry.getValue());
    }

    private static void phoneBookInit() {
        phoneBook = new PhoneBook();

        phoneBook.add("Медведев", "+74956783456");
        phoneBook.add("Орлов", "+74997576565");
        phoneBook.add("Попов", "+79670153345");
        phoneBook.add("Попов", "+73645671234");
        phoneBook.add("Медведев", "+79196765433");
        phoneBook.add("Медведев", "+32587745656");
        phoneBook.add("Данилов", "8800");

        printInfo();
    }
    public static void printInfo() {
        String[] arr = {"Медведев", "Орлов", "Попов","Данилов"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + phoneBook.get(arr[i]));

        }
    }
}

