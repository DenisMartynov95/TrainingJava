package Training1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTraining2 {

    /*
    Создай ArrayList<String> с именами пользователей: "Alex", "Maria", "Denis", "Olga".
Напиши метод printUsers(), который выводит всех пользователей с их индексами.
Напиши метод findUser(String name), который проверяет наличие пользователя и выводит сообщение "<имя> найден" или "<имя> не найден".
     */

    private  final ArrayList<String> names = new ArrayList<>();

    public ListTraining2() {
        names.add("Alex");
        names.add("Maria");
        names.add("Denis");
        names.add("Olga");
    }

    public void printUsers() {
        System.out.println(names);
    }

    public void findUser(String name) {
        if (names.contains(name)) {
            System.out.println("Имя :" + name + " найдено");
        }  else {
            System.out.println("Имя: " + name + " НЕ найдено!");
        }
    }


        /*
            Добавь на третье место новое имя
       */

    public void addName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.next();

        names.add(2, name);
        printUsers();

    }

}
