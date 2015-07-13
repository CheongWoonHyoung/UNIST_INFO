package com.example.owner.myunist_info;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import static android.view.LayoutInflater.from;

/**
 * Created by cheongwh on 2015. 7. 13..
 */
public class Intro_Subpager_Fragment extends Fragment {
    private int department_id;
    private int order_of_page;
    private View intro_View = null;
    private Context intro_context;
    public static Intro_Subpager_Fragment newProduction(int Number_of_page, int id) {
        Intro_Subpager_Fragment mpage = new Intro_Subpager_Fragment();
        mpage.department_id =  id;
        mpage.order_of_page = Number_of_page;


        return mpage;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        intro_context = container.getContext();

        switch(order_of_page){
            case 0:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage1, container, false);
                switch(department_id){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                }
                break;
            case 1:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage2, container, false);
                switch(department_id){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                }
                break;
            case 2:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage3, container, false);
                switch(department_id){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                }
                break;
            case 3:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage4, container, false);
                switch(department_id){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                }
                break;
            case 4:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage5, container, false);
                switch(department_id){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                }
                break;
            default:
                break;

        }



        return intro_View;
    }
}