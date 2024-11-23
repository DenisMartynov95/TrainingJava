package BigTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FoodPack {

    private String[] generalFoodPack = new String[] {"№1 Рыба", "№2 Мясо", "№3 Грибы"};
    private Scanner scanner = new Scanner(System.in);
    private int chosenNumber;

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
        return chosenNumber;
    }
    public void setChosenNumber(int chosenNumber) {
        this.chosenNumber = chosenNumber;
    }



    public void printFoodPack() {
        System.out.println("Имеется для выбора: " + Arrays.toString(generalFoodPack));
        System.out.println("Для каждого из-них имеется два подтовара!");
        System.out.println(" ");
    }

    public void printSubFoodPack() {
        HashMap<Integer, String> subFoodPack = new HashMap<>();
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
            chosenNumber = number;
            System.out.println(generalFoodPack[0]);
        } else if (number == 2) {
            chosenNumber = number;
            System.out.println(generalFoodPack[1]);
        } else if (number == 3) {
            chosenNumber = number;
            System.out.println(generalFoodPack[2]);
        } else {
            System.out.println("Число было введенно некорректно - введите новое!");
            System.out.println(" ");
        }
    }

    public void choseSubFood() {


    }



}
