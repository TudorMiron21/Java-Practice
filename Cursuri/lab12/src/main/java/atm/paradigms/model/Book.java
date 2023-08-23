package atm.paradigms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
public class Book {
    @Id
    @SequenceGenerator(name = "bookSequence", sequenceName = "hibernate_sequence", allocationSize = 1, initialValue = 50)
    @GeneratedValue(generator = "bookSequence")
    private int id;
    @NotNull
    private String name;
    @NotNull
    @Size(max = 15)
    private String isbn;
    @NotNull
    @OneToOne
    @JoinColumn(name = "cat_fk")
    private Category category;
    @NotNull
    @OneToOne
    @JoinColumn(name = "aut_fk")
    private Author author;
    @NotNull
    @Positive
    private int no_page;
    @Digits(integer = 4, fraction = 2)
    private float price;

    public Book() {
    }

    public Book(@NotNull String name, @NotNull @Size(max = 15) String isbn, @NotNull @Positive int no_page,
            @Digits(integer = 4, fraction = 2) float price) {
        this.name = name;
        this.isbn = isbn;
        this.no_page = no_page;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNo_page() {
        return no_page;
    }

    public void setNo_page(int no_page) {
        this.no_page = no_page;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", isbn=" + isbn + ", category=" + category + ", author=" + author
                + ", no_page=" + no_page + ", price=" + price + "]";
    }

}
