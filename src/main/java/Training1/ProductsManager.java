package Training1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductsManager {

    /*
    Создай класс ProductsManager:

    Список products типа ArrayList<String>.

    Метод addProduct(String name) — добавляет товар.

    Метод removeProduct(String name) — удаляет товар, если он есть.

    Метод clearAll() — очищает список.

    В main() создай объект ProductsManager и выполни последовательность:

    Добавь 3 товара.

    Удали один из них.

    Выведи оставшиеся.

    Очисти список и выведи сообщение "Список пуст: true/false" (используя isEmpty()).
     */

    private final ArrayList<String> products = new ArrayList<>();
    public ProductsManager() {}

    public void addProducts(String name) {
        int indexes = products.size();
        products.add(indexes,name);
        System.out.println(products);
    }

    int numberProduct = 0;
    public void removeProduct() {
        System.out.println("В корзине есть следующие товары: " );
        for (int i = 0; i < products.size(); i++) {
            numberProduct = i+1; // Нумерую объекты в корзине
            System.out.println(numberProduct + products.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите какой продукт нужно удалить: ");
        int chooseIndex = scanner.nextInt();
        products.remove(chooseIndex -1); // Ведь нумерация с НУЛЯ в листе
        System.out.println(products);
    }


    public void clearAllList() {
        products.clear();
        System.out.println(products);
    }


}
