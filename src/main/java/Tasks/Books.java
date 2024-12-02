package Tasks;

public class Books {

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

    public String giveABook() {
        return "Автор книги: " + getAuthor() + " Название книги: " +getTitle()+ " Цена книги: " +getPrice();
    }


}
