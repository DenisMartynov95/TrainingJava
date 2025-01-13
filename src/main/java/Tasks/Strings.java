package Tasks;

public class Strings {
    // Изучение методов у строк
    private String str = "Test";
    private String str2 = "Hello world!";
    private String str3 = "Hello my name is Denis";
    private String str4 = "I am QA + AQA";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr4() {
        return str4;
    }

    public void setStr4(String str4) {
        this.str4 = str4;
    }

    //Посчитать кол-во символов
    public void countStrSymbols() {
        System.out.println("В этой строке: " + getStr().length() + " символов!");
    }
    //Проверяю пустая ли строка



}
