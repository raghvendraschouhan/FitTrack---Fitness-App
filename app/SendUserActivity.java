package edu.csueb.codepath.fitness_tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SendUserActivity extends AppCompatActivity {
    EditText message_input;
    ListView listView;
    SharedPreferences sharedPreferences;
    String did;
    String uid;
    List<String> messageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_user);
        sharedPreferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);
        messageList = new ArrayList<>();
        TextView name = findViewById(R.id.unamecs);
        name.setText(sharedPreferences.getString("uname","Doctor"));
        listView = findViewById(R.id.messageslistdoc);
        ImageView profile_p = findViewById(R.id.profileuser);
        message_input = findViewById(R.id.sendtextdoc);
        findViewById(R.id.sendbtndoc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });
    }
    private void sendMessage(){
        String mes = message_input.getText().toString();
        if(!mes.isEmpty()){
            message_input.setText("");
            messageList.add(mes);
            inflateMessages(messageList);
        }
    }
    private void inflateMessages(List<String> messageList){
        MessagesAdapter adapter = new MessagesAdapter(this,messageList,this,uid);
        listView.setAdapter(adapter);
    }
}