package com.example.shaastra.shaastra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aerofest extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> listAdapter;
    String fragmentArray[] = {"AeroEvent1", "AeroEvent2","AeroEvent3","AeroEvent4","AeroEvent5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerofest);


        listView = (ListView) findViewById(R.id.aeroeventslist);
        listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fragmentArray);
        listView.setAdapter(listAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), AeroEvent1.class);
                    startActivityForResult(myIntent, 0);

                } else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), AeroEvent2.class);
                    startActivityForResult(myIntent, 0);

                } else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), AeroEvent3.class);
                    startActivityForResult(myIntent, 0);

                }
                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), AeroEvent4.class);
                    startActivityForResult(myIntent, 0);

                } else {
                    Intent myIntent = new Intent(view.getContext(), AeroEvent5.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });
    }
}

