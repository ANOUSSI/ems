package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public  abstract class Client {
    private int code;
    private String raisonS;
    private int codeTyoe;
    private int codeModeleFac;
    private  String adresse;
    private  String bp;
    private  String ville;
    private  String pays;
    private  String mobile;
    private String fixe;
    private  String fax;
    private  String email;
    private  String numContribuable;
    private  String regCommerce;
    private  String rib;
    private  int solde;
    private  boolean isTva;
    private boolean isIR;
    private  int remise;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRaisonS() {
        return raisonS;
    }

    public void setRaisonS(String raisonS) {
        this.raisonS = raisonS;
    }

    public int getCodeTyoe() {
        return codeTyoe;
    }

    public void setCodeTyoe(int codeTyoe) {
        this.codeTyoe = codeTyoe;
    }

    public int getCodeModeleFac() {
        return codeModeleFac;
    }

    public void setCodeModeleFac(int codeModeleFac) {
        this.codeModeleFac = codeModeleFac;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFixe() {
        return fixe;
    }

    public void setFixe(String fixe) {
        this.fixe = fixe;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumContribuable() {
        return numContribuable;
    }

    public void setNumContribuable(String numContribuable) {
        this.numContribuable = numContribuable;
    }

    public String getRegCommerce() {
        return regCommerce;
    }

    public void setRegCommerce(String regCommerce) {
        this.regCommerce = regCommerce;
    }

    public boolean isTva() {
        return isTva;
    }

    public void setTva(boolean tva) {
        isTva = tva;
    }

    public boolean isIR() {
        return isIR;
    }

    public void setIR(boolean IR) {
        isIR = IR;
    }
}
