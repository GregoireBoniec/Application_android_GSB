package com.example.gregoireboniec.application_gsb;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class Visiteur
{
    public int idV;
    public String nomV;
    public String prenomV;
    public String loginV;
    public int idProfilV;
    public String mdpV;


    public Visiteur(int idV, String nomV, String prenomV, String loginV, int idProfilV, String mdpV, String adresseV, int cpV) {
        this.idV = idV;
        this.nomV = nomV;
        this.prenomV = prenomV;
        this.loginV = loginV;
        this.idProfilV = idProfilV;
        this.mdpV = mdpV;
        this.adresseV = adresseV;
        this.cpV = cpV;
    }


    public int getIdV() {
        return idV;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }

    public String getNomV() {
        return nomV;
    }

    public void setNomV(String nomV) {
        this.nomV = nomV;

    }

    public String getPrenomV() {
        return prenomV;
    }

    public void setPrenomV(String prenomV) {
        this.prenomV = prenomV;
    }

    public String getLoginV() {
        return loginV;
    }

    public void setLoginV(String loginV) {
        this.loginV = loginV;
    }

    public int getIdProfilV() {
        return idProfilV;
    }

    public void setIdProfilV(int idProfilV) {
        this.idProfilV = idProfilV;
    }

    public String getMdpV() {
        return mdpV;
    }

    public void setMdpV(String mdpV) {
        this.mdpV = mdpV;
    }

    public String getAdresseV() {
        return adresseV;
    }

    public void setAdresseV(String adresseV) {
        this.adresseV = adresseV;
    }

    public int getCpV() {
        return cpV;
    }

    public void setCpV(int cpV) {
        this.cpV = cpV;
    }

    public String adresseV;
    public int cpV;
}
