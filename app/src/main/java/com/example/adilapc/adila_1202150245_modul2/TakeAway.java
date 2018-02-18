package com.example.adilapc.adila_1202150245_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TakeAway extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);


    }

    public void pilih(View view) {
        Intent i = new Intent(this, DaftarMenu.class);
        startActivity(i);
    }
}
