package com.site11.funwithultimate.cvapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    EditText etUserName, etPassword;
    Button login;
    String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);


        etUserName = findViewById(R.id.usermail);
        etPassword = findViewById(R.id.userpass);
        login = findViewById(R.id.loginbtn);

        user = etUserName.getText().toString();
        pass = etPassword.getText().toString();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.equals(" ") || pass.equals(" ")){
                    Toast.makeText(getApplicationContext(),"You must fill",Toast.LENGTH_LONG);
                }
                else if(user.equals("prasad")  && pass.equals("1234") ){

                    Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG);


                }
                else{
                    Toast.makeText(getApplicationContext(),"User Name or Password is Wrong",Toast.LENGTH_LONG);
                }

                Intent i = new Intent(Login.this,HomeActivity.class);
                startActivity(i);

            }
        });



    }
    @Override
    public void onBackPressed() {

    }




}

