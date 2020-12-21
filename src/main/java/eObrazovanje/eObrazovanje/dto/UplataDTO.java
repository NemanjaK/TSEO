package eObrazovanje.eObrazovanje.dto;

import eObrazovanje.eObrazovanje.entity.Rok;
import eObrazovanje.eObrazovanje.entity.Student;
import eObrazovanje.eObrazovanje.entity.Uplata;

import java.io.Serializable;
import java.util.Date;

public class UplataDTO implements Serializable {

    private Long id;
    private Date datum;
    private Double iznos;
    private String racunPrimaoca;
    private String pozivNaBroj;
    private String svrhaUplate;
    private Student student;

    public UplataDTO() {
    }

    public UplataDTO(Uplata uplata) {
        this(uplata.getId(), uplata.getDatum(), uplata.getIznos(), uplata.getRacunPrimaoca(), uplata.getPozivNaBroj(), uplata.getSvrhaUplate(), uplata.getStudent());
    }

    public UplataDTO(Long id, Date datum, Double iznos, String racunPrimaoca, String pozivNaBroj, String svrhaUplate, Student student) {
        this.id = id;
        this.datum = datum;
        this.iznos = iznos;
        this.racunPrimaoca = racunPrimaoca;
        this.pozivNaBroj = pozivNaBroj;
        this.svrhaUplate = svrhaUplate;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Double getIznos() {
        return iznos;
    }

    public void setIznos(Double iznos) {
        this.iznos = iznos;
    }

    public String getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(String racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    public String getPozivNaBroj() {
        return pozivNaBroj;
    }

    public void setPozivNaBroj(String pozivNaBroj) {
        this.pozivNaBroj = pozivNaBroj;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
