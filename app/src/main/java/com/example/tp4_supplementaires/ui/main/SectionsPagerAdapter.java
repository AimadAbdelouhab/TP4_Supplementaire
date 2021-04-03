package com.example.tp4_supplementaires.ui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tp4_supplementaires.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    //@StringRes
    //private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    @SuppressLint("SupportAnnotationUsage")
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                return SaisonsFragment.newInstance(0, mContext.getString(R.string.titre_section5),
                        R.drawable.hiver,R.drawable.printemps,R.drawable.ete,R.drawable.automne);
            case 1:
                return NatureFragment.newInstance(0, mContext.getString(R.string.titre_section0),R.drawable.hiver);
            case 2:
                return NatureFragment.newInstance(1, mContext.getString(R.string.titre_section1),R.drawable.printemps);
            case 3:
                return NatureFragment.newInstance(2, mContext.getString(R.string.titre_section2),R.drawable.ete);
            case 4:
                return NatureFragment.newInstance(3, mContext.getString(R.string.titre_section3),R.drawable.automne);
        }
        return null;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // return mContext.getResources().getString(TAB_TITLES[position]);
        Locale l = Locale.getDefault();
        String titre="";
        Drawable icone=null;
        switch (position) {
            case 0:
                titre =
                        mContext.getString(R.string.titre_section5).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.seasons);
                break;

            case 1:
                titre =
                        mContext.getString(R.string.titre_section0).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.flocon);
                break;
            case 2:
                titre =
                        mContext.getString(R.string.titre_section1).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.fleur);
                break;
            case 3:
                titre =
                        mContext.getString(R.string.titre_section2).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.soleil);
                break;
            case 4:
                titre =
                        mContext.getString(R.string.titre_section3).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.feuille);
                break;
        }
        SpannableString sb = new SpannableString("   " + titre);
        // un espace est ajouté pour séparer le texte de l'image
        icone.setBounds(0, 0, icone.getIntrinsicWidth(),
                icone.getIntrinsicHeight());
        ImageSpan span = new ImageSpan(icone,
                ImageSpan.ALIGN_BASELINE);
        sb.setSpan(span, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }


}