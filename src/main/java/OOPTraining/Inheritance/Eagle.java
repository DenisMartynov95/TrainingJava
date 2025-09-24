package OOPTraining.Inheritance;

public class Eagle extends Bird{

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Крик Орла!");
    }
}
