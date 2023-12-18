package com.pluralsight.NorthwindTradersSpringBoot.model;

public class Product {
    private int productId;
    private String name;
    private String category;
    private Double price;

    public Product(int productId, String name, String category, Double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
