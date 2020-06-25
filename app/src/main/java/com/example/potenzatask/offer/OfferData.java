package com.example.potenzatask.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OfferData {
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("geofences")
    @Expose
    private List<Geofence> geofences = null;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Geofence> getGeofences() {
        return geofences;
    }

    public void setGeofences(List<Geofence> geofences) {
        this.geofences = geofences;
    }
}
