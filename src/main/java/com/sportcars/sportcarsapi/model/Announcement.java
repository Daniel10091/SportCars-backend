package com.sportcars.sportcarsapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Announcement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String imageUrl;
    private String brand;
    private String model;
    private String type;
    private String capacity;
    private String fuel;
    private String mileage;
    private String state;
    private String price;
    private String localization;
    private String seller;
    private String phone;
    @Column(nullable = false, updatable = false)
    private String announcementCode;

    public Announcement() {}

    public Announcement(
            String imageUrl, String brand, String model, String type, String capacity, String fuel,
            String mileage, String state, String price, String localization, String seller,
            String phone, String announcementCode
            ) {
        this.imageUrl = imageUrl;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        this.fuel = fuel;
        this.mileage = mileage;
        this.state = state;
        this.price = price;
        this.localization = localization;
        this.seller = seller;
        this.phone = phone;
        this.announcementCode = announcementCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAnnouncementCode() {
        return announcementCode;
    }

    public void setAnnouncementCode(String announcementCode) {
        this.announcementCode = announcementCode;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", fuel='" + fuel + '\'' +
                ", mileage='" + mileage + '\'' +
                ", state='" + state + '\'' +
                ", price='" + price + '\'' +
                ", localization='" + localization + '\'' +
                ", seller='" + seller + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
