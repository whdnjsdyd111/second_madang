package com.example.secondmadang;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Challenge14_dataAdapter extends RecyclerView.Adapter<Challenge14_dataAdapter.ViewHolder>
        implements Challenge14_listener {
    ArrayList<Challenge13_data> items = new ArrayList<>();
    Challenge14_listener listener;

    public void setListener(Challenge14_listener listener) {
        this.listener = listener;
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null)
            listener.onItemClick(holder, view, position);
    }

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

        return new ViewHolder(itemView, this);
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

        public ViewHolder(View itemView, final Challenge14_listener listener) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView39);
            textView2 = itemView.findViewById(R.id.textView40);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();

                    if(listener != null) {  // 아이템 클릭 시 미리 정의한 다른 리스너 메소드 호출
                        listener.onItemClick(Challenge14_dataAdapter.ViewHolder.this, view, position);
                    }
                }
            });
        }

        public void setItem(Challenge13_data item) {
            textView.setText(item.getName() + "#" + getAdapterPosition() + " " + item.getBirth());
            textView2.setText(item.getPhone());
        }
    }
}
