package Strings;

import java.util.Scanner;

public class Strings {
    // Изучение методов у строк
    Scanner scanner = new Scanner(System.in);

    // Внедрил один инпут для всех методов, вывел его из методов в сам класс
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    // Метод для заполнения строки input он простроен в самом классе, а не как внешний метод!
    // Все последующие методы обращаются к нему
    public void fillInput() {
        System.out.println("Введите строку: " );
    setInput(scanner.nextLine());
    }

    //Посчитать кол-во символов
    public void countStrSymbols() {
        fillInput();
        System.out.println("В этой строке: " + getInput().length() + " символов!");
    }

    //Проверяю пустая ли введенная строка
    public void isStringEmpty() {
        fillInput();
        if (getInput().isEmpty()) {
            System.out.println("Строка пустая!");
        } else {
            System.out.println(getInput());
        }
    }

    /*
            Задачи для закрепления
                                        */
    //Методу передают строку как параметр. Тебе нужно проверить, не пустая ли строка, которую передали первым аргументом:
    //Если она пустая, верни строку «Строка пустая».
    //Если состоит только из пробелов, верни строку «Строка состоит из одних пробелов».
    //Во всех остальных случаях верни строку «Строка содержит символы, кроме пробелов».
    public void task1() {
        fillInput();
        if (input.isEmpty()) {
            System.out.println("Строка пустая");
        } else if (input.isBlank()) {
            System.out.println("Строка состоит из пробелом");
        } else {
            System.out.println("Строка содержит символы - вот строка: " + getInput());
        }
    }






}
