package BigTask2;

import java.util.Scanner;

public class Programmer extends Person implements Worker {


    @Override
    public void setCurrency(String currency) {
        super.setCurrency(currency);
    }

    @Override
    public void work() {
        System.out.println("Я программист!");
    }

    @Override
    public String getSalary() {
        return "Моя зарплата: " + 4000 + getCurrency();
    }




}
