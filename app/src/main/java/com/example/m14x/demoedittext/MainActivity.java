package com.example.m14x.demoedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.buttonLogin) Button btnLogin;
    @Bind(R.id.textPassword)EditText textPassword;
    @Bind(R.id.textUser) EditText textUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonLogin)
    public void getData(){
        Log.i("INFO", textUser.getText().toString());
        Log.i("INFO", textPassword.getText().toString());
    }

}
