package Tasks;

import java.util.Scanner;

public class Books {

    Scanner scanner = new Scanner(System.in);

    private String author;
    private String title;
    private double price;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Books(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void createBook() {

        System.out.println("Введите автора: ");
        setAuthor(scanner.next());
        if (getAuthor().matches(".*\\d.*") && !getAuthor().isEmpty()) {
            System.out.println("Имя не должно содержать цифры!");
        } else {
            System.out.println("Введено имя: " + getAuthor());

            System.out.println("Введите название книги: ");
            setTitle(scanner.next());

            System.out.println("Введите цену книги: ");
            setPrice(scanner.nextDouble());
            System.out.println("Cоздана книга со следующими параметрами: " + getAuthor() + " " + getTitle()+ " " + getPrice());
        }


    }

    public String giveABook() {
        return "Автор книги: " + getAuthor() + " Название книги: " +getTitle()+ " Цена книги: " +getPrice();
    }


}
