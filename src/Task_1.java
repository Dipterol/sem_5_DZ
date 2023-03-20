//Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//        что 1 человек может иметь несколько телефонов.
//        Добавить функции 1) Добавление номера
//        2) Вывод всего
//        Пример:
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 1242353
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 547568
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я: 2
//        Иванов: 1242353, 547568

import java.util.*;

public class Task_1 {
    public static void task_1() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        while (true) {
            System.out.println("Введите команду: 1 - Добавление номера, 2 - Вывод всего, 0 - Выход");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Введите фамилию:");
                    String lastName = scanner.nextLine();
                    System.out.println("Введите номер:");
                    String phoneNumber = scanner.nextLine();

                    // Если в телефонной книге уже есть контакт с такой фамилией, добавляем номер к списку номеров
                    if (phoneBook.containsKey(lastName)) {
                        ArrayList<String> phoneNumbers = phoneBook.get(lastName);
                        phoneNumbers.add(phoneNumber);
                    }
                    // Если контакта с такой фамилией еще нет, создаем новый список номеров и добавляем его в телефонную книгу
                    else {
                        ArrayList<String> phoneNumbers = new ArrayList<>();
                        phoneNumbers.add(phoneNumber);
                        phoneBook.put(lastName, phoneNumbers);
                    }
                    break;
                case 2:
                    System.out.println("Все контакты:");
                    for (String lastNameKey : phoneBook.keySet()) {
                        System.out.print(lastNameKey + ": ");
                        ArrayList<String> phoneNumbers = phoneBook.get(lastNameKey);
                        for (String phoneNumberValue : phoneNumbers) {
                            System.out.print(phoneNumberValue + ", ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }
    }
}
