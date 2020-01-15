package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText editZeit;
    EditText editDistanz;
    EditText editMaxGeschw;

    Switch swStillstand;
    Switch swOnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editZeit = findViewById(R.id.editZeit);
        editDistanz = findViewById(R.id.editDistanz);
        editMaxGeschw = findViewById(R.id.editMaxGeschw);
        swStillstand = findViewById(R.id.swStillstand);


        
    }
}
