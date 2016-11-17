package com.example.wlw.sharedpreferencesapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SharedPreferencesReadActivity extends AppCompatActivity {

    private TextView usernameTV;
    private TextView passwordTV;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_read);
        usernameTV= (TextView) findViewById(R.id.username);
        passwordTV= (TextView) findViewById(R.id.password);


        SharedPreferences sp=getSharedPreferences("mrsoft",MODE_PRIVATE);
        String username=sp.getString("username","mr");
        String password=sp.getString("password","001");
        usernameTV.setText("用户名："+username);
        passwordTV.setText("密码："+password);

    }
}
