package com.example.newui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.airbnb.lottie.LottieAnimationView;



public class IntroductoryActivity extends AppCompatActivity  {

    ImageView logo,splashImg;
    LottieAnimationView lottieAnimationView;
    TextView appName;
    private static final int NUM_PAGES = 3;
    private ViewPager viewPager;
    private ScreenSlidePagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);


        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        splashImg = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);


        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        splashImg.animate().translationY(-2400).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(-1400).setDuration(1000).setStartDelay(4000);


//
//        public void sendMessage(View arg0) {
//
//            Intent loginTo = new Intent(this,LoginActivity.class);
//        startActivity(loginTo);
//        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    OnBoardingFradment1 tab1 = new OnBoardingFradment1();
                    return tab1;
                case 1:
                    OnBoardingFradment2 tab2 = new OnBoardingFradment2();
                    return tab2;
                case 2:
                    OnBoardingFradment3 tab3 = new OnBoardingFradment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }


}
