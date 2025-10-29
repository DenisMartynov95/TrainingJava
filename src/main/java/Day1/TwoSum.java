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
        System.out.println(target);


        do {
            sum = numbers[random.nextInt(10) + random.nextInt(10)];
            System.out.println("Cумма перебора = " + sum);
        }
        while (sum == target) {
            int pastNumber = numbers[i];
            if (numbers[i] + pastNumber == target) {
                System.out.println(numbers[i] + pastNumber);
            }
        }


    }






}
