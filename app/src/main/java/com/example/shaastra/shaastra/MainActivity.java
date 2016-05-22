package com.example.shaastra.shaastra;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> listAdapter;
    String fragmentArray[] = {"Home","Events", "Workshops","Maker Summit","Shows And Exhibitions"};
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listview);
        listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fragmentArray);
        listView.setAdapter(listAdapter);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);

        Fragment fragment1 = new Home();
        FragmentManager fragmentManager1 = getFragmentManager();
        fragmentManager1.beginTransaction().replace(R.id.relativeLayout, fragment1).addToBackStack(null).commit();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment = new Workshops();
                if (position == 0) {
                    fragment = new Home();

                } else if (position == 1) {
                    fragment = new Events();

                } else if (position == 2) {
                    fragment = new Workshops();

                }
                else if (position == 3) {
                    fragment = new MakerSummit();

                } else {
                    fragment = new ShowsAndExhibitions();
                }

                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.relativeLayout, fragment).addToBackStack(null).commit();

                drawerLayout.closeDrawers();

            }
        });
    }
}