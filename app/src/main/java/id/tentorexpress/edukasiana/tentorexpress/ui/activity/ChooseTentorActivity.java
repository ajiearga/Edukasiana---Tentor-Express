package id.tentorexpress.edukasiana.tentorexpress.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import id.tentorexpress.edukasiana.tentorexpress.R;
import id.tentorexpress.edukasiana.tentorexpress.base.BaseActivity;
import id.tentorexpress.edukasiana.tentorexpress.ui.fragment.ChooseTentorFragment;
import id.tentorexpress.edukasiana.tentorexpress.ui.fragment.ViewTentorFragment;

/**
 * Created by Irfan on 1/2/2016.
 */
public class ChooseTentorActivity extends BaseActivity {

    // Declaring Your View and Variables

    ViewPager pager;
    ViewPagerAdapter adapter;
    TabLayout tabs;
    CharSequence Titles[] = {"Pilih Tentor", "Daftar Tentor"};
    int Numboftabs = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);
        toolbar_title.setText("Pemesanan");
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, Numboftabs);
        pager = (ViewPager) findViewById(R.id.view_pager);
        pager.setAdapter(adapter);
        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(pager);
    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter {

        CharSequence Titles[];
        int NumbOfTabs; //


        public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
            super(fm);

            this.Titles = mTitles;
            this.NumbOfTabs = mNumbOfTabsumb;

        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0) {
                ChooseTentorFragment tab1 = new ChooseTentorFragment();
                return tab1;
            } else {
                ViewTentorFragment tab2 = new ViewTentorFragment();
                return tab2;
            }

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return Titles[position];
        }

        @Override
        public int getCount() {
            return NumbOfTabs;
        }

    }

    public static void startThisActivity(Context context) {
        context.startActivity(new Intent(context, ChooseTentorActivity.class));
    }

}