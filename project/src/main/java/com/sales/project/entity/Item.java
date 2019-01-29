package com.sales.project.entity;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

@Entity
@Table(name = "ITEM_TABLE")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ITEM_TITLE")
    private String title;

    @Column(name = "ITEM_DESCRIPTION")
    private String description;

    @Column(name = "ITEM_PRICE")
    private Double price;

    @Column(name = "ITEM_STOCK")
    private String stock;

    @Column(name = "ITEM_LOCATION")
    private String location;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getStock(){
        return stock;
    }

    public void setStock(String stock){
        this.stock = stock;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

}
