package JavaRushTasks.Level4;

import java.util.Scanner;

public class Cycles {

            /*
            Рисуем прямоугольник

            Ввести с клавиатуры два числа m и n.
            Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

            Пример: m=2, n=4
            8888
            8888
             */

    static Scanner scanner = new Scanner(System.in);

    static private int m;
    static private int n;
    public static void enterNumbers() {
        System.out.println("Введите переменную m: ");
        m = scanner.nextInt();
        System.out.println("Введите переменную n: ");
        n = scanner.nextInt();

        System.out.println("Введены переменные m:" + m + " n:" + n);
    }

    public void printFigure() {
        for (int i = 0; i < n; i++) {
            System.out.print("8");
        }
        for (int i = 0; i < m; i++) {
            System.out.println("8");
        }


    }

}
