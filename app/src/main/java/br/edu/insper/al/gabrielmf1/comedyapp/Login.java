package br.edu.insper.al.gabrielmf1.comedyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    EditText etEmail, etPass;
    Button btnLogin;
    TextView btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);

        btnLogin = findViewById(R.id.btnLogin);
        btnReg = findViewById(R.id.btnReg);
    }
}
