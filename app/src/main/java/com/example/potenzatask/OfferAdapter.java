package com.example.potenzatask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.potenzatask.offer.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder> {

    Context context;
    List<Item> itemList;

    public OfferAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.offer_adapter, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Picasso.with(context).load(itemList.get(position).getLogo()).into(holder.logo);
        holder.restaurantName.setText(itemList.get(position).getRestaurantName());
        holder.address.setText(itemList.get(position).getAddress());
        holder.offers.setText(itemList.get(position).getPaymentOptions().getCod());

    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView logo;
        TextView restaurantName,address,offers;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logo = itemView.findViewById(R.id.logo);

            restaurantName = itemView.findViewById(R.id.restaurantName);
            address = itemView.findViewById(R.id.address);
            offers = itemView.findViewById(R.id.offers);
        }
    }
}


