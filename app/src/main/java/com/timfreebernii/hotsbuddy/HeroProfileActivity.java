package com.timfreebernii.hotsbuddy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HeroProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_profile);

        String hero = getIntent().getStringExtra(HeroListActivity.EXTRA_HERO);
        TextView textView = (TextView) findViewById(R.id.hero_profile_name);
        textView.setText(hero);

    }
}
