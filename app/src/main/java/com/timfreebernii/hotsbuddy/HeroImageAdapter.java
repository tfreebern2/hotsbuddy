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
            R.drawable.abathur_thumb, R.drawable.alarak_thumb, R.drawable.alexstrasza_thumb,
            R.drawable.ana_thumb, R.drawable.anubarak_thumb, R.drawable.artanis_thumb,
            R.drawable.arthas_thumb, R.drawable.auriel_thumb, R.drawable.azmodan_thumb,
            R.drawable.blaze_thumb, R.drawable.brightwing_thumb, R.drawable.cassia_thumb,
            R.drawable.chen_thumb, R.drawable.cho_thumb, R.drawable.chromie_thumb,
            R.drawable.dva_thumb, R.drawable.dehaka_thumb, R.drawable.diablo_thumb, R.drawable.etc_thumb,
            R.drawable.falstad_thumb, R.drawable.fenix_thumb, R.drawable.gall_thumb, R.drawable.garrosh_thumb,
            R.drawable.gazlowe_thumb, R.drawable.genji_thumb, R.drawable.greymane_thumb, R.drawable.guldan_thumb,
            R.drawable.hanzo_thumb, R.drawable.illidan_thumb, R.drawable.jaina_thumb, R.drawable.johanna_thumb,
            R.drawable.junkrat_thumb, R.drawable.kaelthas_thumb, R.drawable.kelthuzad_thumb, R.drawable.kerrigan_thumb,
            R.drawable.kharazim_thumb, R.drawable.leoric_thumb, R.drawable.Li_ming_thumb, R.drawable.li_li_thumb,
            R.drawable.lt_morales_thumb, R.drawable.lunara_thumb, R.drawable.lúcio_thumb, R.drawable.maiev_thumb,
            R.drawable.malfurion_thumb, R.drawable.malthael_thumb, R.drawable.medivh_thumb, R.drawable.muradin_thumb,
            R.drawable.murky_thumb, R.drawable.nazeebo_thumb, R.drawable.nova_thumb, R.drawable.probius_thumb,
            R.drawable.ragnaros_thumb, R.drawable.raynor_thumb, R.drawable.rehgar_thumb, R.drawable.rexxar_thumb,
            R.drawable.samuro_thumb, R.drawable.sgt_hammer_thumb, R.drawable.sonya_thumb, R.drawable.stitches_thumb,
            R.drawable.stukov_thumb, R.drawable.sylvanas_thumb, R.drawable.tassadar_thumb, R.drawable.the_butcher_thumb,
            R.drawable.thrall_thumb, R.drawable.tracer_thumb, R.drawable.tychus_thumb, R.drawable.tyrael_thumb,
            R.drawable.uther_thumb, R.drawable.valla_thumb, R.drawable.varian_thumb, R.drawable.xul_thumb,
            R.drawable.zagara_thumb, R.drawable.zarya_thumb


    };

}
