package Task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Поиск дубликатов в массиве
Условие:
Дан массив целых чисел. Вернуть список чисел, которые встречаются в массиве более одного раза. Порядок не важен.
Пример: [4,3,2,7,8,2,3,1] → [2,3].

Подсказка: Используй HashSet для уникальных элементов и второй сет для дубликатов. Или можно посчитать частоту через HashMap.
 */
public class Duplicate {
    public int[] arrNumbers = new int[]{4,3,2,7,8,2,3,1,5,4,0,10};

    public void checkDuplicate() {
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i =0; i < arrNumbers.length;i++) {
            numbers.add(arrNumbers[i]);
            if (numbers.contains(arrNumbers[i])) {
                System.out.println("Дубликат " + arrNumbers[i] + " не добавился");
                duplicates.add(arrNumbers[i]);
            }
        }
        System.out.println(duplicates);

    }




}
