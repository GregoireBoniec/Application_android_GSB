package com.example.gregoireboniec.application_gsb;

import android.content.Context;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class MedecinDAO
{
    private static String base = "bdMedecin";
    private static int version=1;
    private BdSQLiteOpenHelper accesBD;

    /**
     *
     * Le constructeur va créer la base de donnée
     * @param ct
     */
    public MedecinDAO(Context ct)
    {
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);

    }
}
