package com.example.mohamedabdelaziz.task5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
private ViewPager mViewPager;
    private int viewPagerPosition=0 ;
static ArrayList<Integer> images =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        images.add(R.drawable.b1);
        images.add(R.drawable.b2);
        images.add(R.drawable.b3);
        images.add(R.drawable.b1);
        images.add(R.drawable.b2);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        fragment f =new fragment();
        getSupportFragmentManager().beginTransaction().add(R.id.frame1,f,"").commit() ;


    }

    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.view_pager_page, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.title);
            TextView textView2 = (TextView) rootView.findViewById(R.id.desc);
            FrameLayout image = (FrameLayout) rootView.findViewById(R.id.background_image);
            textView.setText("events");
            textView2.setText("Global women's forum Dubai 2016 , organized by Dubai women Establishment");
            image.setBackgroundResource(images.get(2));
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            viewPagerPosition=position;
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

    }
}
