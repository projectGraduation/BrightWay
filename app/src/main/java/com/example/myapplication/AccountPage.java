package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ui.login.LoginActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AccountPage extends AppCompatActivity {
    private Button coursr;
    private Button report;
    private Button instructorprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page);

        Toast.makeText(AccountPage.this,"firebase connection success",Toast.LENGTH_LONG).show();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        // myRef.child("users").child("user2").child("name");


        coursr = findViewById(R.id.button6);
        coursr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetocourse();
            }
        });

        report = findViewById(R.id.button6);
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoreport();
            }
        });

        instructorprofile = findViewById(R.id.button4);
        instructorprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoinstructorprofile();
            }
        });


    }

    private void movetocourse(){
        Intent intent = new Intent(AccountPage.this, Course.class);
        startActivity(intent);
    }
    private void movetoreport(){
        Intent intent = new Intent(AccountPage.this, Reports.class);
        startActivity(intent);
    }

    private void movetoinstructorprofile(){
        Intent intent = new Intent(AccountPage.this, Instructorprofile.class);
        startActivity(intent);
    }


}