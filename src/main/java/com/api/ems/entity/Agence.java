package com.api.ems.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgence;
    public String nom;
    public String tel;
    public String fax;
    public String bp;
    public String adresse;
    //Une agence contient plusieur postes
@OneToMany(mappedBy = "agence")
    public Collection<Poste> postes;
//une agence contient plusieur utilisateur
    @OneToMany(mappedBy = "agence")
private  Collection<Utilisateur> utilisateurs;


}