package com.example.secondmadang;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Challenge13_dataAdapter extends RecyclerView.Adapter<Challenge13_dataAdapter.ViewHolder> {
    ArrayList<Challenge13_data> items = new ArrayList<>();

    public void addItem(Challenge13_data item) {
        items.add(item);
    }

    public void setItems(ArrayList<Challenge13_data> items) {
        this.items = items;
    }

    public Challenge13_data getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, Challenge13_data item) {
        items.set(position, item);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.person_item, viewGroup, false);   // 인플레이션을 통해 뷰 객체 생성

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Challenge13_data item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView39);
            textView2 = itemView.findViewById(R.id.textView40);
        }

        public void setItem(Challenge13_data item) {
            textView.setText(item.getName() + "#" + getAdapterPosition() + " " + item.getBirth());
            textView2.setText(item.getPhone());
        }
    }
}
