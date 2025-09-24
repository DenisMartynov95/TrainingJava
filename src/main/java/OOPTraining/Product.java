package OOPTraining;

public class Product {

    /*
    Задача 2. Класс Product

    Поля: title, price.

    Сделай private.

    Добавь геттеры и сеттеры.

    В сеттере для цены проверяй, чтобы price >= 0.

    Создай продукт и попробуй задать цену -500.
     */

    private String title;
    private long price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if (price >=0) {
            this.price = price;
        } else {
            System.out.println("Цена введена отрицательная!");
        }
    }
}
