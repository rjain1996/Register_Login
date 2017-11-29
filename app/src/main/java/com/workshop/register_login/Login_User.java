package com.workshop.register_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login_User extends AppCompatActivity {

    EditText email, pwd, cnf_pwd;
    Button register;
    TextView sign_in;
    private static String email_add;
    private static String password;
    private static String p_word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__user);
        email = (EditText) findViewById(R.id.email);
        pwd = (EditText) findViewById(R.id.password);
        cnf_pwd = (EditText) findViewById(R.id.cnf_password);
        pwd.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        cnf_pwd.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        register = (Button) findViewById(R.id.register);
        sign_in = (TextView) findViewById(R.id.SignIn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email_add = email.getText().toString();
                password = pwd.getText().toString();
                p_word = cnf_pwd.getText().toString();

                if (email_add.length() == 0) {
                    email.setError("Please enter valid email address");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    pwd.setError("Please enter valid password");
                    return;
                }

                if (TextUtils.isEmpty(p_word)) {
                    cnf_pwd.setError("Please confirm your password");
                    return;
                }

                if (password.equals(p_word)) {
                    Toast.makeText(Login_User.this, "User registered Successfully", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(Login_User.this, "Passwords mismatched. Please enter Valid Password.", Toast.LENGTH_SHORT).show();
        }

    }
        });

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_User.this, SignIn.class);
                startActivity(intent);
            }
        });
    }
}



