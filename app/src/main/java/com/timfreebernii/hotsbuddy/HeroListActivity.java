package com.timfreebernii.hotsbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class HeroListActivity extends AppCompatActivity {

    final String BASE_URL = "https://hotsapi.net/api/v1";
    public static final String EXTRA_HERO = "EXTRA_HERO";
    private static final int REQUEST_RESPONSE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);

        final GridView gridview = (GridView) this.findViewById(R.id.lvHeroes);
        gridview.setAdapter(new HeroListAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(HeroListActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(HeroListActivity.this, HeroProfileActivity.class);
                intent.putExtra(EXTRA_HERO, position);
                startActivityForResult(intent, REQUEST_RESPONSE);

            }
        });

    }
}
