package OOPTraining.LibraryTask.Core.Childs;

import OOPTraining.LibraryTask.Core.Book;

public class PrintedBook extends Book {

    private int pages;

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }


    public PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }


    public void readPage(int page) {
        System.out.println("Читаем страницу " + page + " из " + getPages());
    }
}
