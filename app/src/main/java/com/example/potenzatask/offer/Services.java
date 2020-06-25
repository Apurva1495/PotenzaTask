
package com.example.potenzatask.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Services {

    @SerializedName("delivery")
    @Expose
    private String delivery;
    @SerializedName("pickup")
    @Expose
    private String pickup;
    @SerializedName("dinein")
    @Expose
    private String dinein;

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDinein() {
        return dinein;
    }

    public void setDinein(String dinein) {
        this.dinein = dinein;
    }

}
