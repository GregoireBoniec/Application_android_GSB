package com.example.gregoireboniec.application_gsb;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by gregoireboniec on 04/05/2017.
 */

public class SaisieActivity extends AppCompatActivity
{

    private String [] listeCabin;
    private String [] listeMed;
    public RadioButton RadioBtnOui,RadioBtnNon;
    private RadioGroup radioGroup;
    private Button btnAjoutArr, btnAjoutDeb, btnAjoutDep;
    private TextView txtArrive,txtDebut,txtDepart;
    int year_x,mont_x,day_x;
    static final int DIALOG_ID = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);

        btnAjoutArr = (Button) findViewById(R.id.btnAddArr);
        btnAjoutDeb = (Button) findViewById(R.id.btnAddDeb);
        btnAjoutDep = (Button) findViewById(R.id.btnAddDep);

        txtArrive = (TextView) findViewById(R.id.txtRecupArr);
        txtDebut = (TextView) findViewById(R.id.txtRecupDebut);
        txtDepart = (TextView) findViewById(R.id.txtRecupDepart);

        showDialogOnButtonClick();


        final java.util.Calendar call = java.util.Calendar.getInstance();
        year_x = call.get(java.util.Calendar.YEAR);
        mont_x = call.get(java.util.Calendar.MONTH);
        day_x = call.get(java.util.Calendar.DAY_OF_MONTH);



        //Permet d'ajouter des valeurs en DUR au spinner cabinet
        this.listeCabin = new String[]
                {
                        "Lille","Béthune","Lens","Liévin","Noeux-les-mines"
                };
        //Permet d'ajouter des valeures en DUR au spinner medecin
        this.listeMed = new String[]
                {
                        "Durand","Tisserand","Bonvarlet","Boniec","Carpentier","Wojtasiak","Bazire"
                };

        //Spinner medecin
        Spinner spinMede = (Spinner) findViewById(R.id.spinMedecin);
        ArrayAdapter<String> adapterMedecin = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listeMed);
        spinMede.setAdapter(adapterMedecin);

        //Spinner cabinet
        Spinner spinCabin = (Spinner) findViewById(R.id.spinCabinet);
        ArrayAdapter<String> adpaterCabinet = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, listeCabin);
        spinCabin.setAdapter(adpaterCabinet);




    }

    /////////Partie affichage et stockage de Date + heure/////////////
    ///////////Pour Arrivée + Début + Départ///////////////


    public void showDialogOnButtonClick()
    {



        btnAjoutArr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showDialog(DIALOG_ID);

            }


        });
    }



    @Override
    protected Dialog onCreateDialog(int id)
    {
        if (id == DIALOG_ID)
            return new DatePickerDialog(SaisieActivity.this, dpickerListener, year_x ,mont_x,day_x);


        return null;


    }





    private DatePickerDialog.OnDateSetListener dpickerListener = new DatePickerDialog.OnDateSetListener()
    {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
        {
            year_x = year;
            mont_x = month +1;
            day_x = dayOfMonth;


            txtArrive.setText(day_x + "-" + mont_x + "-" + year_x);


        }

    };
}
