package com.example.owner.myunist_info;

import android.content.Context;

import android.content.Intent;
import android.view.View;

public class Go_to_lec_page implements View.OnClickListener {
    protected int transfer_code;
    private Context intro_context;
    public Go_to_lec_page(){

    }
    public Go_to_lec_page(int send_code, Context getcontext){
        transfer_code = send_code;
        intro_context = getcontext;
    }

    public void onClick(View v) {
        Intent trans = new Intent(intro_context,LecPage_Popup.class);
        trans.putExtra("get_code", transfer_code);
        intro_context.startActivity(trans);
    }
}