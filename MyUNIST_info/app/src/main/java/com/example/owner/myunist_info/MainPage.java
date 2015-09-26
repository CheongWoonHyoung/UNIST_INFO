package com.example.owner.myunist_info;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.view.LayoutInflater.*;


public class MainPage extends Fragment {
    private Context maincontext = null;
    private View mainView = null;
    public static int INTRODUCTION_INTENT_CODE = 1001;

    public static MainPage newProduction(int position){
        MainPage mpage = new MainPage();

        return mpage;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        maincontext = container.getContext();

        mainView = (View) from(maincontext).inflate(
                R.layout.main, container, false);


        // 2 - 3 - 4 stairs

        LinearLayout cell4  = (LinearLayout) mainView.findViewById(R.id.c24);
        LinearLayout cell5  = (LinearLayout) mainView.findViewById(R.id.c25);
        LinearLayout cell6  = (LinearLayout) mainView.findViewById(R.id.c33);
        LinearLayout cell7  = (LinearLayout) mainView.findViewById(R.id.c34);
        LinearLayout cell8  = (LinearLayout) mainView.findViewById(R.id.c35);
        LinearLayout cell9  = (LinearLayout) mainView.findViewById(R.id.c42);
        LinearLayout cell10 = (LinearLayout) mainView.findViewById(R.id.c43);
        LinearLayout cell11 = (LinearLayout) mainView.findViewById(R.id.c44);
        LinearLayout cell12 = (LinearLayout) mainView.findViewById(R.id.c45);



        Button button4  = (Button) mainView.findViewById(R.id.b24);
        Button button5  = (Button) mainView.findViewById(R.id.b25);
        Button button6  = (Button) mainView.findViewById(R.id.b33);
        Button button7  = (Button) mainView.findViewById(R.id.b34);
        Button button8  = (Button) mainView.findViewById(R.id.b35);
        Button button9  = (Button) mainView.findViewById(R.id.b42);
        Button button10 = (Button) mainView.findViewById(R.id.b43);
        Button button11 = (Button) mainView.findViewById(R.id.b44);
        Button button12 = (Button) mainView.findViewById(R.id.b45);

        Button auth_btn = (Button) mainView.findViewById(R.id.auth_btn);
        //Onclick event - Introduction of department

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",1);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",2);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",3);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",4);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",5);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",6);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",7);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",8);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Introduction.class);
                intent.putExtra("DEPT",9);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });
        auth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maincontext,Select_between_two.class);
                startActivityForResult(intent,INTRODUCTION_INTENT_CODE);
            }
        });





        return mainView;
    }
}
