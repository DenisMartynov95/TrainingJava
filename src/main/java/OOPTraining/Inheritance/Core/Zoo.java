package OOPTraining.Inheritance.Core;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();



    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void showAll(){
        for (int i = 0; i<animals.size();i++) {
            System.out.println(animals.get(i).toString());
        }
    }
    public void makeAllSounds(){
        for (int i = 0; i<animals.size(); i++) {
            animals.get(i).makeSound();
        }
    }
}
