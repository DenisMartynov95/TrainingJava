package BigTask3;

import java.util.Arrays;

public class SeasonsClass {

    public void printMonths() {
        for (Object months : Months.values()) {
            System.out.println(months);
        }
    }

    public void printTotalNumbers() {
        int totalCounts = 0;
        for (Object months : Months.values()) {
            totalCounts++;
        }
        System.out.println("Количество найденных месяцев: " + totalCounts);
    }

    public void changeToLowCase() {
        String monthsName = "";
        for (int i = 1; i != Months.values().length; i++) {
            monthsName = Arrays.toString(Months.values());
        }
        System.out.println(monthsName.toLowerCase());
    }

    // Вторая реализация предыдущего метода
    public void changeToLowerCase() {
        String[] newNameForMonths = new String[11];

    }

}
