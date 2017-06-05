package com.example.gregoireboniec.application_gsb;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class Cabinet
{

    public int idC;
    public String nomC;
    public String adresseC;
    public String cpC;
    public float coordGPS_LAT;
    public float coordGPS_LONG;


    public Cabinet(int idC, String nomC, String adresseC, String cpC, float coordGPS_LAT, float coordGPS_LONG) {
        this.idC = idC;
        this.nomC = nomC;
        this.adresseC = adresseC;
        this.cpC = cpC;
        this.coordGPS_LAT = coordGPS_LAT;
        this.coordGPS_LONG = coordGPS_LONG;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getAdresseC() {
        return adresseC;
    }

    public void setAdresseC(String adresseC) {
        this.adresseC = adresseC;
    }

    public String getCpC() {
        return cpC;
    }

    public void setCpC(String cpC) {
        this.cpC = cpC;
    }

    public float getCoordGPS_LAT() {
        return coordGPS_LAT;
    }

    public void setCoordGPS_LAT(float coordGPS_LAT) {
        this.coordGPS_LAT = coordGPS_LAT;
    }

    public float getCoordGPS_LONG() {
        return coordGPS_LONG;
    }

    public void setCoordGPS_LONG(float coordGPS_LONG) {
        this.coordGPS_LONG = coordGPS_LONG;
    }
}
