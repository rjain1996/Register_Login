package com.workshop.register_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    private static String email, pword;
    EditText sign_email, sign_pwd;
    Button sign;
    TextView forgotP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        sign_email = (EditText) findViewById(R.id.semail);
        sign_pwd = (EditText) findViewById(R.id.spassword);
        sign = (Button) findViewById(R.id.sign_ins);
        forgotP = (TextView) findViewById(R.id.forgotPassword);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = sign_email.getText().toString();
                pword = sign_pwd.getText().toString();

                if (email.length() == 0) {
                    sign_email.setError("Please enter valid email address");
                    return;
                }

                if (TextUtils.isEmpty(pword)) {
                    sign_pwd.setError("Please enter valid password");
                    return;
                }

               Intent intent = new Intent(SignIn.this, TextActivity.class);
                startActivity(intent);
            }
        });


        forgotP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SignIn.this, ForgotPassword.class);
                startActivity(intent1);
            }
        });

    }
}
