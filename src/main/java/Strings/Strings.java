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
        System.out.println("Введите строку: ");
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

    //Удаляю пробелы вначале строки
    public void trimSpaces() {
        fillInput();
        System.out.println(getInput().trim());
    }

    // Изменяю регистр на low
    public void setLowCase() {
        fillInput();
        System.out.println(getInput().toLowerCase());
    }

    // Изменяю регистр на upper
    public void setUpperCase() {
        fillInput();
        System.out.println(getInput().toUpperCase());
    }

    // Ищу индекс подстроки
    String str  = "Test word";
    public void searchIndexOfString() {
        System.out.println(str.indexOf("t"));
    }

    // Ищу индекс подстроки справа налево
    String str2 = "Test";
    public void invertSearchIndexOfString() {
        System.out.println(str2.lastIndexOf("e"));
    }

    // Вывожу символ введенного индекса
    String str3 = "Java";
    public void printCharOfIndex() {
        System.out.println(str3.charAt(0));
    }

    // Поиск подстрок с помощью contains, startWith, endWith = они возвращают либо true либо false
    String str4 = "Раз, два, три";
    public void searchString() {
        System.out.println(str4.contains("Раз"));
        System.out.println(str4.startsWith("Раз"));
        System.out.println(str4.endsWith("три"));
    }

    // Выделяю подстроку из строки, например чтобы ее извлечь
    String str5 = "Это тестовая строка!";
    public void  selectString() {
        // Выделенную строку от 0 символа до 7 я перемещаю в selected
        String selected = str5.substring(0,7);
        System.out.println(selected);
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

    //Тебе нужно проверить, содержит ли переданная строка пробелы в начале или в конце. Для этого:
    //создай строку без пробелов в начале и в конце: нужно удалить пробелы в начале и конце у исходной строки,
    //сравни две строки.
    public void task2() {
        String str = "          test                   ";
        String assertString = "test";

        if (str.startsWith(" ") && str.endsWith(" ")) {
            System.out.println("Тестовая строка содержит пробелы! Буду триммирить ее");
        }

        String afterTrimmer = str.trim();

        if (afterTrimmer.equals(assertString)) {
            System.out.println("Строки эквиваленты: " + afterTrimmer + "=" + assertString);
        } else {
            System.out.println("Строки неравны: " + afterTrimmer + "!=" + assertString);
        }
    }

    //Методу передают строку. Тебе нужно проверить, содержит ли строка символы:
    //только верхнего регистра — верни «Строка в верхнем регистре»,
    //только нижнего регистра — верни «Строка в нижнем регистре»,
    //разные регистры — верни «Строка с разными регистрами».
    public void task3() {
        fillInput();
        String isUpperCase = getInput().toUpperCase();
        String isLowerCase = getInput().toLowerCase();

        if (getInput().equals(isUpperCase)) {
            System.out.println("Строка в верхнем регистре");
        } else if (getInput().equals(isLowerCase)) {
            System.out.println("Строка в нижнем регистре");
        } else {
            System.out.println("Строка в разных регистрах: " + getInput());
        }
    }

    //Когда программа распознаёт текст с картинки, могут появляться ошибки — например, лишние пробелы или пустые строки.
    //Напиши метод, который:
    //очищает строку от пробелов в начале и конце,
    //выводит строку на экран.
    //Метод не должен выводить на экран пустые строки.
    public void task4() {
        String[] parsedText = {
                "                                               I                                                   ",
                "           – Еh bien, mon prince. Gênes et Lucques ne sont plus que des apanages, des поместья, de ",
                "            la famille Buonaparte. Non, je vous préviens que si vous ne me dites pas que nous avons",
                "   la guerre, si vous vous permettez encore de pallier toutes les infamies, toutes les atrocités   ",
                "        de cet Antichrist (ma parole, j’y crois) — je ne vous connais plus, vous n’êtes plus mon   ",
                "          ami, vous n’êtes plus мой верный раб, comme vous dites[1]. Ну, здравствуйте,             ",
                "здравствуйте. Je vois que je vous fais peur[2], садитесь и рассказывайте.                          ",
                "",
                "Так говорила в июле 1805 года известная Анна Павловна Шерер, фрейлина и приближенная               ",
                "императрицы Марии Феодоровны, встречая важного и чиновного князя Василия, первого                  ",
                "приехавшего на ее вечер. Анна Павловна кашляла несколько дней, у нее был грипп, как она говорила   ",
                "(грипп был тогда новое слово, употреблявшееся только редкими). В записочках, разосланных утром     ",
                "с красным лакеем, было написано без различия во всех:                                              ",
                "                                                                                                   "
        };

        for (int i = 0; i < parsedText.length; i++) {
            String str = parsedText[i];
            String trimmedString = str.trim();
            System.out.println(trimmedString);
        }
    }

    // Когда оплачиваешь покупку банковской картой через интернет, нужно ввести имя держателя карты.
    //Имя на карте написано заглавными буквами, а пользователь может ввести его любыми. Напиши метод, который переводит имя в верхний регистр — то есть делает все буквы заглавными.
    public void task5() {
        fillInput();
        System.out.println(input.toUpperCase());
    }

    //Когда ищешь данные в библиотеке, неудобно вводить название книги полностью. Иногда полное название и вовсе неизвестно.
    //Нужно написать метод, который ищет книгу по частичному названию. Пусть он называется public boolean search(String name, String subName) {}.
    //Метод возвращает true, если строка содержит подстроку.
    String nameBook = "Война и мир";
    public void task6() {
        fillInput();
        // Вначале приведу имя книги и текст инпута в эквивалентные нерегистрозависимые строки
        String letLowCaseForInput = getInput().toLowerCase();
        String letLowCaseForNameBook = nameBook.toLowerCase();

        if (letLowCaseForNameBook.lastIndexOf(letLowCaseForInput) > 0) {
            System.out.println("Книга найдена");
        } else {
            System.out.println("Книга не найдена");
        }
    }




}