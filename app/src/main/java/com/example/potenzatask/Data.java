package com.example.potenzatask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("client_id")
    @Expose
    private String clientId;
    @SerializedName("social_strategy")
    @Expose
    private String socialStrategy;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email_address")
    @Expose
    private String emailAddress;
    @SerializedName("googlesec_code")
    @Expose
    private String googlesecCode;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("location_name")
    @Expose
    private Object locationName;
    @SerializedName("contact_phone")
    @Expose
    private String contactPhone;
    @SerializedName("lost_password_token")
    @Expose
    private String lostPasswordToken;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("date_modified")
    @Expose
    private String dateModified;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("mobile_verification_code")
    @Expose
    private String mobileVerificationCode;
    @SerializedName("mobile_verification_date")
    @Expose
    private String mobileVerificationDate;
    @SerializedName("custom_field1")
    @Expose
    private String customField1;
    @SerializedName("custom_field2")
    @Expose
    private String customField2;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("email_verification_code")
    @Expose
    private String emailVerificationCode;
    @SerializedName("is_guest")
    @Expose
    private String isGuest;
    @SerializedName("acc_token")
    @Expose
    private String accToken;


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSocialStrategy() {
        return socialStrategy;
    }

    public void setSocialStrategy(String socialStrategy) {
        this.socialStrategy = socialStrategy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGooglesecCode() {
        return googlesecCode;
    }

    public void setGooglesecCode(String googlesecCode) {
        this.googlesecCode = googlesecCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Object getLocationName() {
        return locationName;
    }

    public void setLocationName(Object locationName) {
        this.locationName = locationName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getLostPasswordToken() {
        return lostPasswordToken;
    }

    public void setLostPasswordToken(String lostPasswordToken) {
        this.lostPasswordToken = lostPasswordToken;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMobileVerificationCode() {
        return mobileVerificationCode;
    }

    public void setMobileVerificationCode(String mobileVerificationCode) {
        this.mobileVerificationCode = mobileVerificationCode;
    }

    public String getMobileVerificationDate() {
        return mobileVerificationDate;
    }

    public void setMobileVerificationDate(String mobileVerificationDate) {
        this.mobileVerificationDate = mobileVerificationDate;
    }

    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmailVerificationCode() {
        return emailVerificationCode;
    }

    public void setEmailVerificationCode(String emailVerificationCode) {
        this.emailVerificationCode = emailVerificationCode;
    }

    public String getIsGuest() {
        return isGuest;
    }

    public void setIsGuest(String isGuest) {
        this.isGuest = isGuest;
    }

    public String getAccToken() {
        return accToken;
    }

    public void setAccToken(String accToken) {
        this.accToken = accToken;
    }
}
