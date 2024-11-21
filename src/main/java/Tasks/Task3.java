package Tasks;

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

}
