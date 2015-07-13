package com.example.owner.myunist_info;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.view.LayoutInflater.from;


public class MyPage  extends Fragment {
    private View myView = null;
    private Context mycontext = null;
    public static int OPTION_INTENT_CODE = 1001;
    private AlertDialog callDialog = null;
    public static MyPage newProduction(int position) {
        MyPage mpage = new MyPage();

        return mpage;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mycontext = container.getContext();

        myView = (View) from(mycontext).inflate(
                R.layout.mypage, container, false);

        // 1 - 2 - 3 stairs
        final LinearLayout cell1 = (LinearLayout) myView.findViewById(R.id.c25);
        LinearLayout cell2 = (LinearLayout) myView.findViewById(R.id.c34);
        LinearLayout cell3 = (LinearLayout) myView.findViewById(R.id.c35);
        LinearLayout cell4 = (LinearLayout) myView.findViewById(R.id.c43);
        LinearLayout cell5 = (LinearLayout) myView.findViewById(R.id.c44);
        LinearLayout cell6 = (LinearLayout) myView.findViewById(R.id.c45);

        Button button1 = (Button) myView.findViewById(R.id.b25);
        Button button2 = (Button) myView.findViewById(R.id.b34);
        Button button3 = (Button) myView.findViewById(R.id.b35);
        Button button4 = (Button) myView.findViewById(R.id.b43);
        Button button5 = (Button) myView.findViewById(R.id.b44);
        Button button6 = (Button) myView.findViewById(R.id.b45);

        //Onclick event - a set of options
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mycontext,SendMessage.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mycontext,MyPage_Option.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mycontext,MyPage_Option.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mycontext,DeveloperInfo.class);
                intent.putExtra("OPT",4);
                startActivityForResult(intent, OPTION_INTENT_CODE);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog = createDialog();
                callDialog.show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mycontext,MyPage_Option.class);
                startActivity(intent);
            }
        });




        return myView;
    }

    private AlertDialog createDialog() {
        AlertDialog.Builder ab = new AlertDialog.Builder(mycontext);
        ab.setTitle(R.string.call_dialog_title);
        ab.setMessage(R.string.call_dialog_contents);
        ab.setCancelable(false);

        ab.setPositiveButton(R.string.call_dialog_confirm, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-5030-1671"));
                startActivity(intent);
                setDismiss(callDialog);
            }
        });

        ab.setNegativeButton(R.string.call_dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                setDismiss(callDialog);
            }
        });

        return ab.create();
    }

    private void setDismiss(Dialog dialog){
        if(dialog != null && dialog.isShowing())
            dialog.dismiss();
    }
}
