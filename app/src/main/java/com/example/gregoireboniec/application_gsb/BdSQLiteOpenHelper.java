package com.example.gregoireboniec.application_gsb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class BdSQLiteOpenHelper extends SQLiteOpenHelper
{

    //Table Cabinet

    public static final String Cabinet_id = "idCabinet";
    public static final String Cabinet_nom = "nomCabinet";
    public static final String Cabinet_adresse = "adresseCabinet";
    public static final String Cabinet_CP = "cpCabinet";
    public static final String Cabinet_GPS_LAT = "coordGPS_LAT";
    public static final String Cabinet_GPS_LONG = "coordGPS_LONG";

    public static final String CABINET_TABLE_NAME = "cabinet";
    public final static String CABINET_TABLE_DROP = "DROP TABLE IF EXIST" + CABINET_TABLE_NAME +";";
    public static final String CABINET_TABLE_CREATE =
            "CREATE TABLE" + CABINET_TABLE_NAME + " (" +
                    Cabinet_id + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                    Cabinet_nom + "TEXT," +
                    Cabinet_adresse + "TEXT," +
                    Cabinet_CP + "TEXT," +
                    Cabinet_GPS_LAT + "REAL," +
                    Cabinet_GPS_LONG + "REAL);";



    //Table Visiteur

    public static final String Visiteur_id = "idV";
    public static final String Visiteur_nom = "nomV";
    public static final String Visiteur_prenom = "prenomV";
    public static final String Visiteur_login = "loginV";
    public static final String Visiteur_idProfil = "idProfilV";
    public static final String Visiteur_mdp = "mdpV";
    public static final String Visiteur_adresse = "adresseV";
    public static final String Visiteur_cp = "cpV";

    public static final String VISITEUR_TABLE_NAME = "visiteur";
    public final static String VISITEUR_TABLE_DROP = "DROP TABLE IF EXIST" + VISITEUR_TABLE_NAME +";";
    public static final String VISITEUR_TABLE_CREATE =
            "CREATE TABLE" + VISITEUR_TABLE_NAME + " (" +
                    Visiteur_id + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                    Visiteur_nom + "TEXT," +
                    Visiteur_prenom + "TEXT," +
                    Visiteur_login + "TEXT," +
                    Visiteur_idProfil + "INTEGER," +
                    Visiteur_mdp + "TEXT," +
                    Visiteur_adresse + "TEXT," +
                    Visiteur_cp + "TEXT);";



    //Table Médecin

    public static final String Medecin_id = "idM";
    public static final String Medecin_nom = "nomM";
    public static final String Medecin_prenom = "prenomM";
    public static final String id_Visiteur = "id_Visiteur";
    public static final String id_cabinet = "id_Cabinet";

    public static final String MEDECIN_TABLE_NAME = "medecin";
    public final static String MEDECIN_TABLE_DROP = "DROP TABLE IF EXIST" + MEDECIN_TABLE_NAME +";";
    public static final String MEDECIN_TABLE_CREATE =
            "CREATE TABLE" + MEDECIN_TABLE_NAME + " (" +
                    Medecin_id + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                    Medecin_nom + "TEXT," +
                    Medecin_prenom + "TEXT," +
                    id_Visiteur + "TEXT," +
                    id_cabinet + "TEXT," +
                    "FOREIGN KEY(" + id_Visiteur+ ") REFERENCES " + VISITEUR_TABLE_NAME + "(" + Visiteur_id + ")" +
                    "FOREING KEY(" + id_cabinet + ") REFERENCES" + CABINET_TABLE_NAME + "(" + Cabinet_id + "));";

    //Table Visite

    public static final String Visites_id = "idVisites";
    public static final String Visites_date = "dateVisites";
    public static final String Visites_heureA = "heureArrivee";
    public static final String Visites_heureDeb = "heureDebut";
    public static final String Visites_heureDep = "heureDepart";
    public static final String Visites_rdv = "rdvV";
    public static final String id_Medecin = "idMedecin";
    public static final String id_VisiteurV = "idVisiteur";

    public static final String VISITES_TABLE_NAME = "visites";
    public final static String VISITES_TABLE_DROP = "DROP TABLE IF EXIST" + VISITES_TABLE_NAME +";";
    public static final String VISITES_TABLE_CREATE =
            "CREATE TABLE" + VISITES_TABLE_NAME + " (" +
                    Visites_id + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                    Visites_date + "DATE," +
                    Visites_heureA + "TIME," +
                    Visites_heureDeb + "TIME," +
                    Visites_heureDep + "TIME," +
                    Visites_rdv + "BOOL," +
                    id_Medecin + "INTEGER," +
                    id_VisiteurV + "INTEGER," +
                    "FOREIGN KEY(" + id_VisiteurV + ") REFERENCES " + VISITEUR_TABLE_NAME + "(" + Visiteur_id + ")" +
                    "FOREING KEY(" + id_Medecin + ") REFERENCES" + MEDECIN_TABLE_NAME + "(" + Medecin_id + "));";


    public BdSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //Permet de créer les tables

        db.execSQL(VISITES_TABLE_CREATE);
        db.execSQL(VISITEUR_TABLE_CREATE);
        db.execSQL(CABINET_TABLE_CREATE);
        db.execSQL(MEDECIN_TABLE_CREATE);

        db.execSQL("insert into visiteur(id,nom,prenom) values(1,'D','Andre','Dandre',89,'oppg5','2 rue de la foret','62114');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newversion)
    {
        db.execSQL(VISITES_TABLE_DROP);
        db.execSQL(VISITEUR_TABLE_DROP);
        db.execSQL(CABINET_TABLE_DROP);
        db.execSQL(MEDECIN_TABLE_DROP);
    }
}
