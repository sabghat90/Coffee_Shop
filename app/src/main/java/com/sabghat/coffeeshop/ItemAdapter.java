package com.sabghat.coffeeshop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private final List<ItemModelClass> itemModelClassList;

    public ItemAdapter(List<ItemModelClass> itemModelClassList) {
        this.itemModelClassList = itemModelClassList;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int itemImage = itemModelClassList.get(position).getItemImage();
        String itemName = itemModelClassList.get(position).getTvItemName();
        String itemDescription = itemModelClassList.get(position).getTvItemDescription();

        holder.setData(itemImage,itemName,itemDescription);
    }

    @Override
    public int getItemCount() {
        return itemModelClassList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivItemImage;
        private TextView tvItemName;
        private TextView tvItemDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivItemImage = itemView.findViewById(R.id.item_image);
            tvItemName = itemView.findViewById(R.id.item_name);
            tvItemDescription = itemView.findViewById(R.id.item_description);
        }

        public void setData(int item_image, String item_name, String item_description) {

            ivItemImage.setImageResource(item_image);
            tvItemName.setText(item_name);
            tvItemDescription.setText(item_description);
        }
    }
}
