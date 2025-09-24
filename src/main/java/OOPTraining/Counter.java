package OOPTraining;

public class Counter {

    /*
    Создай класс Counter:

    Приватное поле value.

    Метод increment() увеличивает value, но максимум до 100.

    Метод decrement() уменьшает value, но минимум до 0.

    Геттер для value.

    👉 Попробуй протестировать: довести счётчик до 100 и вызвать increment() ещё раз.
     */

    private int value = 0;

    public void increment() {
        if (value <=99) {
            value = value + 50;
            System.out.println("Значение увеличилось: " + value);
        } else {
            System.out.println("Цифра достигла максимума: " + value);
        }
    }

    public void decrement()  {
        if (value > 100) {
            value = value - 50;
            System.out.println("Значение уменьшилось: " + value);
        } else if (value <=0){
            System.out.println("Цифра достигла минимума: " + value);
        }
    }



}
