package com.example.owner.myunist_info;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Intro_FargmentPagerAdapter

public class Introduction_Fragment_pager_adapter2 extends FragmentPagerAdapter {

    private int depart_id;
    public Introduction_Fragment_pager_adapter2(FragmentManager fm, int department_id){
        super(fm);
        depart_id = department_id;
    }



    @Override public Fragment getItem(int position){
        try{
            switch(position){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return Intro_Subpager_Fragment2.newProduction(position, depart_id);
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
    public int getCount() { return 6;
    }
}
