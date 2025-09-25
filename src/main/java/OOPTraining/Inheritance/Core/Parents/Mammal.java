package OOPTraining.Inheritance.Core.Parents;

import OOPTraining.Inheritance.Core.Animal;

public class Mammal extends Animal {

    public Mammal(String name, int age) {
        super(name, age);
    }

    public void run() {
        System.out.println("Млекопитающее бежит");
    }


}
