package web.model;

import javax.persistence.*;


@Entity
@Table(name = "lenguages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lenguages")
    @ManyToMany
    private String lenguage;

    public Language() {}

    public Language(String lenguage) {
        this.lenguage = lenguage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", lenguage='" + lenguage + '\'' +
                '}';
    }
}
