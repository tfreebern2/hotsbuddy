package com.timfreebernii.hotsbuddy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroListAdapter extends ArrayAdapter<HeroDataModel> {

    public HeroListAdapter(HeroListActivity context, ArrayList<HeroDataModel> heroes) {
        super(context, 0, heroes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HeroDataModel currentHero = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hero_list_item, parent, false);
        }



        TextView heroNameView = convertView.findViewById(R.id.hero_name);

        TextView heroImageView = convertView.findViewById(R.id.hero_image);

        TextView heroGroupView = convertView.findViewById(R.id.hero_group);

        heroNameView.setText(currentHero.getHeroName());
        heroImageView.setText(currentHero.getHeroImage());
        heroGroupView.setText(currentHero.getHeroGroup());

        return convertView;
    }

}
