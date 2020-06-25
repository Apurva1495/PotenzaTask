
package com.example.potenzatask.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentOptions {

    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("online")
    @Expose
    private String online;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

}
