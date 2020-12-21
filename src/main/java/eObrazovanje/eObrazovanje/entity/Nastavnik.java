package eObrazovanje.eObrazovanje.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import eObrazovanje.eObrazovanje.enumeration.Role;
import eObrazovanje.eObrazovanje.enumeration.UlogaNastavnika;

@Entity
@Table(name = "nastavnik")
public class Nastavnik implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	private String jmbg;
	private String adresa;
	@Enumerated(EnumType.STRING)
	private UlogaNastavnika ulogaNastavnika;

	@OneToOne
	private User user;

	@OneToMany(mappedBy = "nastavnik", cascade = CascadeType.ALL)
	private Set<Ispit> ispiti = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "nastavnik_predaje_predmet", joinColumns = @JoinColumn(name = "nastavnik_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "predmet_id", referencedColumnName = "id"))
	private Set<Predmet> predmeti = new HashSet<>();

	public Nastavnik() {	

	}
	

	public Nastavnik(Long id, String jmbg, String adresa, UlogaNastavnika ulogaNastavnika, User user, Set<Ispit> ispiti,
			Set<Predmet> predmeti) {
		super();
		this.id = id;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.ulogaNastavnika = ulogaNastavnika;
		this.user = user;
		this.ispiti = ispiti;
		this.predmeti = predmeti;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public UlogaNastavnika getUlogaNastavnika() {
		return ulogaNastavnika;
	}

	public void setUlogaNastavnika(UlogaNastavnika ulogaNastavnika) {
		this.ulogaNastavnika = ulogaNastavnika;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Ispit> getIspiti() {
		return ispiti;
	}

	public void setIspiti(Set<Ispit> ispiti) {
		this.ispiti = ispiti;
	}

	public Set<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(Set<Predmet> predmeti) {
		this.predmeti = predmeti;
	}

	
}
