package com.example.gregoireboniec.application_gsb;

import android.content.Context;



public class VisiteursDAO
{
    private static String base = "bdCabinet";
    private static int version=1;
    private BdSQLiteOpenHelper accesBD;

    /**
     *
     * Le constructeur va créer la base de donnée
     * @param ct
     */
    public VisiteursDAO(Context ct)
    {
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);

    }
}
