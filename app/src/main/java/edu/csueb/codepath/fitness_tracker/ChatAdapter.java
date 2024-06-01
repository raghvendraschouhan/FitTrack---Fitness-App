package edu.csueb.codepath.fitness_tracker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ChatAdapter extends ArrayAdapter<String> {
    Activity a;
    public ChatAdapter(Context context, List<String> objects, Activity a) {
        super(context, 0, objects);
        this.a =  a;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String room = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.chat_view,parent,false);
        }
        TextView name = convertView.findViewById(R.id.usernaemc);
        name.setText(room);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChat(room);
            }
        });
        return convertView;
    }
    private  void  startChat(String name){
        SharedPreferences sharedPreferences = a.getSharedPreferences("PREFERENCE", a.MODE_PRIVATE);
        SharedPreferences.Editor editor =  sharedPreferences.edit();
        editor.putString("uname",name);
        editor.apply();
        Intent intent = new Intent(getContext(), SendUserActivity.class);
        a.startActivity(intent);
    }
}
