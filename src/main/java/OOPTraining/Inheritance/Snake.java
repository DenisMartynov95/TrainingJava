package OOPTraining.Inheritance;

public class Snake extends Reptile{

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Shhhhh");
    }
}
