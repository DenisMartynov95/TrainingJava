package OOPTraining.Bank.Core.Childs;

import OOPTraining.Bank.Core.Account;

public class SavingsAccount extends Account {


    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() < 100) {
            System.out.println("Невозможно снять деньги, Баланс не может быть меньше 100 ");
            info();
        } else {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println("Вы сняли " + amount);
            info();
        }

    }
}
