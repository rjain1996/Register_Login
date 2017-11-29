package com.workshop.register_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPassword extends AppCompatActivity {

    EditText email;
    Button send;
    private static String email_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);


        send = (Button) findViewById(R.id.send1);
        email = (EditText) findViewById(R.id.email1);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email_add = email.getText().toString();
                if(email_add.length() == 0)
                {
                    email.setError("Please Enter valid E-Mail Address");
                    return;
                }
                Intent intent = new Intent(ForgotPassword.this, ResetPassword.class);
                startActivity(intent);
            }
        });
    }
}
