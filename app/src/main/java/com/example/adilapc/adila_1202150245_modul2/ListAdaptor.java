package com.example.adilapc.adila_1202150245_modul2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by adila pc on 18/02/2018.
 */

public class ListAdaptor extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] harga;

    public ListAdaptor(Activity context, String[] itemname, Integer[] imgid ,String[] harga) {
        super(context, R.layout.mylist, itemname);
        // TODO Auto-generated constructor stub
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.harga=harga;
    }
public View getView (int position,View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);

    TextView txtTitle = (TextView) rowView.findViewById(R.id.text_list);
    ImageView imageView = (ImageView) rowView.findViewById(R.id.img_list);
    TextView extratxt = (TextView) rowView.findViewById(R.id.harga_list);

    txtTitle.setText(itemname[position]);
    imageView.setImageResource(imgid[position]);
    extratxt.setText("Harga: Rp "+harga[position]);
    return rowView;
};

}
