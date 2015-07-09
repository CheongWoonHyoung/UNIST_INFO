package com.example.owner.myunist_info;


import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

//Main
public class MainActivity extends FragmentActivity {

    private ViewPager MainPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPager = (ViewPager)findViewById(R.id.mainpager);

        MainPager.setAdapter(new UNIST_Info_Fragment_pager_adapter(getSupportFragmentManager()));
    }


}
