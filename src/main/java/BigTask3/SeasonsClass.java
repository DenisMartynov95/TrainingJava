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

    // Первая реализация метода
    public void changeToLowCase() {
        String monthsName = "";
        for (int i = 1; i != Months.values().length; i++) {
            monthsName = Arrays.toString(Months.values());
        }
        System.out.println(monthsName.toLowerCase());
    }

    // Вторая реализация предыдущего метода при помощи создания массива и заполнения его значениями из enum
    public void changeToLowerCase() {
        // Создаем массив размером = количеству элементов в enum
        String[] newNameForMonths = new String[Months.values().length];
        String monthName;
        // Так как используется Foreach - создаю переменную для отсчета i, чтобы можно было оперировать итерациями
        int i = 0;
        // Ну и создаю переменную month и помещаю в нее строки из enum-класса, а затем помещаю эти строки в массив
        for (Months month : Months.values()) {
            newNameForMonths[i] = month.name();
            i++;
        }
        System.out.println(Arrays.toString(newNameForMonths));


    }

}
