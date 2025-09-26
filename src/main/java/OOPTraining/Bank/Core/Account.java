package OOPTraining.Bank.Core;

public class Account {

    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        System.out.println("Счет пополнен на " + amount);
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        System.out.println("И теперь он составляет: " + getBalance());
    }

    public void info() {
        System.out.println("Состояние баланса: " + getBalance());
    }

    public void withdraw(double amount) {
        System.out.println("Счет уменьшен на " + amount);
        System.out.println("И теперь он составляет: " + getBalance());
    }

}
