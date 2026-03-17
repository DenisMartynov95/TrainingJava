package JavaRushTasks.Level4;

public class Cat {

    /*
    Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name
    равное переданному параметру String name.
     */

    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        //написать тут ваш код
        this.name = name;
        }

        /*
        Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1.
        За количество котов отвечает переменная catsCount.
         */

        private static int catsCount = 0;
        public static int getCatsCount() {
            return catsCount;
        }

        public static void setCatsCount(int catsCount) {
            Cat.catsCount = catsCount;
        }

        public static void addNewCat() {
            //написать тут ваш код
            setCatsCount(catsCount + 1);
        }




}
