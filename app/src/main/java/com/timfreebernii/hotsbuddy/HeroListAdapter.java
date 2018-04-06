package com.timfreebernii.hotsbuddy;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HeroListAdapter extends ArrayAdapter<HeroDataModel> {

    private Context mContext;

    public HeroListAdapter(HeroListActivity context, ArrayList<HeroDataModel> heroes) {
        super(context, 0, heroes);
        mContext = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HeroDataModel currentHero = getItem(position);
        ViewHolder vh;
//        ImageView heroView;
        String url = currentHero.getHeroImageURL();
        Log.d("url", currentHero.getHeroImageURL());

        if (convertView == null) {
            vh = new ViewHolder();
//            heroView = new ImageView(mContext);

            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hero_list_item, parent, false);

            vh.heroName = (TextView) convertView.findViewById(R.id.hero_name);


//            vh.heroIcon = heroView;
            vh.heroIcon = convertView.findViewById(R.id.hero_icon);

            convertView.setTag(vh);

        } else {
            vh = (ViewHolder) convertView.getTag();
        }


        vh.heroName.setText(currentHero.getHeroName());
        Picasso.get().load(url).into(vh.heroIcon);
        vh.heroIcon.setScaleType(ImageView.ScaleType.CENTER_CROP);

        return convertView;
    }

}
