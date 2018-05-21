package com.example.camuh.coffe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class Login extends AppCompatActivity {
    @BindView(R.id.user) EditText user;
    @BindView(R.id.pass) EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    @OnClick(R.id.login)
    public void loginMasuk() {
        int user, pass, login;
        user = Integer.valueOf(user.getText().toString())
        //Method onClick pada Button

        EditText = (EditText)findViewById(R.id.user);
        EditText = (EditText) findViewById(R.id.pass);
        text EditText.getText().toString();
        text = EditText.getText().toString();
    }
}
