package br.edu.insper.al.gabrielmf1.comedyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    EditText etEmail, etPass, etName, etConfirmPass;
    Button btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        etConfirmPass = findViewById(R.id.etConfirmPass);

        btnReg = findViewById(R.id.btnReg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,email,pass,confirmPass;

                name = etName.getText().toString();
                email = etEmail.getText().toString();
                pass = etPass.getText().toString();
                confirmPass = etConfirmPass.getText().toString();

                if (name.equals("")){
                    Toast.makeText(Registration.this, "Insira um nome", Toast.LENGTH_SHORT).show();
                }
                else if (email.equals("")){
                    Toast.makeText(Registration.this, "Insira uma Email válida", Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals("")){
                    Toast.makeText(Registration.this, "Insira uma senha válida", Toast.LENGTH_SHORT).show();
                }
                else if (confirmPass.equals("")){
                    Toast.makeText(Registration.this, "Insira uma senha válida", Toast.LENGTH_SHORT).show();
                }
                else if (confirmPass.equals("pass")){
                    Toast.makeText(Registration.this, "As senhas devem ser iguais", Toast.LENGTH_SHORT).show();
                }
                else{
                }
            }
        });
    }
}