package Training1;

import java.util.Scanner;

public class SwitchCase1 {

    Scanner scanner = new Scanner(System.in);

    int firstNumber;
    int secondNumber;
    String symbol;


    public void setFirst() {
        System.out.println("Введите первое число:");
        firstNumber = scanner.nextInt();
    }

    public void setSecond() {
        System.out.println("Введите второе число:");
        secondNumber = scanner.nextInt();
    }

    public void setSymbol() {
        System.out.println("Введите символ: ");
        symbol = scanner.next();
    }

    public void letsCalc() {
        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
            switch (symbol) {
                case "+" :
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "-" :
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "*" :
                    System.out.println(firstNumber * secondNumber);
                    break;
                case "/":
                    if (secondNumber == 0 || firstNumber ==0) {
                        System.out.println("Ошибка деления на ноль");
                    } else {
                        System.out.println(firstNumber / secondNumber);
                    }
                    break;
                default:
                    System.out.println("Символ некорректный, введите + - * /");
            }
        }
    }


}
