package com.example.tablayoutcollapsetoobal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.palette.graphics.Palette;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPage;
    private ViewPageAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbal();

        mTabLayout = findViewById (R.id. tablayout);
        mViewPage = findViewById (R.id.viewpager);

        mViewPagerAdapter = new ViewPageAdapter(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPage.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPage);
        setmTabLayoutAnimation();

    }

    private void initToolbal() {
        Toolbar toolbar = findViewById(R.id.toolbal);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    private void setmTabLayoutAnimation() {
        final CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolbarLayout);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.meme);
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(@Nullable Palette palette) {
                int mycolor = palette.getVibrantColor(getResources().getColor(R.color.black));
                int myDarkcolor = palette.getVibrantColor(getResources().getColor(R.color.primary));
                collapsingToolbarLayout.setContentScrimColor(mycolor);
                collapsingToolbarLayout.setStatusBarScrimColor(myDarkcolor);
            }
        });
    }
}