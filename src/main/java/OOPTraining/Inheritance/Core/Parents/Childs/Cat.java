package OOPTraining.Inheritance.Core.Parents.Childs;

import OOPTraining.Inheritance.Core.Parents.Mammal;

public class Cat extends Mammal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
