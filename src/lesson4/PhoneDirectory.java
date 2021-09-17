package lesson4;

import java.util.*;

public class PhoneDirectory {
    private final HashMap<String, List<String>> directory;
    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }
    public void add(String surname, String number) {
        if (directory.containsKey(surname)) {
            List<String> numbers = directory.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println("В справочник добавлен новый номер телефона");
            } else {
                System.out.println("Такой номер уже есть");
            }
        } else {
                directory.put(surname, new ArrayList<>(Collections.singletonList(number)));
                System.out.println("Добавлен в справочник новый номер телефона");
            }
        }
        public List<String> get (String surname) {
        if (directory.containsKey(surname)) {
            return directory.get(surname);
        } else {
            System.out.printf("В справочнике нет записи к фамилии %s%n", surname);
            return new ArrayList<>();
        }
        }
    }

