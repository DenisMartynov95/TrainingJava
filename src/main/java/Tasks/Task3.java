package Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {


    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void checkNumbers() {
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Первое число: " + x);

        System.out.println("Введите первое число: ");
        int y = scanner.nextInt();
        System.out.println("Второе число: " + y);
        if (x == Math.sqrt(y) || y == Math.sqrt(x)) {
            System.out.println("Одно число является квадратом второго");
        }
    }

    public void checkLastNumber() {
        byte x;
        do {
            x = (byte) random.nextInt(26);
            System.out.println("Сгенерировано число: " + x);
            if (x % 10 == 5) {
                System.out.println("Последнее число равно пяти! Цикл завершился");
                break;
            } else {
                System.out.println("Последнее число не равно пяти! Генерирую новое число: " + x);
            }
        } while (true);
    }

    public void checkEven() {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Введенное число четное ");
        } else {
            System.out.println("Введенное число нечетное ");
        }
    }

    public void compareNumbers() {
        System.out.println("Введите 1 число: ");
        int x = scanner.nextInt();
        System.out.println("Введите 2 число: ");
        int y = scanner.nextInt();
        System.out.println("Введите 3 число: ");
        int z = scanner.nextInt();

        int sum = x + y;

        if (sum > z) {
            System.out.println("Сумма двух введенных чисел больше третьего числа");
        } else if (sum == z) {
            System.out.println("Сумма двух введенных чисел равна третьему числу");

        } else {
            System.out.println("Сумма двух введенных чисел меньше третьего числа");
        }
    }

    public void isPositive() {
        System.out.println("Введите любое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number == 0) {
            System.out.println("Число равно 0");
        } else {
            System.out.println("Число меньше нуля");
        }
    }

    public void printSpeedWarning(int currentSpeed) {
        int speedLimit = 50;
        int overSpeed = currentSpeed - speedLimit;

        if (overSpeed >= 1 && overSpeed <= 20) {
            System.out.println("Вы превысили скорость на " + overSpeed + " может прийти штраф 500 рублей!");
        } else if (overSpeed >= 21 && overSpeed <= 40) {
            System.out.println("Вы превысили скорость на " + overSpeed + " может прийти штраф 1000 рублей!");
        } else if (overSpeed >= 41 && overSpeed <= 60) {
            System.out.println("Вы превысили скорость на " + overSpeed + " может прийти штраф 2000 рублей!");
        } else if (overSpeed >= 61) {
            System.out.println("Вы превысили скорость на " + overSpeed + " может прийти штраф 5000 рублей! + Лишение прав!");
        } else {
            System.out.println("Не будет штрафа");
        }
    }

    public String processTrafficLightSignal(String color) {
        if (color.equals("зеленый")) {
            return "Можно ехать!";
        } else if (color.equals("желтый") || color.equals("красный")) {
            return "Стой!";
        } else {
            return "Некорректный ответ";
        }
    }

}
