package Tasks;

import java.util.Random;

public class Task2 {
    Random random = new Random();

    public void getNumber() {
        long randomNumber;

        do {
            randomNumber = random.nextInt(100);
            System.out.println("Генерирую число " + randomNumber);

            if (randomNumber >= 10 && randomNumber <=20) {
                System.out.println("_______________________________________________");
                System.out.println(" ");
                System.out.println("Условие выполнено!" + randomNumber);
                break;
            } else {
                System.out.println("Условие не выполнено, пробую заново!");
            }
        } while (true);
        System.out.println("Условие выполнено! Финальное число: " + randomNumber + " цикл завершен!");

    }
}