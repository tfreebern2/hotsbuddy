package com.timfreebernii.hotsbuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HeroListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);
        populateHeroesList();

    }

    private void populateHeroesList() {
        // Construct the data source
        ArrayList<HeroModel> arrayOfHeroes = HeroModel.getHeroes();
        // Create the adapter to convert the array to views
        HeroListAdapter adapter = new HeroListAdapter(this, arrayOfHeroes);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvHeroes);
        listView.setAdapter(adapter);
    }

}
