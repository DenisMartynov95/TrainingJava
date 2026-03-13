package Training2;

public class Palindrome {

    String text = "A man, a plan, a canal: Panama";

    private static String newText;

    public  String getNewText() {
        return newText;
    }

    public  void setNewText(String newText) {
        Palindrome.newText = newText;
    }

    public void deleteSpaces() {
        String lowerCaseText = text.toLowerCase();
        setNewText(lowerCaseText.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println("Текст обрезал все пробелы: " + getNewText());
    }

    //Чтобы реверсануть текст - нужен стринг билдэр
    public String reverseText() {
        return new StringBuilder(getNewText()).reverse().toString();
    }

    public void checkPalindrome() {
        // А теперь я сравниваю реверснутую в прошлом методе строку с имеющейся строкой
        if (reverseText().equals(getNewText())) {
            System.out.println("Строка - Палиндром!");
        } else {
            System.out.println("Строка - не является палиндромом");
        }


    }

}
