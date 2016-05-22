package com.example.shaastra.shaastra;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Keerthi Suresh on 23-03-2016.
 */
public class Events extends Fragment{

    ListView list;
    String[] eventlist = {
            "Aerofest",
            "Coding",
            "Design and Build",
            "Electronic Fest",
            "Involve"
    } ;
    Integer[] imageId = {
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,
            };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        CustomList adapter = new
                CustomList(getActivity(), eventlist, imageId);
        View v = inflater.inflate(R.layout.fragment_events, container,false);
        final ListView list = (ListView)v.findViewById(R.id.eventslist);

        list.setAdapter(adapter);


        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String web = String.valueOf(parent.getItemAtPosition(position));
                       // Toast.makeText(Events.this,web, Toast.LENGTH_LONG).show();

                        if (position == 0) {
                            Intent myIntent = new Intent(view.getContext(), Aerofest.class);
                            startActivityForResult(myIntent, 0);
                        }
                        else if (position == 1) {
                            Intent myIntent = new Intent(view.getContext(), Coding.class);
                            startActivityForResult(myIntent, 0);
                        }
                        else if (position == 2) {
                            Intent myIntent = new Intent(view.getContext(), DesignAndBuild.class);
                            startActivityForResult(myIntent, 0);
                        }
                        else if (position == 3) {
                            Intent myIntent = new Intent(view.getContext(), ElectronicsFest.class);
                            startActivityForResult(myIntent, 0);
                        }
                        else if (position == 4) {
                            Intent myIntent = new Intent(view.getContext(), Involve.class);
                            startActivityForResult(myIntent, 0);
                        }


                    }


                });






        return v;

    }
}






