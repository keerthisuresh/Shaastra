package com.example.shaastra.shaastra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Coding extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> listAdapter;
    String fragmentArray[] = {"Hackathon", "Triathlon","Reverse Coding","FOSSter","CodingEvent5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);


        listView = (ListView) findViewById(R.id.codingeventslist);
        listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fragmentArray);
        listView.setAdapter(listAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Hackathon.class);
                    startActivityForResult(myIntent, 0);

                } else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Triathlon.class);
                    startActivityForResult(myIntent, 0);

                } else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ReverseCoding.class);
                    startActivityForResult(myIntent, 0);

                }
                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), FOSSter.class);
                    startActivityForResult(myIntent, 0);

                } else {
                    Intent myIntent = new Intent(view.getContext(), CodingEvent5.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });
    }
}

