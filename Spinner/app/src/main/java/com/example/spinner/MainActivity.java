package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner2);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Aadhar Card");
        arr.add("Pan Card");
        arr.add("Ration Card");
        arr.add("Voter Id Card");
        arr.add("Passport");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arr);
        spinner.setAdapter(adapter);
    }
}