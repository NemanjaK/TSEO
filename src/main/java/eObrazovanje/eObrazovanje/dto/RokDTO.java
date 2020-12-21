package eObrazovanje.eObrazovanje.dto;

import eObrazovanje.eObrazovanje.entity.Rok;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RokDTO implements Serializable {

    private Long id;
    private String naziv;
    private Set<Ispit> ispiti = new HashSet<>();

    public RokDTO() {
    }

    public RokDTO(Long id, String naziv, Set<Ispit> ispiti) {
        this.id = id;
        this.naziv = naziv;
        this.ispiti = ispiti;
    }

    public RokDTO(Rok rok) {
        this(rok.getId(), rok.getNaziv(), rok.getIspiti());
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
