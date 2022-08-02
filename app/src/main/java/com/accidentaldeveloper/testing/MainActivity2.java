package com.accidentaldeveloper.testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn2 = findViewById(R.id.btn2);
        ListView listview = findViewById(R.id.listview);//finding listview id
         // creating a data source
        String [] versions = {"jellybean","lollipop","kitkat","marshmello","android 10","android 11","android 12"};

        // creating Adapter
        ArrayAdapter link = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,versions);
        listview.setAdapter(link);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next1 = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(next1);
            }
        });




    }
}