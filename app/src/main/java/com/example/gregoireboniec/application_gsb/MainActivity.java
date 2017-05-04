package com.example.gregoireboniec.application_gsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boutonConnexion;

        boutonConnexion = (Button) findViewById(R.id.btnConnexion);

        boutonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent PassageSaisie = new Intent(MainActivity.this, choix_activity.class);
                startActivity(PassageSaisie);


            }
        });

    }
}
