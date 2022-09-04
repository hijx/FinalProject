package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_details extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.details);super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        Action deliveredAction = (Action) bundle.getSerializable("Action");

        TextView actionNameTextView = findViewById(R.id.textView5);
        TextView actionExplanationTextView = findViewById(R.id.textView7);
        TextView actionMandatoryDocumentsTextView = findViewById(R.id.textView9);
        ImageView actionImgView = findViewById(R.id.imageView2);

        actionNameTextView.setText(deliveredAction.getActionName());
        actionExplanationTextView.setText(deliveredAction.getActionExplanation());
        actionMandatoryDocumentsTextView.setText(deliveredAction.getActionMandatoryDocuments());
        actionImgView.setImageResource(deliveredAction.getActionImg());



    }










}
