package Day1;


/*
    Учитывая массив целых чисел nums и целочисленную цель, верните индексы двух чисел таким образом, чтобы они в сумме давали цель.

    Вы можете предположить, что у каждого входного сигнала будет ровно одно решение, и вы не сможете использовать один и тот же элемент дважды.

    Вы можете вернуть ответ в любом порядке.
 */

import java.util.Random;
import java.util.Scanner;

public class TwoSum {

    Scanner scanner = new Scanner(System.in);
    int target = scanner.nextInt();
    int sum;
    Random random = new Random();


    public int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};

    public void printNumber() {
        System.out.println("Вы ввели "  + target);
    }

    public void returnElements() {
        do {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            sum = number1 + number2;

            if (sum == target) {
                System.out.println("Cумма перебора = " + sum);
                System.out.println(number1 + number2);
            }
        } while (sum != target);
        }


}

