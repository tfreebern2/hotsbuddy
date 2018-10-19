package com.timfreebernii.hotsbuddy;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.Arrays;

import de.hdodenhof.circleimageview.CircleImageView;

public class HeroListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;


    public HeroListAdapter(Context c) {
        mContext = c;
        mInflater = LayoutInflater.from(c);
    }

    public String[] getHeroIds() {
        return mHeroIds;
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

        ViewHolder vh;
        CircleImageView heroView;

        if (convertView == null) {
            vh = new ViewHolder();
            heroView = new CircleImageView(mContext);

            convertView = mInflater.inflate(R.layout.hero_list_item,
                    parent,false);

            vh.heroName = convertView.findViewById(R.id.hero_name);
            vh.heroIcon = heroView;
            vh.heroIcon = convertView.findViewById(R.id.hero_icon);

            convertView.setTag(vh);

        } else {
            vh = (ViewHolder) convertView.getTag();
        }

//        vh.heroName.setText(mHeroIds[position]);
        vh.heroName.setText(String.valueOf(herostring[position]));
        vh.heroIcon.setImageResource(mThumbIds[position]);
        vh.heroIcon.setScaleType(ImageView.ScaleType.CENTER_CROP);

        return convertView;
    }

    public String[] mHeroIds = {
            "Abathur", "Alarak", "Alexstrasza", "Ana", "Anub'arak", "Artanis", "Arthas", "Auriel", "Azmodan", "Blaze",
            "Brightwing", "Cassia", "Chen", "Cho", "Chromie", "D.Va", "Dehaka", "Diablo", "E.T.C", "Falstad", "Fenix",
            "Gall", "Garrosh", "Gazlowe", "Genji", "Greymane", "Gul'dan", "Hanzo", "Illidan", "Jaina", "Johanna",
            "Junkrat", "Kael'thas", "Kel'thuzad", "Kerrigan", "Kharazim", "Leoric", "Li-Ming", "Li Li", "Lt. Morales",
            "Lunara", "Lúcio", "Maiev", "Malfurion", "Malthael", "Medivh", "Muradin", "Murky", "Nazeebo", "Nova",
            "Probius", "Ragnaros", "Raynor", "Rehgar", "Rexxar", "Samuro", "Sgt. Hammer", "Sonya", "Stitches", "Stukov",
            "Sylvanas", "Tassadar", "The Butcher", "Thrall", "Tracer", "Tychus", "Tyrael", "Uther", "Valla", "Varian",
            "Xul", "Zagara", "Zarya", "Zeratul", "Zul'jin"
    };


    private Integer[] mThumbIds = {
            R.drawable.abathur_thumb, R.drawable.alarak_thumb, R.drawable.alexstrasza_thumb, R.drawable.ana_thumb,
            R.drawable.anubarak_thumb, R.drawable.artanis_thumb, R.drawable.arthas_thumb, R.drawable.auriel_thumb,
            R.drawable.azmodan_thumb, R.drawable.blaze_thumb, R.drawable.brightwing_thumb, R.drawable.cassia_thumb,
            R.drawable.chen_thumb, R.drawable.cho_thumb, R.drawable.chromie_thumb, R.drawable.dva_thumb,
            R.drawable.dehaka_thumb, R.drawable.diablo_thumb, R.drawable.etc_thumb, R.drawable.falstad_thumb,
            R.drawable.fenix_thumb, R.drawable.gall_thumb, R.drawable.garrosh_thumb, R.drawable.gazlowe_thumb,
            R.drawable.genji_thumb, R.drawable.greymane_thumb, R.drawable.guldan_thumb, R.drawable.hanzo_thumb,
            R.drawable.illidan_thumb, R.drawable.jaina_thumb, R.drawable.johanna_thumb, R.drawable.junkrat_thumb,
            R.drawable.kaelthas_thumb, R.drawable.kelthuzad_thumb, R.drawable.kerrigan_thumb,
            R.drawable.kharazim_thumb, R.drawable.leoric_thumb, R.drawable.li_ming_thumb, R.drawable.li_li_thumb,
            R.drawable.lt_morales_thumb, R.drawable.lunara_thumb, R.drawable.lucio_thumb, R.drawable.maiev_thumb,
            R.drawable.malfurion_thumb, R.drawable.malthael_thumb, R.drawable.medivh_thumb, R.drawable.muradin_thumb,
            R.drawable.murky_thumb, R.drawable.nazeebo_thumb, R.drawable.nova_thumb, R.drawable.probius_thumb,
            R.drawable.ragnaros_thumb, R.drawable.raynor_thumb, R.drawable.rehgar_thumb, R.drawable.rexxar_thumb,
            R.drawable.samuro_thumb, R.drawable.sgt_hammer_thumb, R.drawable.sonya_thumb, R.drawable.stitches_thumb,
            R.drawable.stukov_thumb, R.drawable.sylvanas_thumb, R.drawable.tassadar_thumb, R.drawable.the_butcher_thumb,
            R.drawable.thrall_thumb, R.drawable.tracer_thumb, R.drawable.tychus_thumb, R.drawable.tyrael_thumb,
            R.drawable.uther_thumb, R.drawable.valla_thumb, R.drawable.varian_thumb, R.drawable.xul_thumb,
            R.drawable.zagara_thumb, R.drawable.zarya_thumb, R.drawable.zertatul_thumb, R.drawable.zuljin_thumb
    };

}
