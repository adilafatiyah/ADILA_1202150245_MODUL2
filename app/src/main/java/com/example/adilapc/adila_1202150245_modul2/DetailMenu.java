package com.example.adilapc.adila_1202150245_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    ImageView imageView;
    TextView textView1,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        imageView= (ImageView)findViewById(R.id.img_detail);
        textView1 =(TextView)findViewById(R.id.item_detail);
        textView2 =(TextView)findViewById(R.id.harga_detail);

        Intent intent = getIntent();
        String item = intent.getStringExtra("select_item");

        int img = intent.getIntExtra("select_img",0);
        String harga =intent.getStringExtra("select_harga" +
                "");

        Log.d("ini adalah", item+img+harga);

        imageView.setImageResource(img);
        textView1.setText(item);
        textView2.setText(harga);
    }


}
