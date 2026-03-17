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

//        public static void setCatsCount(int catsCount) {
//            Cat.catsCount = catsCount;
//        }

//        public static void addNewCat() {
//            //написать тут ваш код
//            setCatsCount(catsCount + 1);
//        }


        /*
        Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
         */
        public static int setCatsCount(int catsCount) {
            //написать тут ваш код
            Cat.catsCount = catsCount; // Ведь переменная статичная надо обращаться к КЛАССУ и менять значение у КЛАССА, а не у метода
            return catsCount;
        }

                /*
                Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String fullName равное значению
                 локальной переменной String fullName.
                 */

        private String fullName;

        public void setFullName(String fullName) { // #1 Добавлю СиГ для fullName
            this.fullName = fullName;
        }
        public String getFullName() {
            return fullName;
        }



        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            //написать тут ваш код
            setFullName(fullName); // #2 Реализую решение
        }



}
