package com.example.owner.myunist_info;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by InJung on 2015. 9. 30..
 */
public class AnnounceViewDialog extends DialogFragment {

    static AnnounceViewDialog dialog;
    private Announce mAnnounce;

    public static AnnounceViewDialog newInstance(Announce announce) {
        dialog = new AnnounceViewDialog();
        dialog.mAnnounce = announce;

        dialog.setStyle(DialogFragment.STYLE_NO_FRAME, android.R.style.Theme_Holo_Light_NoActionBar);
        return dialog;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //LayoutInflater inflater = getActivity().getLayoutInflater();
        LayoutInflater inflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflater.inflate(R.layout.dialog_announce, null);

        TextView completeBtn = (TextView) rootView.findViewById(R.id.btn_complete);
        TextView contentTV = (TextView) rootView.findViewById(R.id.tv_content);
        contentTV.setText(mAnnounce.getContent());

        completeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(rootView).setCancelable(false);

        return builder.create();
    }
}
