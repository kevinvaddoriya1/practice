package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
//        String[] data = {"Facebook","Instagram","Google","Twitter","Snap","Whatsapp"};
//        Integer []imgId = {R.drawable.ig,R.drawable.ig,R.drawable.gg,R.drawable.tw,R.drawable.sp,R.drawable.wp};
//        Integer[] imgId = {R.mipmap.ic_launcher};

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person(R.drawable.fb,"Facebook"));
        arrayList.add(new Person(R.drawable.ig,"Instagram"));
        arrayList.add(new Person(R.drawable.gg,"Google"));
        arrayList.add(new Person(R.drawable.sp,"Snapchat"));
        arrayList.add(new Person(R.drawable.wp,"Whatsapp"));
        arrayList.add(new Person(R.drawable.tw,"Twitter"));
//        listView.setAdapter();
        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.customlist,arrayList);
        listView.setAdapter(personAdapter);


    }

}