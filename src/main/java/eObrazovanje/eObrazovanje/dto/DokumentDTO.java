package eObrazovanje.eObrazovanje.dto;

import eObrazovanje.eObrazovanje.entity.Student;

import java.io.Serializable;
import java.util.Date;

public class DokumentDTO implements Serializable {

    private Long id;
    private Date datumDokumenta;
    private String naziv;
    private String sadrzaj;
    private String putanja;
    private Student student;

    public DokumentDTO() {
    }

    public DokumentDTO(Long id, Date datumDokumenta, String naziv, String sadrzaj, String putanja, Student student) {
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
