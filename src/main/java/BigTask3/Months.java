package BigTask3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Months {
    JANUARY,
    FEBRUARY,
    MART,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    // Создаю методы, чтобы использовать их в других классах

    public static List<Months> asList() {
        ArrayList<Months> list = new ArrayList<Months>();
        Collections.addAll(list, Months.values());
        return list;
    }




}
