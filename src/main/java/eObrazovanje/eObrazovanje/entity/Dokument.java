package eObrazovanje.eObrazovanje.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "dokument")
public class Dokument implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "datum_dokumenta")
    private Date datumDokumenta;

    @Column(name = "naziv")
    private String naziv;

    @Column(name = "sadrzaj")
    private String sadrzaj;

    @Column(name = "putanja")
    private String putanja;
    
    @ManyToOne
    @JoinColumn(name="student_id", referencedColumnName="id")
    private Student student;

    public Dokument() {
    }

    public Dokument(Long id, Date datumDokumenta, String naziv, String sadrzaj, String putanja, Student student) {
        this.id = id;
        this.datumDokumenta = datumDokumenta;
        this.naziv = naziv;
        this.sadrzaj = sadrzaj;
        this.putanja = putanja;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatumDokumenta() {
        return datumDokumenta;
    }

    public void setDatumDokumenta(Date datumDokumenta) {
        this.datumDokumenta = datumDokumenta;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public String getPutanja() {
        return putanja;
    }

    public void setPutanja(String putanja) {
        this.putanja = putanja;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
