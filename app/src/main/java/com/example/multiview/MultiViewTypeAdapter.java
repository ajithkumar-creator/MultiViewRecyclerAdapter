package com.example.multiview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MultiViewTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final ArrayList<Model> dataSet;
    static class TextTypeViewHolder extends RecyclerView.ViewHolder {
        final TextView txtType;
        final TextView txtPrice;
        final ImageView itemImage;

        TextTypeViewHolder(View itemView) {
            super(itemView);
            this.txtType = itemView.findViewById(R.id.type);
            this.txtPrice = itemView.findViewById(R.id.txt_price);
            this.itemImage = itemView.findViewById(R.id.background);
        }

    }

    static class ImageTypeViewHolder extends RecyclerView.ViewHolder {
        final TextView txtType;
        final ImageView image;
        ImageTypeViewHolder(View itemView) {
            super(itemView);
            this.txtType = itemView.findViewById(R.id.type);
            this.image = itemView.findViewById(R.id.background);
        }

    }

    static class DESCTypeViewHolder extends RecyclerView.ViewHolder {

        final TextView txtName;
        final TextView txtPrice;
        final TextView txtDescription;
        final ImageView imgItem;
        DESCTypeViewHolder(View itemView) {
            super(itemView);
            this.txtName = itemView.findViewById(R.id.item_name_three);
            this.txtPrice = itemView.findViewById(R.id.item_price_three);
            this.txtDescription = itemView.findViewById(R.id.item_short_desc);
            this.imgItem = itemView.findViewById(R.id.item_image_three);
        }

    }

    public MultiViewTypeAdapter(ArrayList<Model> data, Context context) {
        this.dataSet = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            //set the view layout basd on condition
            case Model.TEXT_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_type_one, parent, false);
                return new ImageTypeViewHolder(view);
            case Model.IMAGE_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_type_two, parent, false);
                return new TextTypeViewHolder(view);
            case Model.DESC_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_type_three, parent, false);
                return new DESCTypeViewHolder(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {

        switch (dataSet.get(position).type) {
            case 0:
                return Model.TEXT_TYPE;
            case 1:
                return Model.IMAGE_TYPE;
            case 2:
                return Model.DESC_TYPE;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int listPosition) {
        // here we can populate the datas
        Model object = dataSet.get(listPosition);
        if (object != null) {
            switch (object.type) {
                case Model.TEXT_TYPE:
                    ((ImageTypeViewHolder) holder).txtType.setText(object.text);
                    ((ImageTypeViewHolder) holder).image.setImageResource(object.data);
                    break;
                case Model.IMAGE_TYPE:
                    ((TextTypeViewHolder) holder).txtType.setText(object.text);
                    ((TextTypeViewHolder) holder).itemImage.setImageResource(object.data);
                    break;
                case Model.DESC_TYPE:
                    ((DESCTypeViewHolder) holder).txtName.setText(object.text);
                    ((DESCTypeViewHolder) holder).txtPrice.setText(object.price);
                    ((DESCTypeViewHolder) holder).txtDescription.setText(object.desc);
                    ((DESCTypeViewHolder) holder).imgItem.setImageResource(object.data);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}
