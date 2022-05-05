package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
public   class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idUser;
    private  String matricule;
    private String nom;
    private  String prenom;
    private  String email;
    public String login;
    public String password;
    public  boolean isAdmin;
    // un utilisateur apportient a une seule agence
    @ManyToOne
    @JoinColumn(name="agence_fk")
    public Agence agence;

 public  void changeMP(){
 }


}
