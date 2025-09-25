package OOPTraining.Inheritance.Core.Parents.Childs;

import OOPTraining.Inheritance.Core.Animal;
import OOPTraining.Inheritance.Core.Parents.Reptile;

public class Snake extends Animal {

    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("ШШШШШ!");
    }


}
