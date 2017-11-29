package com.workshop.register_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    EditText new_pwd, cnf_pwd;
    Button done;
    private  static String pwd, cnf_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        new_pwd = (EditText) findViewById(R.id.new_pwd);
        cnf_pwd = (EditText) findViewById(R.id.new_cnf_pwd);
        done = (Button) findViewById(R.id.done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pwd = new_pwd.getText().toString();
                cnf_password = cnf_pwd.getText().toString();
                if (TextUtils.isEmpty(pwd)) {
                    new_pwd.setError("Please enter valid password");
                    return;
                }

                if (TextUtils.isEmpty(cnf_password)) {
                    cnf_pwd.setError("Please confirm your password");
                    return;
                }

                if (pwd.equals(cnf_password)) {
                    Toast.makeText(ResetPassword.this, "Password changed Successfully", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(ResetPassword.this, "Passwords mismatched. Please enter Valid Password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
