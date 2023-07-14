package TelDirHW;

import java.util.List;
import java.util.Scanner;

// Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

// ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
// взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.

public class Main {

    public static void main(String[] args) {
        // Создание объекта TelephoneDirectory
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        // Добавление номеров телефона в справочник
        telephoneDirectory.addPhoneNumber("Ivanov", "9263455445");
        telephoneDirectory.addPhoneNumber("Petrov", "9276457345");
        telephoneDirectory.addPhoneNumber("Sidorov", "9296456365");
        telephoneDirectory.addPhoneNumber("Ivanov", "9031111111");

        System.out.println("=======================================");

        // Вывод приветствия и инструкций
        System.out.println("Добро пожаловать в телефонный справочник!");
        System.out.println("Для поиска номера телефона введите фамилию (или 'exit' для выхода).");

        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите фамилию: ");
            String surname = scanner.nextLine();

            if (surname.equalsIgnoreCase("exit")) {
                System.out.println("До свидания!");
                break;
            }

            // Поиск номеров телефона по фамилии
            List<String> phoneNumbers = telephoneDirectory.getPhoneNumbers(surname);

            if (phoneNumbers.isEmpty()) {
                System.out.println("Номера телефона для фамилии " + surname + " не найдены.");
            } else {
                System.out.println("Найдены номера телефона для фамилии " + surname + ":");
                for (String phoneNumber : phoneNumbers) {
                    System.out.println(phoneNumber);
                }
                System.out.println("=======================================");
            }
        }
        scanner.close();
    }
    
}
