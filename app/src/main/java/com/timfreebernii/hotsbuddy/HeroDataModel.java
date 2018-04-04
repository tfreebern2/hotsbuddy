package com.timfreebernii.hotsbuddy;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class HeroDataModel {

    private String mHeroName;
    private JSONObject mHeroImage;
    private String mHeroGroup;

    public String getHeroName() {
        return this.mHeroName;
    }

    public JSONObject getHeroImage() {
        return this.mHeroImage;
    }

//    public String getHeroGroup() {
//        return this.mHeroGroup;
//    }

    public static HeroDataModel fromJsonToModel(JSONObject jsonObject) {
        HeroDataModel h = new HeroDataModel();

        try {

            h.mHeroName = jsonObject.getString("name");
            h.mHeroImage = jsonObject.getJSONObject("icon_url");
            Log.d("HoTS", h.mHeroImage.getString("92x93"));

        } catch (JSONException e) {
            e.printStackTrace();
            return null;

        }
        return h;

    }

    public static ArrayList<HeroDataModel> fromJsonToModelList(JSONArray jsonObjects) {
        JSONObject heroJson;
        ArrayList<HeroDataModel> heroes = new ArrayList<HeroDataModel>();

        for (int i = 0; i < jsonObjects.length(); i++) {
            try {
                heroJson = jsonObjects.getJSONObject(i);
            } catch (JSONException e) {
                e.printStackTrace();
                continue;
            }

            HeroDataModel hero = HeroDataModel.fromJsonToModel(heroJson);
            if (hero != null) {
                heroes.add(hero);
            }

        }
        return heroes;
    }

}

