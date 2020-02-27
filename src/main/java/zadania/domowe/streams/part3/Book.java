package zadania.domowe.streams.part3;

import java.util.List;

public class Book {

    private final Author author;
    private final String title;
    private final List<BookType> type;
    private final long pages;
    private long price;

    public Book(Author author, String title, List<BookType> type, long pages, long price) {
        this.author = author;
        this.title = title;
        this.type = type;
        this.pages = pages;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public List<BookType> getType() {
        return type;
    }

    public long getPages() {
        return pages;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
