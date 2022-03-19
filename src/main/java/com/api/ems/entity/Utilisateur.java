package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public abstract   class Utilisateur {
    private  long idUser;
    private  String matricule;
    private String nom;
    private  long idAgebce;
    private long idgroupe;
    public String login;
    public String motDePasse;
 public  void changeMP(){
 }

    public long getId_user() {
        return idUser;
    }

    public void setId_user(long id_user) {
        this.idUser = id_user;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getIdAgebce() {
        return idAgebce;
    }

    public void setIdAgebce(long idAgebce) {
        this.idAgebce = idAgebce;
    }

    public long getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(long idgroupe) {
        this.idgroupe = idgroupe;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
