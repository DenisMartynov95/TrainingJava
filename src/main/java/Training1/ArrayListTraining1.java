package Training1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTraining1 {

    /*
    Создай список городов
Добавь 5 городов.
Выведи их через цикл for.
Удали один город и снова выведи список.
     */

    Scanner scanner = new Scanner(System.in);

    // Делаем cities полем класса, а не локальной переменной, так как у меня список постоянно пересоздавался и изменения не были видны
    private final ArrayList<String> cities = new ArrayList<>();
    // Конструктор для заполнения списка при создании объекта
    public ArrayListTraining1() {
        cities.add("Москва");
        cities.add("Казань");
        cities.add("Piter");
        cities.add("Kirov");
        cities.add("Minsk");
    }


    public void showList() {
        for (int i = 0; i < cities.size(); i++) {
            System.out.println((i + 1) + ". " + cities.get(i));
        }
    }

    public void deleteCity() {
        int checkCities = cities.size();
        System.out.println("Доступно столько индексов!   " + checkCities);

        System.out.println("Выберите индекс города");
        int selectNumber = scanner.nextInt();
        if (selectNumber > cities.size() || selectNumber == 0) {
            System.out.println("Вы ввели некорректный индекс");
        } else {
            System.out.println("Город:" + cities.get(selectNumber -1) + " будет удален!"); // Индексация в листе с НУЛЯ

            String findKey = cities.get(selectNumber -1); // Индексация в листе с НУЛЯ
            cities.remove(findKey);

            System.out.println("Вот новый список городов");
            for (String newCitiesList : cities) {
                System.out.println(newCitiesList);
            }
        }


    }


}
