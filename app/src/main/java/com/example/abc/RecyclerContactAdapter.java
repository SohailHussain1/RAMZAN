package com.example.abc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.Viewholder> {

    Context context;
    ArrayList<com.example.abc.eps> arr;
    public RecyclerContactAdapter(Context context, ArrayList<com.example.abc.eps> arr)
    {
        this.context=context;
        this.arr=arr;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.calender_row, parent, false);
        Viewholder view=new Viewholder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.date1.setText(arr.get(position).date2);
        holder.ramadann1.setText(arr.get(position).ramadann2);
        holder.suhoor1.setText(arr.get(position).suhoor2);
        holder.suhoort1.setText(arr.get(position).suhoort2);
        holder.iftar1.setText(arr.get(position).iftar2);
        holder.iftart1.setText(arr.get(position).iftart2);

    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder
    {
        TextView date1,ramadann1,suhoor1,suhoort1,iftar1,iftart1;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            date1=itemView.findViewById(R.id.Date);
            ramadann1=itemView.findViewById(R.id.Ramdanno);
            suhoor1=itemView.findViewById(R.id.suhoor);
            suhoort1=itemView.findViewById(R.id.stime);
            iftar1=itemView.findViewById(R.id.iftar);
            iftart1=itemView.findViewById(R.id.iftart);

        }
    }

}