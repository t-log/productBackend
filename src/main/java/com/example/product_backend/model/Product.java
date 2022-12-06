package com.example.product_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_db")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private int productCode;
    private String name;
    private String manufDate;
    private String expDate;
    private String brand;
    private int price;
    private String seller;
    private String distName;

    public Product() {
    }

    public Product(int id, int productCode, String name, String manufDate, String expDate, String brand, int price, String seller, String distName) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.manufDate = manufDate;
        this.expDate = expDate;
        this.brand = brand;
        this.price = price;
        this.seller = seller;
        this.distName = distName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufDate() {
        return manufDate;
    }

    public void setManufDate(String manufDate) {
        this.manufDate = manufDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }
}
