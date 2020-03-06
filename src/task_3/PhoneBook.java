package task_3;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> tm = new TreeMap<>();
    private List<String> phoneNumberList;

    public void add(String lastName, String phoneNumber) {
        if (tm.containsKey(lastName)) {
            phoneNumberList = tm.get(lastName);
            phoneNumberList.add(phoneNumber);
            tm.put(lastName, phoneNumberList);

        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            tm.put(lastName, phoneNumberList);
        }
    }

    public List<String> get(String lastName) {
        return tm.get(lastName);

    }
}
