package com.example.messaging;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://chat-b868a-default-rtdb.firebaseio.com/");
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText name = findViewById(R.id.r_name);
        final EditText mobile= findViewById(R.id.r_mobile);
        final EditText email= findViewById(R.id.r_email);
        final AppCompatButton register= findViewById(R.id.r_registerBtn);

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading...");


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                final String nametxt = name.getText().toString();
                final String mobiletxt = mobile.getText().toString();
                final String emailtxt = email.getText().toString();
                if (nametxt.isEmpty() || mobiletxt.isEmpty() || emailtxt.isEmpty()){
                    Toast.makeText(Register.this,"All filled requier !!",Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
                else {
                    databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            progressDialog.dismiss();
                            if(snapshot.child("user").hasChild(mobiletxt)){
                                Toast.makeText(getApplicationContext(),"Mobile number already exists..",Toast.LENGTH_SHORT).show();
                            }
                            else {
                                databaseReference.child("user").child(mobiletxt).child("email").setValue(emailtxt);
                                databaseReference.child("user").child(mobiletxt).child("name").setValue(nametxt);

                                Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(Register.this,MainActivity.class);
                                intent.putExtra("Mobile",mobiletxt);
                                intent.putExtra("name",nametxt);
                                intent.putExtra("email",emailtxt);
                                startActivity(intent);
                                finish();

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(getApplicationContext(),"fald",Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    });
                }
            }
        });

    }
}