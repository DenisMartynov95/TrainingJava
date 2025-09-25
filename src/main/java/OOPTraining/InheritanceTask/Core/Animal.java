package OOPTraining.InheritanceTask.Core;

public class Animal {

    String name;
    int age;

    // Конструктор
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Животное издает звук: ");
    }

    public void eat(){
        System.out.println("Животно ест: " );
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age + "}";
    }

}
