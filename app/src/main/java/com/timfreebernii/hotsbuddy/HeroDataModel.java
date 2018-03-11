package com.timfreebernii.hotsbuddy;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HeroDataModel {

    private String mHeroName;
    private String mHeroImage;
    private String mHeroGroup;

    // TODO: Create a HeroDataModel from a JSON:
    public static HeroDataModel fromJson(JSONObject jsonObject) {

        try {

            HeroDataModel heroData = new HeroDataModel();

            heroData.mHeroName = jsonObject.getJSONObject(String.valueOf(0)).getString("PrimaryName");
            heroData.mHeroImage = jsonObject.getJSONObject(String.valueOf(0)).getString("ImageURL");
            heroData.mHeroGroup = jsonObject.getJSONObject(String.valueOf(0)).getString("Group");






            return heroData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
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
