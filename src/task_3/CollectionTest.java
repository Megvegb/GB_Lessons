package task_3;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        findString(); // task_3.1
        phoneBook(); // task 3.2

    }

    public static void findString() {
        List<String> words = Arrays.asList(
                "next", "cancel", "close", "other", "application",
                "accept", "restart", "computer", "laptop", "monitor",
                "flash", "disk", "projector", "computer", "scanner",
                "printer", "keyboard", "key", "mouse", "computer", "projector");

        Collections.sort(words);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
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

    private static void phoneBook() {
    }



}

