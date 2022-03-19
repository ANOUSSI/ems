package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public  abstract class Tarif {
    private  long idTarif;
    private  int poidSup;
    private int poidInf;

    public long getId_tarif() {
        return idTarif;
    }

    public void setId_tarif(long id_tarif) {
        this.idTarif = id_tarif;
    }

    public int getPoidSup() {
        return poidSup;
    }

    public void setPoidSup(int poidSup) {
        this.poidSup = poidSup;
    }

    public int getPoidInf() {
        return poidInf;
    }

    public void setPoidInf(int poidInf) {
        this.poidInf = poidInf;
    }
}
