package com.example.lachezarivanov.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.blank150x150, R.drawable.admin150x150,
            R.drawable.evropa150x150, R.drawable.banks150x150,
            R.drawable.business150x150, R.drawable.brak150x150,
            R.drawable.blank150x150, R.drawable.veshti150x150,
            R.drawable.grajdani150x150, R.drawable.blank150x150,
            R.drawable.grajdanstvo150x150, R.drawable.blank150x150,
            R.drawable.dela150x150, R.drawable.deca150x150,
            R.drawable.dogovori150x150, R.drawable.blank150x150,
            R.drawable.evropa150x150, R.drawable.evrofondowe150x150,
            R.drawable.zaplata, R.drawable.zapochvane,
            R.drawable.zastrahovki, R.drawable.zashtita,
            R.drawable.zdrave, R.drawable.imoti,
            R.drawable.institucii, R.drawable.evrofondowe150x150,
            R.drawable.kat, R.drawable.krediti,
            R.drawable.blank150x150, R.drawable.nakazanie,
            R.drawable.nsledstvo, R.drawable.npo,
            R.drawable.obrazowanie, R.drawable.blank150x150,
            R.drawable.obshtini, R.drawable.online,
            R.drawable.blank150x150, R.drawable.pari,
            R.drawable.blank150x150, R.drawable.policia,
            R.drawable.potrebiteli, R.drawable.blank150x150,
            R.drawable.prekratqwane, R.drawable.prestuplenie,
            R.drawable.prokuratura, R.drawable.proceduri,
            R.drawable.putuvane, R.drawable.rabota,
            R.drawable.blank150x150, R.drawable.razvod,
            R.drawable.sdelki, R.drawable.sdrujeniq,
            R.drawable.semeistvo, R.drawable.blank150x150,
            R.drawable.blank150x150, R.drawable.startirane,
            R.drawable.stoki, R.drawable.stroitelstvo,
            R.drawable.sud, R.drawable.blank150x150,
            R.drawable.blank150x150, R.drawable.blank150x150,
            R.drawable.upravlenie, R.drawable.uslugi,
            R.drawable.fondacii
    };
}
