package com.example.skrajput.ex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class AfterLogin extends AppCompatActivity {
Button signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        //Get Firebase auth instance
        LoginActivity.auth = FirebaseAuth.getInstance();
        findViewById(R.id.signout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity.auth.signOut();
                Toast.makeText(AfterLogin.this, "Sign out", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(AfterLogin.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
