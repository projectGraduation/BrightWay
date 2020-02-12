package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.ui.login.LoginActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    private Button btnmove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"firebase connection success",Toast.LENGTH_LONG).show();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.push().setValue(1);
        myRef.child("users").child("user1").setValue("Hello, World!");
        btnmove = findViewById(R.id.button2);
        btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetologin();
            }
        });
        }
        private void movetologin(){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        }
}
