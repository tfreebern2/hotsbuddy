package com.timfreebernii.hotsbuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class HeroListActivity extends AppCompatActivity {

    final String HEROES_URL = "https://api.hotslogs.com/Public/Data/Heroes";

    HeroListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);
        heroListAPI(HEROES_URL);

        ListView listView = (ListView) findViewById(R.id.lvHeroes);
        adapter = new HeroListAdapter(this, new ArrayList<HeroDataModel>());
        listView.setAdapter(adapter);
    }

    private void heroListAPI(String url) {

        AsyncHttpClient client = new AsyncHttpClient();

        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
//                ArrayList<HeroDataModel> heroes = HeroDataModel.fromJson(response);
//                heroes.clear(); // clear existing items if needed
//                heroes.addAll(HeroDataModel.fromJson(response)); // add new items
//                adapter.notifyDataSetChanged();
                ArrayList<HeroDataModel> myHeroes = HeroDataModel.fromJsonToModelList(response);
                Log.i("HeroListActivity", myHeroes.toString());
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
