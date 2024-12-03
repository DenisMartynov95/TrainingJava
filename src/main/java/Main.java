import Arrays.Arrays;
import Arrays.Arrays2;
import BigTask.FoodPack;
import Tasks.Books;
import Tasks.Product;
import Tasks.Task2;
import Tasks.Task3;

public class Main {
    public static void main(String[] args) {

        /*
         Arrays
                */
//        Arrays arrays = new Arrays();
//        arrays.fillArray();
//        arrays.maxIndex();
//        arrays.minIndex();
//        arrays.averageIndex();
//        arrays.sortArray();

        /*
         Arrays2
                */

//        Arrays2 arrays = new Arrays2();
//        arrays.printArray();
//        arrays.changeIndex();
//
//        arrays.connectedTwoArrays();

//        Task1 task1 = new Task1();
//        task1.fillArray();
//        task1.replaceNumberIfNumberMore50();
//        task1.pickMax();
//
//
//        Person person = new Person();
//        person.CreatePerson();
//        person.celebrateBirthday();

//        Task2 task2 = new Task2();
//        task2.getNumber();
//        Task3 task3 = new Task3();
//        task3.checkNumbers();
//        task3.checkLastNumber();
//          task3.checkEven();
//        task3.compareNumbers();
//        task3.isPositive();
//        task3.printSpeedWarning(91);
//        task3.processTrafficLightSignal();

//        FoodPack foodPack = new FoodPack();
//        foodPack.printFoodPack();
//        foodPack.printSubFoodPack();
//        foodPack.choseFoodPack();
//        foodPack.choseSubFood();
//        foodPack.getChosenFood();

//        Books books = new Books("Денис", "Как стать автоматизатором", 365.65);
//        System.out.println(books.giveABook());
//
//        books.setAuthor("Денис Мартынов");
//        books.setPrice(999.99);
//        System.out.println(books.giveABook());
//
//        books.createBook();

        Product product = new Product("Мыло","Хозтовары", 5,28.99);
        System.out.println(product.printProductInfo());

        product.setQuantity(10);
        product.setPricePerUnit(39.99);
        System.out.println(product.printProductInfo());

    }
}