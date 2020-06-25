
package com.example.potenzatask.offer;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("merchant_id")
    @Expose
    private String merchantId;
    @SerializedName("restaurant_name")
    @Expose
    private String restaurantName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("ratings")
    @Expose
    private Ratings ratings;
    @SerializedName("cuisine")
    @Expose
    private String cuisine;
    @SerializedName("delivery_fee")
    @Expose
    private String deliveryFee;
    @SerializedName("minimum_order")
    @Expose
    private String minimumOrder;
    @SerializedName("delivery_est")
    @Expose
    private String deliveryEst;
    @SerializedName("is_open")
    @Expose
    private String isOpen;
    @SerializedName("tag_raw")
    @Expose
    private String tagRaw;
    @SerializedName("payment_options")
    @Expose
    private PaymentOptions paymentOptions;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("map_coordinates")
    @Expose
    private MapCoordinates mapCoordinates;
    @SerializedName("offers")
    @Expose
    private String offers;
    @SerializedName("service")
    @Expose
    private String service;
    @SerializedName("services")
    @Expose
    private Services services;
    @SerializedName("distance")
    @Expose
    private String distance;
    @SerializedName("delivery_estimation")
    @Expose
    private String deliveryEstimation;
    @SerializedName("delivery_distance")
    @Expose
    private String deliveryDistance;
    @SerializedName("payment_available")
    @Expose
    private List<String> paymentAvailable = null;
    @SerializedName("is_sponsored")
    @Expose
    private String isSponsored;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getMinimumOrder() {
        return minimumOrder;
    }

    public void setMinimumOrder(String minimumOrder) {
        this.minimumOrder = minimumOrder;
    }

    public String getDeliveryEst() {
        return deliveryEst;
    }

    public void setDeliveryEst(String deliveryEst) {
        this.deliveryEst = deliveryEst;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public String getTagRaw() {
        return tagRaw;
    }

    public void setTagRaw(String tagRaw) {
        this.tagRaw = tagRaw;
    }

    public PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(PaymentOptions paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public MapCoordinates getMapCoordinates() {
        return mapCoordinates;
    }

    public void setMapCoordinates(MapCoordinates mapCoordinates) {
        this.mapCoordinates = mapCoordinates;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDeliveryEstimation() {
        return deliveryEstimation;
    }

    public void setDeliveryEstimation(String deliveryEstimation) {
        this.deliveryEstimation = deliveryEstimation;
    }

    public String getDeliveryDistance() {
        return deliveryDistance;
    }

    public void setDeliveryDistance(String deliveryDistance) {
        this.deliveryDistance = deliveryDistance;
    }

    public List<String> getPaymentAvailable() {
        return paymentAvailable;
    }

    public void setPaymentAvailable(List<String> paymentAvailable) {
        this.paymentAvailable = paymentAvailable;
    }

    public String getIsSponsored() {
        return isSponsored;
    }

    public void setIsSponsored(String isSponsored) {
        this.isSponsored = isSponsored;
    }

}
