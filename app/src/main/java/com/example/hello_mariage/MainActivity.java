package com.example.hello_mariage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menu principal buttons
        Button btnAccueil = findViewById(R.id.btnAccueil);
        Button btnThemes = findViewById(R.id.btnThemes);
        Button btnDevis = findViewById(R.id.btnDevis);
        btnAccueil.setOnClickListener(btnAccueilListener);
        btnThemes.setOnClickListener(btnThemesListener);
        btnDevis.setOnClickListener(btnDevisListener);
        // end principal buttons

    }

    // listener menu principal button
    private final View.OnClickListener btnAccueilListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "bouton accueil", Toast.LENGTH_SHORT).show();
        }
    };

    private final View.OnClickListener btnThemesListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "bouton theme", Toast.LENGTH_SHORT).show();
        }
    };

    private final View.OnClickListener btnDevisListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "bouton devis", Toast.LENGTH_SHORT).show();
        }
    };
    // end listener menu principal button

}
