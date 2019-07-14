package com.example.chronicplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login, register;
    private EditText password, username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickerFunction();
    }

    public void clickerFunction() {
        login = (Button)findViewById(R.id.login_button);
        register = (Button)findViewById(R.id.register);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password1);

        login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("ParthSolanki1") && password.getText().toString().equals("KanakSolanki1")){
                            Intent intent = new Intent(MainActivity.this, Dashboard.class);
                            startActivity(intent);
                        } else {
                            password.setText("");
                            Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        register.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, registration.class);
                        startActivity(intent);
                    }
                }
        );


    }
}
