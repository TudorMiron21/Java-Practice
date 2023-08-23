package atm.paradigms;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;

import atm.paradigms.model.Category;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CategoryTest {
    @Inject
    EntityManager em;


    @Test
    @Transactional
    public void insertCategory(){
        Category category = new Category();
        category.setDescription("TEST");
        em.persist(category);
        assertNotNull(category.getId());
        em.remove(category);

    }
}
