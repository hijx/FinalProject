package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_details extends AppCompatActivity {

    TextView actionNameTextView, actionExplanationTextView, actionMandatoryDocumentsTextView;
    ImageView actionImgView;
    Button toRegistrationButton;

    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.details);
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        Action deliveredAction = (Action) bundle.getSerializable("Action");

        actionNameTextView = findViewById(R.id.textView5);
        actionExplanationTextView = findViewById(R.id.textView7);
        actionMandatoryDocumentsTextView = findViewById(R.id.textView9);
        actionImgView = findViewById(R.id.imageView2);
        toRegistrationButton = findViewById(R.id.button2);

        actionNameTextView.setText(deliveredAction.getActionName());
        actionExplanationTextView.setText(deliveredAction.getActionExplanation());
        actionMandatoryDocumentsTextView.setText(deliveredAction.getActionMandatoryDocuments());
        actionImgView.setImageResource(deliveredAction.getActionImg());

        toRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_details.this, registration_activity.class);
                startActivity(intent);
            }
        });




    }


}
