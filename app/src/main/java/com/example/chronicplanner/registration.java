package com.example.chronicplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    private Button register;
    private EditText email, reenter_email, password, reenter_password;
    private final String MY_TAG = "tag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        clicker();
    }

    public void clicker() {
        register = (Button)findViewById(R.id.register_butt);
        email = (EditText)findViewById(R.id.email);
        reenter_email = (EditText)findViewById(R.id.reenter_email);
        password = (EditText)findViewById(R.id.password1);
        reenter_password = (EditText)findViewById(R.id.reenter_password);

        register.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String email_str = email.getText().toString();
                        String reenter_email_str = reenter_email.getText().toString();
                        String pass = password.getText().toString();
                        String reenter_pass = reenter_password.getText().toString();
                        if(!email_str.equals(reenter_email_str)){
                            Toast.makeText(registration.this, "Emails do not match", Toast.LENGTH_SHORT).show();
                        } else if (!pass.equals(reenter_pass)){
                            Toast.makeText(registration.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                        }
                        password.setText("");
                        reenter_password.setText("");
                    }
                }
        );
    }
}
