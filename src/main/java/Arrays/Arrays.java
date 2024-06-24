package Arrays;

import java.util.Random;


public class Arrays {

    Random random = new Random();
    /*
    Создам массив
     */
    int[] testArray = new int[10];

    /*
    Заполню его рандомом
     */
    public void fillArray() {
        for (int i = 0; i < testArray.length; i++){
            testArray[i] = random.nextInt(100);
        }
        System.out.println("В этом массиве следующие цифры: " + java.util.Arrays.toString(testArray));
    }

    /*
    Найду максимум
     */
    int max = testArray[0];
    public void maxIndex() {
        for (int i = 0; i < testArray.length; i++) {
            int number = testArray[i];
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }

    /*
    Найду минимум
    */
    public void minIndex() {
        int min = testArray[0];
        for (int i = 0; i < testArray.length; i++) {
            int number = testArray[i];
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }

    /*
    Найду среднее значение
    */
    public void averageIndex() {
        int sum = 0;
        for (int i = 0; i < testArray.length; i++) {
            sum = ++testArray[i];
        }
        System.out.println(sum / 2);
    }

    /*
    Отсортирую массив пузырьком
    */
    public void sortArray() {
        boolean isSorted; // Флаг который указывает на то, отсортирован ли массив
        do {
            isSorted = true; // Предполагаем, что массив отсортирован в начале каждой итерации
            for (int i = 1; i < testArray.length; i++) {
                if (testArray[i] < testArray[i - 1]) {
                    int temp = testArray[i];
                    testArray[i] = testArray[i - 1];
                    testArray[i - 1] = temp;
                    isSorted = false; // Если был обмен, значит массив еще не отсортирован
                }
            }
            System.out.println(java.util.Arrays.toString(testArray));
        } while (!isSorted); // Повторяем до тех пор, пока массив не будет отсортирован
    }



}
