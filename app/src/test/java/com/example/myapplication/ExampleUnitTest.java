package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    DatabaseReference databaseRef=FirebaseDatabase.getInstance()
            .getReference();

  databaseRef.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            String data = dataSnapshot.child("NAME").getValue(String.class);
            textview.setText(data);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError);

