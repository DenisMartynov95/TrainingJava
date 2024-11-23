package BigTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FoodPack {

    private String[] generalFoodPack = new String[] {"Рыба", "Мясо", "Грибы"};
    HashMap<Integer, String> subFoodPack = new HashMap<>();

    private Scanner scanner = new Scanner(System.in);
    private int chosenNumberGeneralFood; // Хранение выбранного Главного продукта для его использования в условиях кода

    // Переменные для вывода выбранного Главного и Подпродукта
    private String nameGeneralFood = generalFoodPack[1];
    private String nameSubFood;

                                    /*
                                     ГЕТТЕРЫ И СЕТТЕРЫ
                                                           */
                                    public String getNameSubFood() {
                                        return nameSubFood;
                                    }

                                    public void setNameSubFood(String nameSubFood) {
                                        this.nameSubFood = nameSubFood;
                                    }
                                    public String getNameGeneralFood() {
                                        return nameGeneralFood;
                                    }

                                    public void setNameGeneralFood(String nameGeneralFood) {
                                        this.nameGeneralFood = nameGeneralFood;
                                    }
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


    // Метод для вывода список главных продуктов
    public void printFoodPack() {
        System.out.println("Имеется для выбора: " + Arrays.toString(generalFoodPack));
        System.out.println("Для каждого из-них имеется два подтовара!");
        System.out.println(" ");
    }

    // Метод для вывода список подпродуктов
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

    // Метод выбора Главного продукта (тут же используется переменная chosenNumberGeneralFood для работы с последующим методом
    public void choseFoodPack() {
        int[] choseGeneralFoodPack = new int[3];
        System.out.println("Введите число от 1 до 3 для выбора: ");
        int number = scanner.nextInt();
        if (number == 1) {
            chosenNumberGeneralFood = number;
            nameGeneralFood = generalFoodPack[0];
            System.out.println(generalFoodPack[0]);
        } else if (number == 2) {
            chosenNumberGeneralFood = number;
            nameGeneralFood = generalFoodPack[1];
            System.out.println(generalFoodPack[1]);
        } else if (number == 3) {
            chosenNumberGeneralFood = number;
            nameGeneralFood = generalFoodPack[2];
            System.out.println(generalFoodPack[2]);
        } else {
            System.out.println("Число было введенно некорректно - введите новое!");
            scanner.next(); // Очистка ввода
        }
        System.out.println(" ");
    }

    // Метод для выбора Подпродукта, основываясь на выбранном раннее Главном продукте
    public void choseSubFood() {
        try {
            // Проверяем, был ли выбран главный продукт
            if (chosenNumberGeneralFood <= 0 || chosenNumberGeneralFood > generalFoodPack.length) {
                throw new IllegalStateException("Ошибка! Сначала выберите главный продукт.");
            }

            System.out.println("Выберите подпродукт из двух вариантов:");

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
            }

            System.out.println("Введите 1 или 2: ");
            int choseSubFood = scanner.nextInt();

            if (number == 1) {
                if (choseSubFood == 1) {
                    System.out.println("Вы выбрали: " + subFoodPack.get(1));
                    nameSubFood = subFoodPack.get(1);
                } else if (choseSubFood == 2) {
                    System.out.println("Вы выбрали: " + subFoodPack.get(2));
                    nameSubFood = subFoodPack.get(2);
                } else {
                    throw new IllegalArgumentException("Некорректный выбор!");
                }
            } else if (number == 2) {
                if (choseSubFood == 1) {
                    System.out.println("Вы выбрали: " + subFoodPack.get(3));
                    nameSubFood = subFoodPack.get(3);
                } else if (choseSubFood == 2) {
                    System.out.println("Вы выбрали: " + subFoodPack.get(4));
                    nameSubFood = subFoodPack.get(4);
                } else {
                    throw new IllegalArgumentException("Некорректный выбор!");
                }
            } else if (number == 3) {
                if (choseSubFood == 1) {
                    System.out.println("Вы выбрали: " + subFoodPack.get(5));
                    nameSubFood = subFoodPack.get(5);
                } else if (choseSubFood == 2) {
                    System.out.println("Вы выбрали: " + subFoodPack.get(6));
                    nameSubFood = subFoodPack.get(6);
                } else {
                    throw new IllegalArgumentException("Некорректный выбор!");
                }
            }
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка! Убедитесь, что вводите корректные данные.");
            scanner.next(); // Очистил ввод, чтобы избежать зацикливания
        }
        System.out.println(" ");
    }

    // Вывод выбранных продуктов
    public void getChosenFood() {
        boolean generalFoodFlag = false;
        boolean subFoodFlag = false;
        if (nameGeneralFood == null) {
            generalFoodFlag = true;
            System.out.println("Простите, но вы выбрали некорректный товар, выберите заново!");
            System.out.println("Вы ошиблись в выборе главного продукта");
        } else if (nameSubFood == null) {
            subFoodFlag = true;
            System.out.println("Простите, но вы выбрали некорректный товар, выберите заново!");
            System.out.println("Вы ошиблись в выборе  подпродукта");
        } else if (nameGeneralFood == null && nameSubFood == null) {
            System.out.println("Простите, но вы выбрали некорректный товар, выберите заново!");
        } else {
            System.out.println("Вы выбрали:" + nameGeneralFood + " - " + nameSubFood);
        }
    }

}

