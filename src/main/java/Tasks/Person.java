package Tasks;

import java.util.Scanner;

public class Person {


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
        this.age = age;
    }

    public void CreatePerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: " );
        this.name = scanner.nextLine();

        System.out.println("Введите возвраст: ");
        age = scanner.nextByte();

        System.out.println("Создан пользователь со следующими данными: ");
        System.out.println("Имя: " + name + "Возвраст: " + age);
        System.out.println("  ");
    }

    public void celebrateBirthday() {
        System.out.println(name + "с Днем Рождения!!!");
        setAge((byte) (age + 1));
        System.out.println("Теперь тебе уже: " + age);
        System.out.println("  ");

    }

}
