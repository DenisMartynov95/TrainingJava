package Task1;

import java.util.*;

/*
Поиск дубликатов в массиве
Условие:
Дан массив целых чисел. Вернуть список чисел, которые встречаются в массиве более одного раза. Порядок не важен.
Пример: [4,3,2,7,8,2,3,1,5,4,0,10] → [2,3].

Подсказка: Используй HashSet для уникальных элементов и второй сет для дубликатов. Или можно посчитать частоту через HashMap.
 */
public class Duplicate {
    public int[] arrNumbers = new int[]{4,3,2,7,8,2,3,1,5,4,0,10,4,5,3,10};

    public void checkDuplicate() {
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();


        for (int i =0; i < arrNumbers.length;i++) {
            if (!numbers.add(arrNumbers[i])) {
                duplicates.add(arrNumbers[i]);
            }
        }
        System.out.println(duplicates);



        Map<Integer, Integer> frequency = new HashMap<>(); // Для подсчета дубликатов
        for (int num : arrNumbers) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        System.out.println("Частота всех чисел: " + frequency);

        // Выводим только те, у которых частота > 1
        System.out.println("Числа с частотой > 1:");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

    }




}
