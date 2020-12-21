package eObrazovanje.eObrazovanje.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "uplata")
public class Uplata implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "datum")
    private Date datum;

    @Column(name = "iznos")
    private Double iznos;

    @Column(name = "racun_primaoca")
    private String racunPrimaoca;

    @Column(name = "poziv_na_broj")
    private String pozivNaBroj;

    @Column(name = "svrha_uplate")
    private String svrhaUplate;

    @ManyToOne
    @JoinColumn(name="student_id", referencedColumnName="id")
    private Student student;

    public Uplata() {
    }

    public Uplata(Long id, Date datum, Double iznos, String racunPrimaoca, String pozivNaBroj, String svrhaUplate, Student student) {
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
