package OOPTraining.Inheritance.Core.Parents.Childs;

import OOPTraining.Inheritance.Core.Animal;
import OOPTraining.Inheritance.Core.Parents.Bird;

public class Eagle extends Animal {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Я орел!");
    }

}
