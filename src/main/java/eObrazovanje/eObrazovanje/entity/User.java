package eObrazovanje.eObrazovanje.entity;
import java.io.Serializable;

import javax.persistence.*;

import eObrazovanje.eObrazovanje.enumeration.Role;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
	private long id;
	private String username;
	private String password;
	private String ime;
	private String prezime;
	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToOne(mappedBy = "user")
	private Student student;

    @OneToOne(mappedBy = "user")
	private Nastavnik nastavnik;
	
	public User() {
	}

	public User(long id, String username, String password, String ime, String prezime, Role role, Student student, Nastavnik nastavnik) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.ime = ime;
		this.prezime = prezime;
		this.role = role;
		this.student = student;
		this.nastavnik = nastavnik;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Nastavnik getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(Nastavnik nastavnik) {
		this.nastavnik = nastavnik;
	}
}
