package Tasks;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    Random random = new Random();

    static int[] array = new int[5];

    public void fillArray() {
        String methodName = "Fill Array";
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(100);
            array[i] = randomNum;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Работа метода " + methodName + " закончена");
        System.out.println("______________________________");
        System.out.println(" ");
    }

    public void replaceNumberIfNumberMore50() {
        String methodName = "Replace Number If Number More 50";
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 50) {
                int randomNum = random.nextInt(49);
                array[i] = randomNum;
            } else {
                System.out.println("Число не заменялось, ведь оно: " + array[i]);
            }
        }
        System.out.println("Итоговый массив: " + Arrays.toString(array));
        System.out.println("Работа метода " + methodName + " закончена");
        System.out.println("______________________________");
        System.out.println(" ");
    }

    public void pickMax() {
        String methodName = "Pick Max";
        int temp = array[0];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i == array.length; i++) {
            if(temp < array[i]) {
                temp = array[i];
            }
        }
        System.out.println(temp);
        System.out.println("Работа метода " + methodName + " закончена");
        System.out.println("______________________________");
        System.out.println(" ");

    }

}
