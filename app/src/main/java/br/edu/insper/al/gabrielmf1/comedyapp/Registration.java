package br.edu.insper.al.gabrielmf1.comedyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    EditText etEmail, etPass, etName, etConfirmPass;
    Button btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        etName = findViewById(R.id.etName);
        etConfirmPass = findViewById(R.id.etConfirmPass);

        btnReg = findViewById(R.id.btnReg);
    }
}