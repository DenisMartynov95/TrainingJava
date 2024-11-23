package BigTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FoodPack {

    private String[] generalFoodPack = new String[] {"№1 Рыба", "№2 Мясо", "№3 Грибы"};
    HashMap<Integer, String> subFoodPack = new HashMap<>();

    private Scanner scanner = new Scanner(System.in);
    private int chosenNumberGeneralFood;
    private int chosenNumberSubFood;


    public String[] getGeneralFoodPack() {
        return generalFoodPack;
    }
    public void setGeneralFoodPack(String[] generalFoodPack) {
        this.generalFoodPack = generalFoodPack;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public int getChosenNumber() {
        return chosenNumberGeneralFood;
    }
    public void setChosenNumber(int chosenNumber) {
        this.chosenNumberGeneralFood = chosenNumber;
    }



    public void printFoodPack() {
        System.out.println("Имеется для выбора: " + Arrays.toString(generalFoodPack));
        System.out.println("Для каждого из-них имеется два подтовара!");
        System.out.println(" ");
    }

    public void printSubFoodPack() {
        subFoodPack.put(1, "Путасу");
        subFoodPack.put(2, "Щука");
        subFoodPack.put(3, "Оленина");
        subFoodPack.put(4, "Говядина");
        subFoodPack.put(5, "Шампиньоны");
        subFoodPack.put(6, "Белый гриб");
        System.out.println(subFoodPack.values());
        System.out.println(" ");
    }

    public void choseFoodPack() {
        int[] choseGeneralFoodPack = new int[3];
        System.out.println("Введите число от 1 до 3 для выбора: ");
        int number = scanner.nextInt();
        if (number == 1) {
            chosenNumberGeneralFood = number;
            System.out.println(generalFoodPack[0]);
        } else if (number == 2) {
            chosenNumberGeneralFood = number;
            System.out.println(generalFoodPack[1]);
        } else if (number == 3) {
            chosenNumberGeneralFood = number;
            System.out.println(generalFoodPack[2]);
        } else {
            System.out.println("Число было введенно некорректно - введите новое!");
        }
        System.out.println(" ");
    }

    public void choseSubFood() {
        System.out.println("Выберите подпродукт из двух вариантов: ");

        int number = chosenNumberGeneralFood; // Используем уже выбранный общий продукт
        if (number == 1) {
            System.out.println("1 - " + subFoodPack.get(1));
            System.out.println("2 - " + subFoodPack.get(2));
        } else if (number == 2) {
            System.out.println("1 - " + subFoodPack.get(3));
            System.out.println("2 - " + subFoodPack.get(4));
        } else if (number == 3) {
            System.out.println("1 - " + subFoodPack.get(5));
            System.out.println("2 - " + subFoodPack.get(6));
        } else {
            System.out.println("Ошибка! Общий продукт не выбран.");
            return;
        }

        System.out.println("Введите 1 или 2: ");
        int choseSubFood = scanner.nextInt();

        if (number == 1) {
            if (choseSubFood == 1) {
                System.out.println("Вы выбрали: " + subFoodPack.get(1));
            } else if (choseSubFood == 2) {
                System.out.println("Вы выбрали: " + subFoodPack.get(2));
            } else {
                System.out.println("Некорректный выбор!");
            }
        } else if (number == 2) {
            if (choseSubFood == 1) {
                System.out.println("Вы выбрали: " + subFoodPack.get(3));
            } else if (choseSubFood == 2) {
                System.out.println("Вы выбрали: " + subFoodPack.get(4));
            } else {
                System.out.println("Некорректный выбор!");
            }
        } else if (number == 3) {
            if (choseSubFood == 1) {
                System.out.println("Вы выбрали: " + subFoodPack.get(5));
            } else if (choseSubFood == 2) {
                System.out.println("Вы выбрали: " + subFoodPack.get(6));
            } else {
                System.out.println("Некорректный выбор!");
            }
        }
    }


    }



}
