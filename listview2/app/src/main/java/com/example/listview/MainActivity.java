package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Kevin");
        arr.add("Man");
        arr.add("Utsav");
        arr.add("Meet");
        arr.add("Aanandi");
        arr.add("Sandhya");
        arr.add("Amit");
        arr.add("Vivek");
        arr.add("Deep");
        arr.add("Ravi");
        arr.add("Mohit");
        arr.add("Keval");
        arr.add("Divyesh");
        arr.add("Savan");
        arr.add("Meet");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arr);
        listView.setAdapter(adapter);
    }
}