package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class actionAdapter extends ArrayAdapter<Action> {
    List<Action> actionList;
    public actionAdapter(@NonNull Context context, int resource, @NonNull List<Action> objects) {
        super(context, resource, objects);

        actionList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.item , parent , false);

        Action currentAction = actionList.get(position);

        TextView actionName = view.findViewById(R.id.textView3);
        ImageView actionImg = view.findViewById(R.id.imageView);

        actionName.setText(currentAction.getActionName());
        actionImg.setImageResource(currentAction.getActionImg());

        return view;
    }
}
