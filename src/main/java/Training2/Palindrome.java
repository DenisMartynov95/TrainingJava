package Training2;

public class Palindrome {

    String text = "A man, a plan, a canal: Panama";

    public void checkPalindrome() {
        String newText = text.toLowerCase().replaceAll("[^a-zA-Z0-9]",""); // Создаю локалную переменную для хранения промежуточного результата
        System.out.println("Текст обрезал все пробелы: " + newText);

        // Затем реверсирую строку для сравнения двух строк
        String reversedText = new StringBuilder(newText).reverse().toString();

        // А теперь я сравниваю реверснутую строку с имеющейся строкой
        if (reversedText.equals(newText)) {
            System.out.println("Строка - Палиндром!");
        } else {
            System.out.println("Строка - не является палиндромом");
        }
    }



}
