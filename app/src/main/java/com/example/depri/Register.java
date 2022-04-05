package com.example.depri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    private EditText nombres,apellidos,iD,cell,email,pass,confpass;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btnRegistra(View view){
        pass=findViewById(R.id.passWord);
        iD=findViewById(R.id.iD);
        mAuth = FirebaseAuth.getInstance();

        String email=iD.getText().toString().trim();
        String password=pass.getText().toString().trim();
    }
}