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

        Action a1 = new Action("فعاليه الخياطه",
                R.drawable.img_3,
                "فعاليه الخياطه هي فعاليه هادفه, تهدف الى ابراز موهبه الخياطه والتطريز و اظهار و تطوير الحس  الابداعي و المهارات اليدويه لدى المنتسبين للمركز ",
                "للفتيات, اكبر من 15 سنه, البطاقه المدنيه, شهاده الاعاقه, القرار التاهيلي من المجلس");

        Action a2 = new Action("فعاليه الرسم والتلوين",
                R.drawable.img_5,
                "فعاليه مليئه بالنشاط والحيويه, حيث الرسم فيها مختلف, يتمكن فيها المنتسب من ابراز المهارات الفنيه عن طريق مزج الالوان والاستمتاع باحدث الاساليب المستخدمه في الرسم والتلوين",
                "للذكور والاناث, لكل الاعمار, البطاقه المدنيه, شهاده الاعاقه, القرار التاهيلي من المجلس");

        Action a3 = new Action("فعاليه اصحاب الهمم",
                R.drawable.img,
                "تهدف هذه الفعاليه الى الغوص والانغماس في نفس المنتسب للوصول و معرفه اهم الاهداف و الاحلام التي يصبوا اليها كل كنتسب ومحاوله التعمق في الافكار و تقديم التشجيع المناسب لتحقيق هذه الاهداف والاحلام",
                "للذكور والاناث, مناسب لكل الاعمار, البطاقه المدنيه, شهاده الاعاقه, القرار التاهيلي من المجلس");


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
                Intent intent = new Intent(MainActivity2.this, activity_details.class);
                intent.putExtra("Action", currentAction);
                startActivity(intent);
            }
        });


    }
}