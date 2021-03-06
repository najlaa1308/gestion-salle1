package com.gestionsalle.demo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(uniqueConstraints= {@UniqueConstraint(columnNames = {"email"}), @UniqueConstraint(columnNames = {"login"})})

public class ResponsableDepartement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String login;
    private String nom;
    private String prenom;
    private String departement;
    private String numtel;
    private String Passwordresponsabledepartement;
    @OneToMany(mappedBy = "responsableDepartement")
    private List<Reservation> reservations;

    public ResponsableDepartement() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getPasswordresponsabledepartement() {
        return Passwordresponsabledepartement;
    }

    public void setPasswordresponsabledepartement(String passwordresponsabledepartement) {
        Passwordresponsabledepartement = passwordresponsabledepartement;
    }

    public ResponsableDepartement(String departement) {
        this.departement = departement;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponsableDepartement)) return false;
        ResponsableDepartement that = (ResponsableDepartement) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(email, that.email) &&
                Objects.equals(login, that.login) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(departement, that.departement) &&
                Objects.equals(numtel, that.numtel) &&
                Objects.equals(Passwordresponsabledepartement, that.Passwordresponsabledepartement) &&
                Objects.equals(reservations, that.reservations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, login, nom, prenom, departement, numtel, Passwordresponsabledepartement, reservations);
    }
}
