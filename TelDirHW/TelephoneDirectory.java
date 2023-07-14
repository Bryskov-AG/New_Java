package TelDirHW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {

    private Map<String, List<String>> directory;

    public TelephoneDirectory() {
        directory = new HashMap<>();
    }

    // Метод для добавления номера телефона по фамилии
    public void addPhoneNumber(String surname, String phoneNumber) {
        List<String> phoneNumbers = directory.getOrDefault(surname, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        directory.put(surname, phoneNumbers);
    }

    // Метод для получения списка номеров телефона по фамилии
    public List<String> getPhoneNumbers(String surname) {
        return directory.getOrDefault(surname, new ArrayList<>());
    }
    
}
