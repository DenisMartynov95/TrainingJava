package Training1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    String[] textContainer; // Пустой контейнер, чтобы я переложил в следующем методе разделенные значения

    public void splitTextLine() { // Код для разделения строки по пробелам в массив
        String[] newTextLine = textLine.split(" ");// Таким образом я получаю массив уже из String
        System.out.println(Arrays.toString(newTextLine));

        textContainer = newTextLine;
    }

    public void print() {
        System.out.println(Arrays.toString(textContainer));
    }

    public void converterToMap() {
        Map<String, Integer> mapList = new HashMap<>();


    }
}
