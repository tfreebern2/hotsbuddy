package com.timfreebernii.hotsbuddy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HeroProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_profile);

        String hero = getIntent().getStringExtra(HeroListActivity.EXTRA_HERO);
        Log.d("Hero Name", hero);
        TextView textView = (TextView) findViewById(R.id.hero_profile_name);

        textView.setText(hero);

    }

    private String[] mHeroIds = {
            "Abathur", "Alarak", "Alexstrasza", "Ana", "Anub'arak", "Artanis", "Arthas", "Auriel", "Azmodan", "Blaze",
            "Brightwing", "Cassia", "Chen", "Cho", "Chromie", "D.Va", "Dehaka", "Diablo", "E.T.C", "Falstad", "Fenix",
            "Gall", "Garrosh", "Gazlowe", "Genji", "Greymane", "Gul'dan", "Hanzo", "Illidan", "Jaina", "Johanna",
            "Junkrat", "Kael'thas", "Kel'thuzad", "Kerrigan", "Kharazim", "Leoric", "Li-Ming", "Li Li", "Lt. Morales",
            "Lunara", "Lúcio", "Maiev", "Malfurion", "Malthael", "Medivh", "Muradin", "Murky", "Nazeebo", "Nova",
            "Probius", "Ragnaros", "Raynor", "Rehgar", "Rexxar", "Samuro", "Sgt. Hammer", "Sonya", "Stitches", "Stukov",
            "Sylvanas", "Tassadar", "The Butcher", "Thrall", "Tracer", "Tychus", "Tyrael", "Uther", "Valla", "Varian",
            "Xul", "Zagara", "Zarya", "Zeratul", "Zul'jin"
    };
}
