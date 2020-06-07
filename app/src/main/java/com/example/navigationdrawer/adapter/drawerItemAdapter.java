package com.example.navigationdrawer.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.model.dataModel;

public class drawerItemAdapter extends ArrayAdapter<dataModel>{
    Context context;
    int layout;
    dataModel data[] = null;

    public drawerItemAdapter(Context context, int layout, dataModel[] data) {
        super(context, layout,data);
        this.context = context;
        this.layout = layout;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        listItem = inflater.inflate(layout, parent, false);

        ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageViewIcon);
        TextView textViewName = (TextView) listItem.findViewById(R.id.textViewName);

        dataModel folder = data[position];


        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);

        return listItem;
    }
}
