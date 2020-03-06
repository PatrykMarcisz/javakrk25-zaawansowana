package zajecia.streams.book;

import java.util.List;

public class Book {
    private Author author;
    private List<BookType> type;
    private String tittle;
    private int price;
    private int pages;

    public Book(Author author, List<BookType> type, String tittle, int price, int pages) {
        this.author = author;
        this.type = type;
        this.tittle = tittle;
        this.price = price;
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<BookType> getType() {
        return type;
    }

    public void setType(List<BookType> type) {
        this.type = type;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
