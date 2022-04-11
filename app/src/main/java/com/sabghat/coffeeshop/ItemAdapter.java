package com.sabghat.coffeeshop;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    String[] itemName, itemDescription;
    int[] imageResource;
    Context ctx;

    public ItemAdapter(String[] itemName, String[] itemDescription, int[] imageResource, Context ctx) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.imageResource = imageResource;
        this.ctx = ctx;
        Log.d("Adapter","Item Adapter ctor finished");
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(ctx);
        View view = layoutInflater.inflate(R.layout.item_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvItemName.setText(itemName[position]);
        holder.tvItemDescription.setText(itemDescription[position]);
        holder.imageView.setImageResource(imageResource[position]);
    }

    @Override
    public int getItemCount() {
        return itemName.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvItemName, tvItemDescription;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvItemName = itemView.findViewById(R.id.item_name);
            tvItemDescription = itemView.findViewById(R.id.item_description);
            imageView = itemView.findViewById(R.id.item_image);
        }
    }
}
