package OOPTraining.InheritanceTask.Core.Parents.Childs;

import OOPTraining.InheritanceTask.Core.Animal;

public class Snake extends Animal {

    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("ШШШШШ!");
    }


}
