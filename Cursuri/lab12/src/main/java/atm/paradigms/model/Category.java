package atm.paradigms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Category {
    @Id
    @SequenceGenerator(name = "categorySequence", sequenceName = "hibernate_sequence", allocationSize = 1, initialValue = 50)
    @GeneratedValue(generator = "categorySequence")
    private int id;
    @NotNull
    @Size(max = 25)
    private String description;

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", description=" + description + "]";
    }

}
