package com.example.gregoireboniec.application_gsb;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by gregoireboniec on 01/06/2017.
 */

public class WebServices extends AsyncTask<String, Void, String>
{

    MainActivity maClass = new MainActivity(); //Besoin de créer un objet MainActivity pour appeller dans GetApplicationContext()

    @Override
    protected void onPreExecute()
    {
        super.onPreExecute();

        //permet d'afficher un message


    }

    private String appelWS(String uneURL){
        String result=""; try {
            InputStream in;
            URL url = new URL(uneURL);
            URLConnection connection = url.openConnection();
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            // Connexion à l'url
            httpConnection.connect();
            int responseCode = httpConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                in = httpConnection.getInputStream(); result = convertStreamToString(in); Log.d("debogage",result);
            }
        }
        catch (Exception e) {
            Log.d("debogage", "erreur"+e.getMessage()); }
        return result; }

    private String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is)); StringBuilder sb = new StringBuilder();
        try {
            String ligne = reader.readLine();
            while (ligne != null) { Log.d("debogage",ligne); sb.append(ligne + "\n"); ligne = reader.readLine();
            }
            reader.close();
        } catch (IOException e) { } finally {
            try {
                is.close();
            } catch (IOException e) {
                Log.d("debogage","catch"); }
        }
        return sb.toString(); }


    @Override
    protected String doInBackground(String... params)
    {
        return appelWS("http://10.0.2.2/testWebServices/wsIMC.php?poids=50&taille=170");

    }


    @Override
    protected void onPostExecute(String result)
    {

    }
}
