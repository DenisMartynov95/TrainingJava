package OOPTraining.Inheritance;

public class Dog extends Mammal{

    @Override
    public void run() {
        System.out.println("Я быстро бегаю!");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Гав-гав!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ем мясо!");
    }
}
