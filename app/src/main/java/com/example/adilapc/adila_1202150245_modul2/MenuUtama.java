package com.example.adilapc.adila_1202150245_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);


    }

    public void dine(View view) {
        Intent i = new Intent(this, DineIn.class);
        Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_LONG).show();
        startActivity(i);
    }

    public void take(View view) {
        Intent i = new Intent(this, TakeAway.class);
        Toast.makeText(MenuUtama.this, "Take Away", Toast.LENGTH_LONG).show();
        startActivity(i);
    }
}
