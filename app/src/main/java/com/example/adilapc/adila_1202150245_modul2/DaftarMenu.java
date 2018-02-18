package com.example.adilapc.adila_1202150245_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class DaftarMenu extends AppCompatActivity {
    String[] item_list={
            "Nasi Goreng","Mie Goreng Special","mie Kuah Spesial", "sate Madura","nasi wagyu",
            "mei Kuah Upnormal", "nasi goreg bawang"
    };
    Integer[] img_list={
            R.drawable.bakmi8,
            R.drawable.bakmi7,
            R.drawable.bakmi6,
            R.drawable.bakmi4,
            R.drawable.bakmi3,
            R.drawable.bakmi2,
            R.drawable.bakmi1,
    };

    String[] harga_list ={"15.000","10.000","10.000","10.000","25.000","30.000","15.000",
    };
    String[] komposisi ={"gandum, terigu,garam,tepung,cabai ",};

    ListView listview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);


        ListAdaptor adapter=new ListAdaptor(this, item_list, img_list, harga_list);
        listview=(ListView)findViewById(R.id.ini_list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem= item_list[+position];
                Integer Slectedimg =img_list[+position];
                String Slectedharga =harga_list[+position];

                Intent intent = new Intent(DaftarMenu.this, DetailMenu.class);
                intent.putExtra("select_item", Slecteditem);
                intent.putExtra("select_img",Slectedimg);
                intent.putExtra("select_harga",Slectedharga);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}