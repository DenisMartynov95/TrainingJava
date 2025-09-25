package OOPTraining.Inheritance.Core.Parents.Childs;

import OOPTraining.Inheritance.Core.Animal;
import OOPTraining.Inheritance.Core.Parents.Mammal;

public class Dog extends Mammal {

    public Dog(String name, int age) {
        super(name, age); // передаём в конструктор Animal
    }

    @Override
    public void run() {
        System.out.println("Я быстро бегаю!");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void eat() {
        System.out.println("Ем мясо!");
    }


}
