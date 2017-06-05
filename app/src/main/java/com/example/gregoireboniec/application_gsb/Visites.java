package com.example.gregoireboniec.application_gsb;

import java.sql.Time;
import java.util.Date;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class Visites
{
    public int idVisites;
    public Date dateVisites;
    public Time heureArrive;
    public Time heureDebutE;
    public Time heureDepart;
    public boolean rdvV;
    public int id_Medecin;
    public int id_Visiteur;

    public Visites(int idVisites, Date dateVisites, Time heureArrive, Time heureDebutE, Time heureDepart, boolean rdvV, int id_Medecin, int id_Visiteur) {
        this.idVisites = idVisites;
        this.dateVisites = dateVisites;
        this.heureArrive = heureArrive;
        this.heureDebutE = heureDebutE;
        this.heureDepart = heureDepart;
        this.rdvV = rdvV;
        this.id_Medecin = id_Medecin;
        this.id_Visiteur = id_Visiteur;
    }

    public int getIdVisites() {
        return idVisites;
    }

    public void setIdVisites(int idVisites) {
        this.idVisites = idVisites;
    }

    public Date getDateVisites() {
        return dateVisites;
    }

    public void setDateVisites(Date dateVisites) {
        this.dateVisites = dateVisites;
    }

    public Time getHeureArrive() {
        return heureArrive;
    }

    public void setHeureArrive(Time heureArrive) {
        this.heureArrive = heureArrive;
    }

    public Time getHeureDebutE() {
        return heureDebutE;
    }

    public void setHeureDebutE(Time heureDebutE) {
        this.heureDebutE = heureDebutE;
    }

    public Time getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    public boolean isRdvV() {
        return rdvV;
    }

    public void setRdvV(boolean rdvV) {
        this.rdvV = rdvV;
    }

    public int getId_Medecin() {
        return id_Medecin;
    }

    public void setId_Medecin(int id_Medecin) {
        this.id_Medecin = id_Medecin;
    }

    public int getId_Visiteur() {
        return id_Visiteur;
    }

    public void setId_Visiteur(int id_Visiteur) {
        this.id_Visiteur = id_Visiteur;
    }


}
