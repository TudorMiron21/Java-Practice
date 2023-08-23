package atm.paradigms;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;

import atm.paradigms.model.Author;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class AuthorTest {
    @Inject
    EntityManager em;

    @Test
    @Transactional
    public void insertAuthor(){
        Author author = new Author("Marin Preda", "Romania", "Bucharest");
        em.persist(author);
        assertNotNull(author.getId());
        em.remove(author);
    }
}
