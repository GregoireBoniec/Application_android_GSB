package com.example.gregoireboniec.application_gsb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class choix_activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_choix);


        Button boutonDeSaisie = (Button) findViewById(R.id.btnSaisie);
        Button boutonDeMap = (Button) findViewById(R.id.btnMap);

        boutonDeSaisie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent passage1 = new Intent(choix_activity.this, SaisieActivity.class);
                startActivity(passage1);
            }
        });

        /*boutonDeMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent passage2 = new Intent(choix_activity.this, GeolocalisationActivity.class);
                startActivity(passage2);
            }
        });*/
    }
}
