package phonebook;

import java.util.HashMap;
import java.util.Set;

public class PhoneBook {
    public HashMap<String, String> phoneNumbers = new HashMap<>();
    public int count = 0;

    public void addContact(String name, String phoneNumber) {
        phoneNumbers.put(name, phoneNumber);
        count++;
    }

    public static void getPhoneNumber(HashMap<String, String> phoneNumbers) {
        System.out.println(phoneNumbers.values());
    }
}

