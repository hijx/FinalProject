package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Action> actions = new ArrayList<Action>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Action a1 = new Action("فعاليه الخياطه", R.drawable.img_3,
                "فعاليه الخياطه هي فعاليع للفتيات فقط وسوف تتعلم ىفيها الفتيات اشيائ كثيره عن الخياطه",
                "بعدين اكتب هذا" );
        Action a2 = new Action("فعاليه التلويت", R.drawable.img_5,
                "فعاليه الخياطه هي فعاليع للفتيات فقط وسوف تتعلم ىفيها الفتيات اشيائ كثيره عن الخياطه",
                "بعدين اكتب هذا");
        Action a3 = new Action("فعاليه بسمه الربيع", R.drawable.img, "فعاليه الخياطه هي فعاليع للفتيات فقط وسوف تتعلم ىفيها الفتيات اشيائ كثيره عن الخياطه",
                "بعدين اكتب هذا");


        actions.add(a1);
        actions.add(a2);
        actions.add(a3);

        actionAdapter actionAdapter = new actionAdapter(this, 0, actions);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(actionAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Action currentAction = actions.get(i);
                Intent intent = new Intent(MainActivity2.this , activity_details.class);
                intent.putExtra("Action", currentAction);
                startActivity(intent);
            }
        });


    }
}