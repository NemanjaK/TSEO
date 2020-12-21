package eObrazovanje.eObrazovanje.dto;


import eObrazovanje.eObrazovanje.entity.User;
import eObrazovanje.eObrazovanje.enumeration.UlogaNastavnika;

import java.util.HashSet;
import java.util.Set;

public class NastavnikDTO {

	private Long id;
	private String jmbg;
	private String adresa;
	private UlogaNastavnika ulogaNastavnika;
	private User user;
	private Set<Predmet> predmeti = new HashSet<>();

	public NastavnikDTO() {
	}

	public NastavnikDTO(Long id, String jmbg, String adresa, UlogaNastavnika ulogaNastavnika, User user, Set<Predmet> predmeti) {
		this.id = id;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.ulogaNastavnika = ulogaNastavnika;
		this.user = user;
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

	public Set<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(Set<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
}
