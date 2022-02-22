package com.endienasg.oil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.endienasg.oil.vendor.Resources;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private Resources number;

    private String name;
    private int resistance_level;
    private double furnale_temp;
    private int dollar;
    private double healthpoint;
    private double weight;

    public MainActivity(){

        /*int nm = (int) Resources.Number().get(1);
        System.out.println(nm);*/
        //System.out.println(Resources.vai().get(1).name);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        //Resources.vai();
        System.out.println(Resources.vai().get(0));
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new ShopTab(), "Shop");
        vpAdapter.addFragment(new WeaponaryTab(), "Weaponary");
        vpAdapter.addFragment(new MineTab(), "Mine");
        vpAdapter.addFragment(new PvpTab(), "PvP");
        vpAdapter.addFragment(new SettingsTab(), Resources.vai().get(1).name);
        viewPager.setAdapter(vpAdapter);
    }
}