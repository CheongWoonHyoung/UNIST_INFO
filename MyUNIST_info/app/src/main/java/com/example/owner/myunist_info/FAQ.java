package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class FAQ extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_listview_for_faq);

        TextView title1 = (TextView) findViewById(R.id.question_title_1);
        TextView title2 = (TextView) findViewById(R.id.question_title_2);
        TextView title3 = (TextView) findViewById(R.id.question_title_3);
        TextView title4 = (TextView) findViewById(R.id.question_title_4);

        TextView contents2 = (TextView) findViewById(R.id.question_contents_2);
        TextView contents3 = (TextView) findViewById(R.id.question_contents_3);
        TextView contents4 = (TextView) findViewById(R.id.question_contents_4);

        TextView contents1_1 = (TextView) findViewById(R.id.question_contents_1_1);
        TextView contents1_2 = (TextView) findViewById(R.id.question_contents_1_2);
        TextView contents1_3 = (TextView) findViewById(R.id.question_contents_1_3);
        TextView contents1_4 = (TextView) findViewById(R.id.question_contents_1_4);
        TextView contents1_5 = (TextView) findViewById(R.id.question_contents_1_5);
        TextView contents1_6 = (TextView) findViewById(R.id.question_contents_1_6);
        TextView contents1_7 = (TextView) findViewById(R.id.question_contents_1_7);
        TextView contents1_8 = (TextView) findViewById(R.id.question_contents_1_8);
        TextView contents1_9 = (TextView) findViewById(R.id.question_contents_1_9);
        TextView contents1_10 = (TextView) findViewById(R.id.question_contents_1_10);
        TextView contents1_11 = (TextView) findViewById(R.id.question_contents_1_11);
        TextView contents1_12 = (TextView) findViewById(R.id.question_contents_1_12);
        TextView contents1_13 = (TextView) findViewById(R.id.question_contents_1_13);
        TextView contents1_14 = (TextView) findViewById(R.id.question_contents_1_14);
        TextView contents1_15 = (TextView) findViewById(R.id.question_contents_1_15);
        TextView contents1_16 = (TextView) findViewById(R.id.question_contents_1_16);
        TextView contents1_17 = (TextView) findViewById(R.id.question_contents_1_17);
        TextView contents1_18 = (TextView) findViewById(R.id.question_contents_1_18);
        TextView contents1_19 = (TextView) findViewById(R.id.question_contents_1_19);
        TextView contents1_20 = (TextView) findViewById(R.id.question_contents_1_20);

        TextView contents2_2 = (TextView) findViewById(R.id.question_contents_2_2);
        TextView contents3_2 = (TextView) findViewById(R.id.question_contents_3_2);

        title1.setText(R.string.faq_1_1);
        title2.setText(R.string.faq_2_1);
        title3.setText(R.string.faq_3_1);
        title4.setText(R.string.faq_4_1);

        contents2.setText(R.string.faq_2_2);
        contents3.setText(R.string.faq_3_2);
        contents4.setText("QnA에 글을 남겨주세요. \n메일로 답변을 보내드립니다.");

        contents1_1.setText(R.string.faq_1_2_1);
        contents1_3.setText(R.string.faq_1_2_2);
        contents1_5.setText(R.string.faq_1_2_3);
        contents1_7.setText(R.string.faq_1_2_4);
        contents1_9.setText(R.string.faq_1_2_5);
        contents1_11.setText(R.string.faq_1_2_6);
        contents1_13.setText(R.string.faq_1_2_7);
        contents1_15.setText(R.string.faq_1_2_8);
        contents1_17.setText(R.string.faq_1_2_9);
        contents1_19.setText(R.string.faq_1_2_10);

        contents1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://mne.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(gotoweb);
            }
        });
        contents1_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://dgs.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);
            }
        });
        contents1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://uee.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://dhe.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://mse.unist.ac.kr/index.sko");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents1_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://eche.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents1_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://ece.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents1_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://sls.unist.ac.kr/ko/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents1_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://sns.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents1_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://management.unist.ac.kr/kor/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://adm-u.unist.ac.kr/");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
        contents3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("career.go.kr");
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(gotoweb);

            }
        });
    }


}
