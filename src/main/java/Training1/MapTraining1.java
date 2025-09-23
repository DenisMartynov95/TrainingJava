package Training1;

import java.util.HashMap;
import java.util.Map;

public class MapTraining1 {

    /*
    Создай Map<String, String>, где ключ — это имя, а значение — номер телефона.

    Добавь 5 записей.

    Найди номер по имени.

    Удали одну запись.

    Выведи все оставшиеся пары.
     */

    private final Map<String, String> phoneBook = new HashMap<>();

    public MapTraining1() {
        phoneBook.put("Denis", "11111");
        phoneBook.put("Alex", "22222");
        phoneBook.put("Igor", "33333");
        phoneBook.put("Lena", "44444");
        phoneBook.put("Olga", "55555");
    }


    public void findPhoneNumber(String name) {
        for (Map.Entry<String, String> findResult : phoneBook.entrySet()) {
            if (name.equals(findResult.getKey())) {
                System.out.println("Имя найдено: " + findResult.getValue());
            }
        }
    }

    public void deleteOne(String name) {
        findPhoneNumber(name);
        phoneBook.remove(name);
        System.out.println(phoneBook.entrySet());
    }


}
