package OOPTraining.InheritanceTask.Core.Parents.Childs;

import OOPTraining.InheritanceTask.Core.Animal;

public class Eagle extends Animal {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Я орел!");
    }

}
