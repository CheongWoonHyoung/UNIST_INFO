package com.example.owner.myunist_info;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mintaewon on 2015. 7. 30..
 */
public class SubjectListAdapter extends ArrayAdapter<SubjectListItem>{
    private Context context;
    private ArrayList<SubjectListItem> items;


    public SubjectListAdapter(Context context, int textViewResourceId, ArrayList<SubjectListItem> items){
        super(context,textViewResourceId,items);
        this.context=context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        SubjectListHolder holder = new SubjectListHolder();
        if(v==null){
            LayoutInflater vi =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.new_listview_item, null);
            holder.subject_name = (TextView) v.findViewById(R.id.subject_name);
            holder.subject_contents = (TextView) v.findViewById(R.id.subject_contents);
            holder.track = (TextView) v.findViewById(R.id.track);
            v.setTag(holder);
        }else{
            holder = (SubjectListHolder) v.getTag();
        }

        SubjectListItem sub_item = items.get(position);


        if(sub_item != null){
            holder.subject_name.setText(sub_item.subject_name);
            holder.subject_contents.setText(sub_item.subject_contents);
            holder.track.setText(sub_item.track);
        }

        return v;
    }
    public class SubjectListHolder{
        public TextView subject_name;
        public TextView subject_contents;
        public TextView track;

    }
}
