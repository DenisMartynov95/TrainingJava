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

    public void checkPalindrome() {
        // Сначала привожу строку в порядок, удаляю пробелы и делю всю строку строчной
        String lowerCaseText = text.toLowerCase();
        setNewText(lowerCaseText.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println("Текст обрезал все пробелы: " + getNewText());

        // Затем реверсирую строку для сравнения двух строк
        String reversedText = new StringBuilder(getNewText()).reverse().toString();

        // А теперь я сравниваю реверснутую строку с имеющейся строкой
        if (reversedText.equals(getNewText())) {
            System.out.println("Строка - не является палиндромом");
        } else {
            System.out.println("Строка - Палиндром!");
        }
    }



}
