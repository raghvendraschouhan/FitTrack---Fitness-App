package edu.csueb.codepath.fitness_tracker;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DoctorChatFragment extends Fragment {
    ListView listView;
    Activity a;

    public DoctorChatFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        a = getActivity();
        View rootView = inflater.inflate(R.layout.fragment_doctor_chat, container, false);
        listView = rootView.findViewById(R.id.doctor_chats);
        Gson gson = new Gson();
        List<String> users = new ArrayList<>();
        users.add("Raghavendra");
        users.add("Swapnadeep");
        users.add("Aaditya");
        inflateReminder(users);
        return  rootView;
    }
    public void inflateReminder(List<String> chatrooms){
        DoctorChatAdapter adapter = new DoctorChatAdapter(getContext(),chatrooms,getActivity());
        listView.setAdapter(adapter);
    }
}