package com.timfreebernii.hotsbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class HeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hero_activity);

        Button heroRosterButton = (Button) findViewById(R.id.heroRosterButton);

        heroRosterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent heroRosterIntent = new Intent(HeroActivity.this, HeroListActivity.class);
                startActivity(heroRosterIntent);
            }
        });

    }
}
