
package com.example.potenzatask.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MapCoordinates {

    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("lontitude")
    @Expose
    private String lontitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLontitude() {
        return lontitude;
    }

    public void setLontitude(String lontitude) {
        this.lontitude = lontitude;
    }

}
