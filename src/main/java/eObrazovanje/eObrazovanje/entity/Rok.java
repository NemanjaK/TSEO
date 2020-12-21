package eObrazovanje.eObrazovanje.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rok")
public class Rok implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "naziv")
    private String naziv;

    @ManyToMany
    @JoinTable(name = "rok_ispit", joinColumns = @JoinColumn(name = "rok_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ispit_id", referencedColumnName = "id"))
    private Set<Ispit> ispiti = new HashSet<>();

    public Rok() {
    }

    public Rok(Long id, String naziv, Set<Ispit> ispiti) {
        this.id = id;
        this.naziv = naziv;
        this.ispiti = ispiti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Set<Ispit> getIspiti() {
        return ispiti;
    }

    public void setIspiti(Set<Ispit> ispiti) {
        this.ispiti = ispiti;
    }
}
