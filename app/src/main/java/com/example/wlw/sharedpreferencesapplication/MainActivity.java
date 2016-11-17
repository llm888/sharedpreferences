package com.example.wlw.sharedpreferencesapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText usernameET;
    private EditText passwordET;
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET= (EditText) findViewById(R.id.username);
        passwordET= (EditText) findViewById(R.id.password);
        btn_login= (Button) findViewById(R.id.login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usernameET.getText().toString();
                String password=passwordET.getText().toString();
                SharedPreferences sp=getSharedPreferences("mrsoft",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("username",username);
                editor.putString("password",password);

                editor.commit();


                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SharedPreferencesReadActivity.class);
                startActivity(intent);

            }
        });



    }
}
