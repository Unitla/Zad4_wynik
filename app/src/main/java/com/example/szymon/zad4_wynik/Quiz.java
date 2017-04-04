package com.example.szymon.zad4_wynik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Szymon on 04.04.2017.
 */

public class Quiz extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazki);

        Button wynik = (Button)findViewById(R.id.wynikowy);
        final RadioButton dobry1= (RadioButton)findViewById(R.id.Radio1);
        final RadioButton dobry2= (RadioButton)findViewById(R.id.Radio7);
        final RadioButton dobry3= (RadioButton)findViewById(R.id.Radio9);
        final RadioButton dobry4= (RadioButton)findViewById(R.id.Radio5);
        final RadioButton dobry5= (RadioButton)findViewById(R.id.Radio3);

        wynik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int score=0;
                boolean odp1 = ((RadioButton) dobry1).isChecked();
                if(odp1)score++;
                odp1=((RadioButton) dobry2).isChecked();
                if(odp1)score++;
                odp1=((RadioButton) dobry3).isChecked();
                if(odp1)score++;
                odp1=((RadioButton) dobry4).isChecked();
                if(odp1)score++;
                odp1=((RadioButton) dobry5).isChecked();
                if(odp1)score++;
                Toast.makeText(getApplicationContext(),"Twój wynik to :"+score,Toast.LENGTH_LONG);
            }
        });
    }
}
