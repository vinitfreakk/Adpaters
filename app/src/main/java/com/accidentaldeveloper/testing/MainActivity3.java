package com.accidentaldeveloper.testing;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView listview2 = findViewById(R.id.listview2);//getting listview id
        Button btn3 = findViewById(R.id.btn3);

        String [] version = {"jellybean","lollipop","kitkat","marshmello","android 10","android 11","android 12","jellybean","lollipop","kitkat","marshmello","android 10","android 11","android 12"};// made data for listview

        ArrayAdapter<String> link1 = new ArrayAdapter<>(this,R.layout.myitems,R.id.textview1,version);

        listview2.setAdapter(link1);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}