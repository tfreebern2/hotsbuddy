package com.timfreebernii.hotsbuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;


public class HeroListActivity extends AppCompatActivity {

    final String BASE_URL = "https://hotsapi.net/api/v1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);

        GridView gridview = (GridView) this.findViewById(R.id.lvHeroes);
        gridview.setAdapter(new HeroImageAdapter(this));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(HeroListActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void heroProfileAPI(String url) {
        AsyncHttpClient client = new AsyncHttpClient();

        client.get(url, new JsonHttpResponseHandler() {

        });
    }

}
