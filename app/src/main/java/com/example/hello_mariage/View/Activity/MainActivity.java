package com.example.hello_mariage.View.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.hello_mariage.R;
import com.example.hello_mariage.View.Fragment.AccueilFragment;
import com.example.hello_mariage.View.Fragment.ThemesFragment;

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

        AccueilFragment frag = new AccueilFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.frame, frag).commit();

    }

    // menu items application create in activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    // menu items clicked
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.web:
                Toast.makeText(getApplicationContext(), "site web", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contact:
                Toast.makeText(getApplicationContext(), "contact", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cgu:
                Toast.makeText(getApplicationContext(), "politique de confidentialité", Toast.LENGTH_SHORT).show();
                break;
            case R.id.langues:
                Toast.makeText(getApplicationContext(), "langues", Toast.LENGTH_SHORT).show();
                break;
            case R.id.version:
                Toast.makeText(getApplicationContext(), "version", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    // end menu items


    // listener menu principal button
    private final View.OnClickListener btnAccueilListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getSupportFragmentManager().beginTransaction().
                    remove(getSupportFragmentManager().findFragmentById(R.id.frame)).commit();
            AccueilFragment frag = new AccueilFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.frame, frag).commit();
        }
    };

    private final View.OnClickListener btnThemesListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getSupportFragmentManager().beginTransaction().
                    remove(getSupportFragmentManager().findFragmentById(R.id.frame)).commit();
            ThemesFragment frag = new ThemesFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.frame, frag).commit();
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
