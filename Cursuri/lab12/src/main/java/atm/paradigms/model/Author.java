package atm.paradigms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;


@Entity
public class Author {
    @Id
    @SequenceGenerator(name = "authorSequence", sequenceName = "hibernate_sequence", allocationSize = 1, initialValue = 50)
    @GeneratedValue(generator = "authorSequence")
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String country;
    @NotNull
    private String city;

    public Author() {
    }

    public Author(String name, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", name=" + name + ", country=" + country + ", city=" + city + "]";
    }
}
