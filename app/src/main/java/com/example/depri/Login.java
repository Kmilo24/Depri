package com.example.depri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    private EditText iD,pass;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }
    public void btnReg(View view){
        startActivity(new Intent(getApplicationContext(), Register.class));
    }

    public void btnLog(View view){
        pass=findViewById(R.id.passWord);
        iD=findViewById(R.id.iD);
        mAuth = FirebaseAuth.getInstance();

        String email=iD.getText().toString().trim();
        String password=pass.getText().toString().trim();

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Login.this, "Si", Toast.LENGTH_SHORT).show();

                    //startActivity(new Intent(getApplicationContext(), Principal.class));
                } else {

                    Toast.makeText(Login.this, "No", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}