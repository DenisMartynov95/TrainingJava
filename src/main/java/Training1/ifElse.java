package Training1;

import java.util.Scanner;

public class ifElse {

    Scanner scanner = new Scanner(System.in);

    int number;

    public void setNumber() {
        System.out.println("Введите число!");
        number = scanner.nextInt();
    }

    public void checkNumber() {
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }


}
