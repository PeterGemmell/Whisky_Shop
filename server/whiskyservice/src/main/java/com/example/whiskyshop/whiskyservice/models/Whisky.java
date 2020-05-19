package com.example.whiskyshop.whiskyservice.models;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="whiskies")
public class Whisky {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="distillery_name")
    private String distilleryName;

    @Column(name="product_name")
    private String productName;

    @Column(name="region")
    private String region;

    @Column(name="strength")
    private String strength;

    @Column(name="volume")
    private String volume;

    @Column(name="image_link")
    private String imgLink;

    @Column(name="cost_price")
    private Double costPrice;

    @Column(name="retail_price")
    private Double retailPrice;

    @Column(name="product_info")
    private String productInfo;

    @Column(name="quantity_in_cart")
    private Integer quantityInCart;

    @Column(name="in_cart")
    private Boolean inCart;


    public Whisky(String distilleryName, String productName, String region, String strength, String volume, String imgLink,
                  Double costPrice, Double retailPrice, String productInfo, Integer quantityInCart, Boolean inCart){
        this.distilleryName = distilleryName;
        this.productName = productName;
        this.region = region;
        this.strength = strength;
        this.volume = volume;
        this.imgLink = imgLink;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.productInfo = productInfo;
        this.quantityInCart = quantityInCart;
        this.inCart = inCart;
    }

    public Whisky(){

    }

    public String getDistilleryName() {
        return distilleryName;
    }

    public void setDistilleryName(String distilleryName) {
        this.distilleryName = distilleryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public Integer getQuantityInCart() {
        return quantityInCart;
    }

    public void setQuantityInCart(Integer quantityInCart) {
        this.quantityInCart = quantityInCart;
    }

    public Boolean getInCart() {
        return inCart;
    }

    public void setInCart(Boolean inCart) {
        this.inCart = inCart;
    }
}
