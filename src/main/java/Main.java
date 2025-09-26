import OOPTraining.Bank.Core.Account;
import OOPTraining.Bank.Core.Childs.CreditAccount;
import OOPTraining.Bank.Core.Childs.SavingsAccount;
import OOPTraining.InheritanceTask.Core.Parents.Childs.Cat;
import OOPTraining.InheritanceTask.Core.Parents.Childs.Dog;
import OOPTraining.InheritanceTask.Core.Parents.Childs.Eagle;
import OOPTraining.InheritanceTask.Core.Parents.Childs.Snake;
import OOPTraining.InheritanceTask.Core.Zoo;
import OOPTraining.LibraryTask.Core.Book;
import OOPTraining.LibraryTask.Core.Childs.Ebook;
import OOPTraining.LibraryTask.Core.Childs.PrintedBook;

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

//        Product product = new Product("Мыло","Хозтовары", 5,28.99);
//        System.out.println(product.printProductInfo());
//
//        product.setQuantity(10);
//        product.setPricePerUnit(39.99);
//        System.out.println(product.printProductInfo());

//        Worker[] workers = new Worker[2];
//        workers[0] = new Programmer();
//        workers[1] = new Teacher();
//
//        for (Worker worker : workers) {
//            worker.work();
//            System.out.println(worker.getSalary());
//
//        }

//        SeasonsClass seasonsClass = new SeasonsClass();
//        seasonsClass.printMonths();
//        seasonsClass.printTotalNumbers();
//        seasonsClass.changeToLowCase();
//        seasonsClass.changeToLowerCase();
//        seasonsClass.printListOfEnumClass();
//        seasonsClass.changeToLowerCaseListEnum();

//        Strings strings = new Strings();
//        strings.countStrSymbols();
//        strings.isStringEmpty();
//        strings.trimSpaces();
//        strings.setUpperCase();
//        strings.setLowCase();
//        strings.searchIndexOfString();
//        strings.invertSearchIndexOfString();
//        strings.printCharOfIndex();
//        strings.searchString();
//        strings.selectString();

//        strings.task1();
//          strings.task2();
//        strings.task3();
//        strings.task4();
//       strings.task5();
//      strings.task6();
///       strings.task7();
//
//        ifElse cyclesTraining = new ifElse();
//        cyclesTraining.setNumber();
//        cyclesTraining.checkNumber();
//        SwitchCase1 switchCase1 = new SwitchCase1();
//        switchCase1.setFirst();
//        switchCase1.setSecond();
//        switchCase1.setSymbol();
//        switchCase1.letsCalc();
//        ArrayListTraining1 arrayListTraining1 = new ArrayListTraining1();
//        arrayListTraining1.showList();
//        arrayListTraining1.deleteCity();
//        ListTraining2 listTraining2 = new ListTraining2();
//        listTraining2.printUsers();
//        listTraining2.findUser("Olga");
//        listTraining2.addName();
//        ProductsManager productsManager = new ProductsManager();
//        productsManager.addProducts("Грибы");
//        productsManager.addProducts("Мясо");
//        productsManager.addProducts("Картофель");
//        productsManager.removeProduct();
//        productsManager.clearAllList();
//        MapTraining1 mapTraining1 = new MapTraining1();
//        mapTraining1.findPhoneNumber("Olga");
//        mapTraining1.deleteOne("Olga");

//        MapTraining2 mapTraining2 = new MapTraining2();
//        mapTraining2.splitTextLine();
//        mapTraining2.print();
//        mapTraining2.putArrayToMap();
//        mapTraining2.countRepeats();
//        Person person = new Person("Denis", (byte) 10);
//        System.out.println("Возраст: " + person.getAge() + "Имя: " + person.getName());
//        person.setAge((byte) -1);

//        Product product = new Product();
//        product.setPrice(-100);
//        System.out.println(product.getPrice());

//        User user = new User("Denis", "QWERTY");
//        user.checkPass();

//        Counter counter = new Counter();
//        counter.increment();
//        counter.increment();
//        counter.decrement();

//        Zoo zoo = new Zoo();
//        zoo.addAnimal(new Dog("Шарик",3));
//        zoo.addAnimal(new Cat("Мурка",2));
//        zoo.addAnimal(new Eagle("Орел",5));
//        zoo.addAnimal(new Snake("Каа",4));
//
//        zoo.showAll();
//        zoo.makeAllSounds();


//        Ebook[] electronBooks = new Ebook[]{
//                new Ebook("Ыгаха", "Мартынов", 135.84F),
//                new Ebook("Абываха", "Куртудтинов",345.54F)
//        };
//
//        PrintedBook[] printedBooks = new PrintedBook[]{
//                new PrintedBook("Преступление и наказание","Достоевский",560),
//                new PrintedBook("наказание","ДостоЫВСКий",520)
//        };
//
//        System.out.println(electronBooks[0].info());
//        electronBooks[1].download();
//
//        printedBooks[1].readPage(45);
//        System.out.println(printedBooks[0].getPages());


//        SavingsAccount savingsAccount = new SavingsAccount(1000);
//        savingsAccount.withdraw(100);
        CreditAccount creditAccount = new CreditAccount(200);
        creditAccount.withdraw(100);
        creditAccount.withdraw(100);
        creditAccount.withdraw(1000);
        creditAccount.withdraw(1000);
        creditAccount.deposit(10000);




    }

}