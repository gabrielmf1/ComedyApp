package br.edu.insper.al.gabrielmf1.comedyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.login_button);
        Button buttonFeed = findViewById(R.id.login_feed);


        buttonLogin.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        });

        buttonFeed.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Feed.class);
            startActivity(intent);
        });
    }
}
