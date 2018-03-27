package com.timfreebernii.hotsbuddy;

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


    @Override
    public String toString() {
        return "HeroDataModel: { " +
                "name=" + mHeroName  +
                ", image=" + mHeroImage  +
                ", group=" + mHeroGroup +
                " }";
    }


    public static HeroDataModel fromJsonToModel(JSONObject jsonObject) {
        HeroDataModel h = new HeroDataModel();

        try {

            h.mHeroName = jsonObject.getString("PrimaryName");
            h.mHeroImage = jsonObject.getString("ImageURL");
            h.mHeroGroup = jsonObject.getString("Group");

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
