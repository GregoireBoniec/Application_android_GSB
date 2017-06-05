package com.example.gregoireboniec.application_gsb;

import android.content.Context;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class CabinetDAO
{
    private static String base = "bdCabinet";
    private static int version=1;
    private BdSQLiteOpenHelper accesBD;

    /**
     *
     * Le constructeur va créer la base de donnée
     * @param ct
     */
    public CabinetDAO(Context ct)
    {
        accesBD = new BdSQLiteOpenHelper(ct, base, null, version);

    }
}
