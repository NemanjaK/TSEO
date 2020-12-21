package eObrazovanje.eObrazovanje.dto;

import eObrazovanje.eObrazovanje.entity.User;

public class StudentDTO {

    private Long id;
    private String brojIndeksa;
    private String tekuciRacun;
    private double stanje;
    private String brojTelefona;
    private String jmbg;
    private String adresa;
    private User user;

    public StudentDTO() {
    }

    public StudentDTO(Long id, String brojIndeksa, String tekuciRacun, double stanje, String brojTelefona, String jmbg, String adresa, User user) {
        this.id = id;
        this.brojIndeksa = brojIndeksa;
        this.tekuciRacun = tekuciRacun;
        this.stanje = stanje;
        this.brojTelefona = brojTelefona;
        this.jmbg = jmbg;
        this.adresa = adresa;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getTekuciRacun() {
        return tekuciRacun;
    }

    public void setTekuciRacun(String tekuciRacun) {
        this.tekuciRacun = tekuciRacun;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
