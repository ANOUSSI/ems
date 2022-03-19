package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class Destination {

    private long idDes;
    private int codeDes;
    private String nomDes;
    private String zoneDes;
    private List<Agence> emsCollection;

    public long getId_des() {
        return idDes;
    }

    public void setId_des(long id_des) {
        this.idDes = id_des;
    }

    public int getCodesDes() {
        return codeDes;
    }

    public void setCodesDes(int codesDes) {
        this.codeDes = codesDes;
    }

    public String getNomDes() {
        return nomDes;
    }

    public void setNomDes(String nomDes) {
        this.nomDes = nomDes;
    }

    public String getZoneDes() {
        return zoneDes;
    }

    public void setZoneDes(String zoneDes) {
        this.zoneDes = zoneDes;
    }

    public List<Agence> getEmsCollection() {
        return emsCollection;
    }

    public void setEmsCollection(List<Agence> emsCollection) {
        this.emsCollection = emsCollection;
    }
}
