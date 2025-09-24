package OOPTraining;

public class Person  {

    /*
    Задача 1. Класс Person

    Поля: name, age (оба приватные).

    Конструктор для инициализации.

    Геттеры для чтения.

    Сеттер для age, который не позволяет поставить отрицательный возраст.

    Создай 2 объекта и попробуй «сломать» объект (например, age = -10).
     */

    private String name;
    private byte age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age <= 0) {
            System.out.println("Введен некорректный возраст");
        }
        else {
            this.age = age;
        }
    }

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }


}
