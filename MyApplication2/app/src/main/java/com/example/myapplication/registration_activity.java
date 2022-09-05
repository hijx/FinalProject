package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration_activity extends AppCompatActivity {

    EditText EditTextFullName;
    EditText EditTextPhoneNumber;
    EditText EditTextEmail;
    EditText EditTextPassword;
    Button RegistrationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        EditTextFullName = findViewById(R.id.editTextFullName);
        EditTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        EditTextEmail = findViewById(R.id.editTextEmail);
        EditTextPassword = findViewById(R.id.editTextPassword);
        RegistrationButton = findViewById(R.id.registrationButton);


        EditTextFullName.addTextChangedListener(textWatcher);
        EditTextPhoneNumber.addTextChangedListener(textWatcher);
        EditTextEmail.addTextChangedListener(textWatcher);
        EditTextPassword.addTextChangedListener(textWatcher);


    }


    public TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String text1 = EditTextFullName.getText().toString().trim();
            String text2 = EditTextPhoneNumber.getText().toString().trim();
            String text3 = EditTextEmail.getText().toString().trim();
            String text4 = EditTextPassword.getText().toString().trim();
            RegistrationButton.setEnabled(!(text1.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty()));

        }

        @Override
        public void afterTextChanged(Editable editable) {

            RegistrationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(registration_activity.this, "لقد تم تسجيلك" , Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(registration_activity.this,MainActivity2.class);
                    startActivity(intent);
                }
            });



        }
    };








}