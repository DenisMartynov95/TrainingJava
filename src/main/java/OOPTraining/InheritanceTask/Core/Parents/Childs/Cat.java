package OOPTraining.InheritanceTask.Core.Parents.Childs;

import OOPTraining.InheritanceTask.Core.Parents.Mammal;

public class Cat extends Mammal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
