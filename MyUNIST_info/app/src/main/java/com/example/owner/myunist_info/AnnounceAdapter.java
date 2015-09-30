package com.example.owner.myunist_info;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by InJung on 2015. 9. 30..
 */
public class AnnounceAdapter extends BaseAdapter {
    private ArrayList<Announce> mItems = new ArrayList<>();

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_announce, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Announce item = mItems.get(position);
        holder.titleTV.setText(item.getTitle());

        return convertView;
    }

    public void setItems(List<Announce> items) {
        for (Announce a : items)
            mItems.add(a);
    }

    public void addItem(Announce item) {
        mItems.add(item);
    }

    public class ViewHolder{
        public TextView titleTV;

        public ViewHolder(View view) {
            titleTV = (TextView) view.findViewById(R.id.tv_title);
        }
    }
}
