package com.example.tp4.ui.main;

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
import androidx.viewpager.widget.ViewPager;

import com.example.tp4.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    ViewPager viewpager;

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return DeuxiemeFragment.newInstance(0,R.drawable.automnee,R.drawable.hivers,R.drawable.printemps,R.drawable.sayf);
            case 1:
                return NatureFragment.newInstance(1, mContext.getString(R.string.titre_section1),R.drawable.printemps);
            case 2:
                return NatureFragment.newInstance(2, mContext.getString(R.string.titre_section2),R.drawable.sayf);
            case 3:
                return NatureFragment.newInstance(3,mContext.getString(R.string.titre_section3),R.drawable.automnee);
            case 4:
                return NatureFragment.newInstance(4, mContext.getString(R.string.titre_section4),R.drawable.hivers);
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return null;
    }

    @Nullable
   @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        String titre="";
        Drawable icone=null;

        switch (position) {
            case 0:
                titre =
                        mContext.getString(R.string.titre_section0).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.durable);

                break;

            case 1:
                titre =
                        mContext.getString(R.string.titre_section1).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.feuille);

                break;

            case 2:
                titre =
                        mContext.getString(R.string.titre_section2).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.dim);

                break;
            case 3:
                titre =
                        mContext.getString(R.string.titre_section3).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.a);

                break;
            case 4:
                titre =
                        mContext.getString(R.string.titre_section4).toUpperCase(l);
                icone =
                        mContext.getResources().getDrawable(R.drawable.neige);

                break;



        }
        SpannableString sb ;
        sb=new SpannableString(" " + titre);
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
        return  5;
    }


}