package com.example.owner.myunist_info;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// FargmentPagerAdapter

public class UNIST_Info_Fragment_pager_adapter extends FragmentPagerAdapter {

    public UNIST_Info_Fragment_pager_adapter(FragmentManager fm){
        super(fm);
    }



    @Override public Fragment getItem(int position){
        try{
            switch(position){
                case 0:
                    return MainPage.newProduction(position);

                case 1:
                    return MyPage.newProduction(position);
                default:
                    return null;
            }

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
