package Training1;

import java.util.*;

public class MapTraining2 {

    /*
    2. Подсчёт повторяющихся слов
    Создай строку "apple orange apple banana orange apple".
    Разбей её по словам и с помощью Map<String, Integer> подсчитай, сколько раз встречается каждое слово.
    Ожидаемый результат:

    apple → 3
    orange → 2
    banana → 1
     */

    final String textLine = "apple orange apple banana orange apple";
    LinkedHashMap<Integer,String> setList = new LinkedHashMap<>(); // В нем буду хранить только уникальные значения. так как нужны индексы - создал LinkedHashMap а не мапу
    String[] textContainer; // Пустой контейнер, чтобы я переложил в следующем методе разделенные значения

    public void splitTextLine() { // Код для разделения строки по пробелам в массив
        String[] newTextLine = textLine.split(" ");// Таким образом я получаю массив уже из String
        System.out.println(Arrays.toString(newTextLine));

        textContainer = newTextLine;
    }

//    public void print() { // Для отладки
//        System.out.println(Arrays.toString(textContainer));
//    }


    public void putArrayToMap() { // Перекладываю что есть в массиве в set
        for (int i = 0; i < textContainer.length; i++) {
            setList.put(i,textContainer[i]);
        }
        System.out.println("Сгенерирован Set List из уникальных слов:  " + setList);
    }

    public void countRepeats() {
        Map<String, Integer> listOfRepeats = new HashMap<>();

        for (int i = 0; i < textContainer.length; i++) {
            int oldValue = listOfRepeats.getOrDefault(textContainer[i], 0);
            listOfRepeats.put(textContainer[i], oldValue + 1); // сразу увеличиваем
        }

        System.out.println(listOfRepeats.entrySet());
    }

}
