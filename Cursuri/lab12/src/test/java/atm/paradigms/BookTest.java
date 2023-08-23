package atm.paradigms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import atm.paradigms.model.Author;
import atm.paradigms.model.Book;
import atm.paradigms.model.Category;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BookTest {
    @Inject
    EntityManager em;

    @Inject
    Validator validator;

    private static int categoryId;
    private static int authorId;

    @Test
    public void validateBook(){
        Book book = new Book("Morometzii", "9786069098103", 1024, 70.235F);
        Set<ConstraintViolation<Book>> violations = validator.validate(book);
        assertEquals(3, violations.size());
    }

    @Test
    @Order(1)
    @Transactional
    public void insertBook() {
        Book book = new Book("Morometzii", "9786069098103", 1024, 70.23F);
        Category category = new Category();
        category.setDescription("Literature");
        book.setCategory(category);
        em.persist(category);
        Author author = new Author("Marin Preda", "Romania", "Bucharest");
        book.setAuthor(author);
        em.persist(author);
        em.persist(book);
        categoryId = category.getId();
        System.out.println("CID: " + categoryId);
        authorId = author.getId();
        System.out.println("AID: " + authorId);
        assertNotNull(book.getId());
    }

    @Test
    @Order(2)
    @Transactional
    public void insertOtherBook(){
        Book book = new Book("Viata ca o prada", "9789737883988", 304, 33.98F);
        Category category = em.find(Category.class, categoryId);
        book.setCategory(category);
        Author author = em.find(Author.class, authorId);
        book.setAuthor(author);
        em.persist(book);
        assertNotNull(book.getId());
    }
}
