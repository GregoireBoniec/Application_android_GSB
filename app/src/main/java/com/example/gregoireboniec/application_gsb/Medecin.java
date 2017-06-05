package com.example.gregoireboniec.application_gsb;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class Medecin
{


    public int idM;
    public String nomM;
    public String prenomM;
    public int id_Visiteur;
    public int id_Cabinet;

    public Medecin(int idM, String nomM, String prenomM, int id_Visiteur, int id_Cabinet) {
        this.idM = idM;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.id_Visiteur = id_Visiteur;
        this.id_Cabinet = id_Cabinet;
    }

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public int getId_Visiteur() {
        return id_Visiteur;
    }

    public void setId_Visiteur(int id_Visiteur) {
        this.id_Visiteur = id_Visiteur;
    }

    public int getId_Cabinet() {
        return id_Cabinet;
    }

    public void setId_Cabinet(int id_Cabinet) {
        this.id_Cabinet = id_Cabinet;
    }


}
