package OOPTraining.Inheritance.Core.Parents;

import OOPTraining.Inheritance.Core.Animal;

public class Reptile extends Animal {

    public Reptile(String name, int age) {
        super(name, age);
    }

    public void crawl() {
        System.out.println("Ползу!");
    }

}
