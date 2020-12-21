package eObrazovanje.eObrazovanje.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "broj_indeksa")
	private String brojIndeksa;

	@Column(name = "tekuci_racun")
	private String tekuciRacun;

	@Column(name = "stanje")
	private double stanje;

	@Column(name = "broj_telefona")
	private String brojTelefona;

	@Column(name = "jmbg")
	private String jmbg;

	@Column(name = "adresa")
	private String adresa;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<Dokument> dokumenti = new HashSet<>();

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<Uplata> uplate = new HashSet<>();

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<Prijava> prijave = new HashSet<>();

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<Pohadjanje> pohadjanja = new HashSet<>();

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<PolaganjePredispitneObaveze> polaganjaPredispitnihObaveza = new HashSet<>();

	@OneToOne
	private User user;

	public Student() {
	}

	public Student(Long id, String brojIndeksa, String tekuciRacun, double stanje, String brojTelefona, String jmbg, String adresa, Set<Dokument> dokumenti, Set<Uplata> uplate, Set<Prijava> prijave, Set<Pohadjanje> pohadjanja, Set<PolaganjePredispitneObaveze> polaganjaPredispitnihObaveza, User user) {
		this.id = id;
		this.brojIndeksa = brojIndeksa;
		this.tekuciRacun = tekuciRacun;
		this.stanje = stanje;
		this.brojTelefona = brojTelefona;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.dokumenti = dokumenti;
		this.uplate = uplate;
		this.prijave = prijave;
		this.pohadjanja = pohadjanja;
		this.polaganjaPredispitnihObaveza = polaganjaPredispitnihObaveza;
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

	public Set<Dokument> getDokumenti() {
		return dokumenti;
	}

	public void setDokumenti(Set<Dokument> dokumenti) {
		this.dokumenti = dokumenti;
	}

	public Set<Uplata> getUplate() {
		return uplate;
	}

	public void setUplate(Set<Uplata> uplate) {
		this.uplate = uplate;
	}

	public Set<Prijava> getPrijave() {
		return prijave;
	}

	public void setPrijave(Set<Prijava> prijave) {
		this.prijave = prijave;
	}

	public Set<Pohadjanje> getPohadjanja() {
		return pohadjanja;
	}

	public void setPohadjanja(Set<Pohadjanje> pohadjanja) {
		this.pohadjanja = pohadjanja;
	}

	public Set<PolaganjePredispitneObaveze> getPolaganjaPredispitnihObaveza() {
		return polaganjaPredispitnihObaveza;
	}

	public void setPolaganjaPredispitnihObaveza(Set<PolaganjePredispitneObaveze> polaganjaPredispitnihObaveza) {
		this.polaganjaPredispitnihObaveza = polaganjaPredispitnihObaveza;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
