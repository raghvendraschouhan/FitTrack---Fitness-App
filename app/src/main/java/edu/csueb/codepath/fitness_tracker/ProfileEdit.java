package edu.csueb.codepath.fitness_tracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.parse.ParseUser;

import edu.csueb.codepath.fitness_tracker.fragments.ProfileFragment;

public class ProfileEdit extends Activity {
    UserModel profile;
    TextView etProfileImage;
    TextView etUsername;
    TextView etEmail;
    TextView etPassword1;
    TextView etPassword2;
    TextView etHeight;
    TextView etWeight;

    Button btnUpdate;
    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_edit);
//        etProfileImage =findViewById(R.id.etProfileImage);
//        etUsername =findViewById(R.id.etUsername);
//        etEmail =findViewById(R.id.etEmail);
//        etPassword1 =findViewById(R.id.etPassword1);
//        etPassword2 =findViewById(R.id.etPassword2);
//        etPassword2 =findViewById(R.id.etPassword2);
//        etWeight =findViewById(R.id.etWeight);
//        btnUpdate =findViewById(R.id.btnUpdate);
    }

}
