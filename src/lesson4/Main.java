package lesson4;

import java.util.*;
// 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
public class Main {
    public static void main(String[] args) {
        List<String> wordsArrayList = Arrays.asList(
                "Акита-ину", "Американский бульдог", "Боксер", "Боксер", "Боксер", "Далматин",
                "Доберман", "Золотистый ретривер", "Мальтипу", "Немецкая овчарка",
                "Пудель", "Ротвейлер", "Сибирский хаски", "Такса",
                "Фокстерьер", "Шарпей", "Чау-чау", "Чау-чау", "Эрдельтерьер");
        Set<String> wordsWithoutDuplicates = new HashSet<>(wordsArrayList);

        System.out.println("Породы собак без сортировки: " + wordsArrayList);
        System.out.println("Вывод пород собак без повтора: " + wordsWithoutDuplicates);
        for (String breed : wordsWithoutDuplicates) {
            System.out.println("Порода повторяется: " + Collections.frequency(wordsArrayList, breed) + " раз " + breed);
        }
        //Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи,
        // а с помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Гоголь", "123-45-67");
        System.out.println("Гоголь" + phoneDirectory.get("Гоголь"));

        phoneDirectory.add("Пушкин", "555-00-99");
        System.out.println("Пушкин" + phoneDirectory.get("Пушкин"));

        phoneDirectory.add("Толстой", "909-66-66");
        System.out.println("Толстой" + phoneDirectory.get("Толстой"));

        phoneDirectory.add("Толстой", "987-65-43");
        System.out.println("Толстой" + phoneDirectory.get("Толстой"));

        phoneDirectory.add("Чехов", "771-23-23");
        System.out.println("Чехов" + phoneDirectory.get("Чехов"));

        System.out.println(phoneDirectory.get("Достоевский"));
    }

}

