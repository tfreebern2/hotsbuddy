package com.timfreebernii.hotsbuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class HeroListActivity extends AppCompatActivity {

    final String HEROES_URL = "https://api.hotslogs.com/Public/Data/Heroes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);
//        populateHeroesList();
        letsDoSomeNetworking(HEROES_URL);

    }

//    private void populateHeroesList() {
//        // Construct the data source
//        ArrayList<HeroDataModel> arrayOfHeroes = HeroDataModel.getHeroes();
//        // Create the adapter to convert the array to views
//        HeroListAdapter adapter = new HeroListAdapter(this, arrayOfHeroes);
//        // Attach the adapter to a ListView
//        ListView listView = (ListView) findViewById(R.id.lvHeroes);
//        listView.setAdapter(adapter);
//    }

    private void getHeroes() {

    }

    private void letsDoSomeNetworking(String url) {

        AsyncHttpClient client = new AsyncHttpClient();

        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                Log.d("HoTS", "Success! JSON: " + response.toString());

//                HeroDataModel heroData = HeroDataModel.fromJson(response);
////                updateUI(heroData);
//                try {
//                    String name = response.getString(Integer.parseInt("PrimaryName"));
//                    Log.d("HoTS", name);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
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
