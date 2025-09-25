package OOPTraining.LibraryTask.Core.Childs;

import OOPTraining.LibraryTask.Core.Book;

public class Ebook extends Book {

    private float fileSize;
    public float getFileSize() {
        return fileSize;
    }
    public void setFileSize(float fileSize) {
        this.fileSize = fileSize;
    }


    public Ebook(String title, String author, float fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public void download() {
        System.out.println("Скачиваем книгу " + getTitle() + " Размером " + getFileSize() + " MB");
    }



}
