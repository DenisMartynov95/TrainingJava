package Tasks;

import java.util.Scanner;

public class Task3 {


    Scanner scanner = new Scanner(System.in);

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

}
