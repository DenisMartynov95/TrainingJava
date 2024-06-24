package Arrays;

import java.util.Arrays;

public class Arrays2 {
    /*
        Поменять знак элемента массива array на противоположный, если значение этого элемента чётное.
                                                                                                        */

    private static int[] array = new int[] {-1,2,3,-4,-5};

    public void printArray() {
        System.out.println("Массив до смены: " + Arrays.toString(array));
    }

    public  void changeIndex () {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp % 2 == 0) {
                array[i] = array[i] * -1;
            }
        }
        System.out.println(Arrays.toString(array));
    }


    /*
        нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
        Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
                                                                                                        */
    private  static int[] firstArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private  static int[] secondArray = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

    //Создам 3 массив
    int[] resultArray = new int[firstArray.length + secondArray.length];

    public void connectedTwoArrays() {
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        System.out.println("Присобачил первый массив: " + Arrays.toString(resultArray));

        for (int j = 0; j < secondArray.length; j++) {
            resultArray[j + firstArray.length] = secondArray[j]; // заполняю только нужные мне ячейки исходя из количества уже заполненные firstArray
        }
        System.out.println("Присобачил второй массив: " + Arrays.toString(resultArray));

    }
}
