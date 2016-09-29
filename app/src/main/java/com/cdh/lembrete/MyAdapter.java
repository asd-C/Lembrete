package com.cdh.lembrete;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chendehua on 16/9/27.
 */

public class MyAdapter extends ArrayAdapter<Task>{

    public MyAdapter(Context context, List<Task> objects) {
        super(context, -1, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View view;

        if (convertView == null) {
            view = View.inflate(getContext(), R.layout.item_list, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }

        Task task = getItem(position);
        holder.date.setText(task.getDate());
        holder.name.setText(task.getName());
        holder.tags.setText(task.getTagsString());

        return view;
    }

    private class ViewHolder {
        final TextView name;
        final TextView tags;
        final TextView date;

        public ViewHolder(View view) {
            this.name = (TextView) view.findViewById(R.id.tv_name);
            this.tags = (TextView) view.findViewById(R.id.tv_tags);
            this.date = (TextView) view.findViewById(R.id.tv_date);
        }
    }
}
