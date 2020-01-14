package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvZeitraum;
    TextView tvDistanz;
    TextView tvMaxGeschwindigkeit;

    EditText editZeitraum;
    EditText editDistanz;
    EditText editMaximalgeschwindigkeit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvZeitraum = findViewById(R.id.tvZeitraum);
        tvDistanz = findViewById(R.id.tvDistanz);
        tvMaxGeschwindigkeit = findViewById(R.id.tvMaxGeschwindigkeit);

        editZeitraum = findViewById(R.id.editZeitraum);
        editDistanz = findViewById(R.id.editDistanz);
        editMaximalgeschwindigkeit = findViewById(R.id.editMaxGeschwindigkeit);
    }
}
