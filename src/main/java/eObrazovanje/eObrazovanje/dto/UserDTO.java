package eObrazovanje.eObrazovanje.dto;

import eObrazovanje.eObrazovanje.enumeration.Role;

import javax.persistence.EnumType;

public class UserDTO {

    private long id;
    private String username;
    private String password;
    private String ime;
    private String prezime;
    private Role role;

    public UserDTO() {
    }

    public UserDTO(long id, String username, String password, String ime, String prezime, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ime = ime;
        this.prezime = prezime;
        this.role = role;
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
}
