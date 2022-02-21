package com.endienasg.oil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.endienasg.oil.vendor.Resources;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);
        System.out.println(Resources.vai());
        //Resources.vai();
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new ShopTab(), "Shop");
        vpAdapter.addFragment(new WeaponaryTab(), "Weaponary");
        vpAdapter.addFragment(new MineTab(), "Mine");
        vpAdapter.addFragment(new PvpTab(), "PvP");
        vpAdapter.addFragment(new SettingsTab(), "Settings");
        viewPager.setAdapter(vpAdapter);
    }
}