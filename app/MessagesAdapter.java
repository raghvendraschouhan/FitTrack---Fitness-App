package edu.csueb.codepath.fitness_tracker;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;



import java.util.List;

public class MessagesAdapter extends ArrayAdapter<String> {
    Activity a;

    public MessagesAdapter(Context context, List<String> objects, Activity a,String id) {
        super(context, 0, objects);
        this.a =  a;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String room = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message_bubble,parent,false);
        }
        TextView mtext = convertView.findViewById(R.id.message_text);
        mtext.setText(room);
        return convertView;
    }
}

