package com.timfreebernii.hotsbuddy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class HeroImageAdapter extends BaseAdapter {
    private Context mContext;

    public HeroImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView heroView;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            heroView = new ImageView(mContext);
            heroView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
            heroView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            heroView.setPadding(8, 8, 8, 8);
        } else {
            heroView = (ImageView) convertView;
        }

        heroView.setImageResource(mThumbIds[position]);
        return heroView;
    }

    private Integer[] mThumbIds = {
            R.drawable.abathur_thumb, R.drawable.alarak_thumb,
            R.drawable.alexstrasza_thumb, R.drawable.ana_thumb,
            R.drawable.anubarak_thumb, R.drawable.artanis_thumb,
            R.drawable.arthas_thumb, R.drawable.auriel_thumb

    };

}
