package OOPTraining.Inheritance;

public class Cat extends  Mammal{

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Мяу!");
    }
}
