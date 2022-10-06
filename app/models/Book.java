package models;

import play.data.validation.Constraints;

import javax.validation.Constraint;
import java.util.HashSet;
import java.util.Set;

public class Book {

    @Constraints.Required
    public Integer id;
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Constraints.MinLength(5)
    public String title;
    @Constraints.Required
    @Constraints.Min(5)
    @Constraints.Max(100)
    public Integer price;
    @Constraints.Required
    public String author;
    public static Set<Book> books;

    public Book() {}

    public Book(Integer id, String title, Integer price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    static {
        books = new HashSet<>();
        books.add(new Book(1, "C++", 20, "GIN"));
        books.add(new Book(2, "Java", 30, "GURA"));
        books.add(new Book(3, "PHP", 25, "GAWR"));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static Set<Book> allBooks() {
        return books;
    }

    public static Book findById(Integer id) {
        for (Book b : books) {
            if (b.id.equals(id)) {
                return b;
            }
        }

        return null;
    }

    public static void add(Book b) {
        books.add(b);
    }

    public static boolean remove(Book b) {
        return books.remove(b);
    }
}
