package com.timfreebernii.hotsbuddy;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class HeroDataModel {

    private String mHeroName;
    private String mHeroImage;
    private String mHeroGroup;

    public String getHeroName() {
        return this.mHeroName;
    }

    public String getHeroImage() {
        return this.mHeroImage;
    }

    public String getHeroGroup() {
        return this.mHeroGroup;
    }


    public static HeroDataModel fromJson(JSONObject jsonObject) {
        HeroDataModel h = new HeroDataModel();

        try {

            h.mHeroName = jsonObject.getString("PrimaryName");
            h.mHeroImage = jsonObject.getString("ImageURL");
            h.mHeroGroup = jsonObject.getString("Group");

        } catch (JSONException e) {
            e.printStackTrace();
            return null;

        }
//        Log.d("HeroData", "HeroData " + h);
        return h;

    }


    public static ArrayList<HeroDataModel> fromJson(JSONArray jsonObjects) {
        JSONObject heroJson;
        ArrayList<HeroDataModel> heroes = new ArrayList<HeroDataModel>();

        for (int i = 0; i < jsonObjects.length(); i++) {
            try {
                heroJson = jsonObjects.getJSONObject(i);
//                Log.d("JSON", "Hero JSON " + heroJson);
            } catch (JSONException e) {
                e.printStackTrace();
                continue;
            }

            HeroDataModel hero = HeroDataModel.fromJson(heroJson);
            if (hero != null) {
                heroes.add(hero);
            }

        }
//        Log.d("Hero Array", "Heroe's Array" + heroes);
        return heroes;
    }



}
