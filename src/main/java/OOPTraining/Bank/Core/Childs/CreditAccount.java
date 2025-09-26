package OOPTraining.Bank.Core.Childs;

import OOPTraining.Bank.Core.Account;

public class CreditAccount extends Account {

    public CreditAccount(double balance) {
        super(balance);
    }


    @Override
    public void withdraw(double amount) {
        if (getBalance() < -999) {
            System.out.println("Невозможно снять деньги, Вы итак взяли в долг");
            info();
        } else if (getBalance() <= 0){
            System.out.println("Попытка снять " + amount + " при балансе в " + getBalance());
            System.out.println("Внимание вы уходите в долг!");
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            info();
        } else {
            System.out.println("Вы сняли " + amount);
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            info();
        }

    }
}
