package com.timfreebernii.hotsbuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;


public class HeroListActivity extends AppCompatActivity {

    final String HEROES_URL = "https://hotsapi.net/api/v1";

    HeroListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);
        heroListAPI(HEROES_URL);

        GridView gridview = (GridView) this.findViewById(R.id.lvHeroes);
        gridview.setAdapter(new HeroListAdapter(this, new ArrayList<HeroDataModel>()));

//        ListView listView = (ListView) findViewById(R.id.lvHeroes);
//        heroes = new ArrayList<HeroDataModel>();
//        adapter = new HeroListAdapter(this, heroes);
//        listView.setAdapter(adapter);

    }

    private void heroListAPI(String url) {

        AsyncHttpClient client = new AsyncHttpClient();

        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                ArrayList<HeroDataModel> myHeroes = HeroDataModel.fromJsonToModelList(response);

//                Log.d("HoTS", "Hero: " + myHeroes.getHeroName);

                adapter.clear();
                adapter.addAll(myHeroes);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable e, JSONArray response) {
                Log.e("HoTS", "Fail " + e.toString());
                Log.d("HoTS", "Status code " + statusCode);
                Toast.makeText(HeroListActivity.this, "Request Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
