package com.timfreebernii.hotsbuddy;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class HeroDataModel {

    private String mHeroName;
    private String mHeroImage;
    private String mHeroGroup;


    public static HeroDataModel fromJson(JSONObject jsonObject) {

        HeroDataModel hero = new HeroDataModel();

        try {

            hero.mHeroName = jsonObject.getString("PrimaryName");
            hero.mHeroImage = jsonObject.getString("ImageURL");
            hero.mHeroGroup = jsonObject.getString("Group");

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        return hero;
    }


    public static ArrayList<HeroDataModel> fromJson(JSONArray jsonArray) {
        JSONObject heroJson;

        ArrayList<HeroDataModel> heroes = new ArrayList<HeroDataModel>(jsonArray.length());

        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                heroJson = jsonArray.getJSONObject(i);
            } catch (JSONException e) {
                e.printStackTrace();
                continue;
            }

            HeroDataModel hero = HeroDataModel.fromJson(heroJson);
            if (hero != null) {
                heroes.add(hero);
            }
        }
        return heroes;
    }


    public String getHeroName() {
        return mHeroName;
    }

    public String getHeroImage() {
        return mHeroImage;
    }

    public String getHeroGroup() {
        return mHeroGroup;
    }
}
