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

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hero_list_item, parent, false);
        }

        HeroDataModel currentHero = getItem(position);

        TextView heroNameView = (TextView) listItemView.findViewById(R.id.hero_name);

        TextView heroImageView = (TextView) listItemView.findViewById(R.id.hero_image);

        TextView heroGroupView = (TextView) listItemView.findViewById(R.id.hero_group);

        heroNameView.setText(currentHero.getHeroName());
        heroImageView.setText(currentHero.getHeroImage());
        heroGroupView.setText(currentHero.getHeroGroup());

        return listItemView;
    }

}
