package com.example.hello_mariage.Controler.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hello_mariage.Controler.ManageImg;
import com.example.hello_mariage.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class AdapterThemes extends BaseAdapter {

    private final ArrayList<String> listThemes;
    private ArrayList<String> listUrlImg;
    private final LayoutInflater themesInf;
    private final Context context;

    public AdapterThemes( Context c, ArrayList<String>themes, ArrayList<String>imgs ){
        this.context = c;
        this.listThemes = themes;
        this.listUrlImg = imgs;
        this.themesInf=LayoutInflater.from( c );
    }

    @Override
    public int getCount() {
        return this.listThemes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") LinearLayout themesLay = (LinearLayout) this.themesInf.inflate
                (R.layout.line_themes_disponibles, parent, false);

        TextView titleView = themesLay.findViewById(R.id.txtTitleThemes);

        ImageView img = themesLay.findViewById(R.id.img_themes_disponibles);
        try {
            img.setImageBitmap(ManageImg.manageImg(this.listUrlImg.get(position)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String title = this.listThemes.get(position);

        titleView.setText(title);
        themesLay.setTag(position);
        return themesLay;
    }

}
