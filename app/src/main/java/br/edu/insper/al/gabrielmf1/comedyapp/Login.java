package br.edu.insper.al.gabrielmf1.comedyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etEmail, etPass;
    Button btnLogin;
    TextView tvReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);

        btnLogin = findViewById(R.id.btnLogin);
        tvReg = findViewById(R.id.tvReg);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Perfil.class);
                startActivity(i);
                finish();
                String email,pass;

                email = etEmail.getText().toString();
                pass = etPass.getText().toString();

                if (email.equals("")){
                    Toast.makeText(Login.this, "Insira um Email válido", Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals("")){
                    Toast.makeText(Login.this, "Insira uma senha válida", Toast.LENGTH_SHORT).show();
                }
                else{
                }
            }
        });

        tvReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Registration.class);
                startActivity(i);
                finish();
            }
        });
    }
}
