package com.timfreebernii.hotsbuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class HeroListAdapter extends ArrayAdapter<HeroDataModel> {

    public HeroListAdapter(Context context, List<HeroDataModel> heroes) {
        super(context, 0, heroes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HeroDataModel hero = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hero_list_item, parent, false);
        }

//        HeroDataModel currentHero = getItem(position);

        TextView heroNameView = convertView.findViewById(R.id.hero_name);

        TextView heroImageView = convertView.findViewById(R.id.hero_image);

        TextView heroGroupView = convertView.findViewById(R.id.hero_group);

        heroNameView.setText(hero.getHeroName());
        heroImageView.setText(hero.getHeroImage());
        heroGroupView.setText(hero.getHeroGroup());

        return convertView;
    }

}
