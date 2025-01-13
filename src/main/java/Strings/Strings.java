package Strings;

import java.util.Scanner;

public class Strings {
    // Изучение методов у строк
    Scanner scanner = new Scanner(System.in);



    //Посчитать кол-во символов
    public void countStrSymbols() {
        String str = scanner.nextLine();
        System.out.println("В этой строке: " + str.length() + " символов!");
    }



    //Проверяю пустая ли введенная строка
    public void isStringEmpty() {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Строка пустая!");
        } else {
            System.out.println(input);
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

    }




}
