package com.example.shopping;

import java.util.ArrayList;

public class GroceryItem {
    private int id;
    private int availableAmount;
    private String name;
    private String imageUrl;
    private String category;
    private double price;
    private int rate;
    private int userPoint;
    private int popularityPoint;

    private ArrayList<Review> reviews;

    public GroceryItem(int availableAmount, String name, String imageUrl, String category, double price) {
        this.id = Utils.getID();
        this.availableAmount = availableAmount;
        this.name = name;
        this.imageUrl = imageUrl;
        this.category = category;
        this.price = price;
        this.popularityPoint = 0;
        this.userPoint = 0;
        this.rate = 0;
        reviews = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", availableAmount=" + availableAmount +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                ", userPoint=" + userPoint +
                ", popularityPoint=" + popularityPoint +
                ", reviews=" + reviews +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }

    public int getPopularityPoint() {
        return popularityPoint;
    }

    public void setPopularityPoint(int popularityPoint) {
        this.popularityPoint = popularityPoint;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
}
