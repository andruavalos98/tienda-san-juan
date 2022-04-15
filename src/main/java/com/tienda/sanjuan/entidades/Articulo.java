/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.sanjuan.entidades;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Franc
 */
@Entity
public class Articulo {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String title;
    private Double price;
    private String color;
    private String description;
    private Integer stock;
    private String material;
    private String size;
    private String categorie;
    private String subCategory;

    public Articulo() {
    }

    public Articulo(String id, String title, Double price, String color, String description, Integer stock, String material, String size, String categorie, String subCategory) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.color = color;
        this.description = description;
        this.stock = stock;
        this.material = material;
        this.size = size;
        this.categorie = categorie;
        this.subCategory = subCategory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", title=" + title + ", price=" + price + ", color=" + color + ", description=" + description + ", stock=" + stock + ", material=" + material + ", size=" + size + ", categorie=" + categorie + ", subCategory=" + subCategory + '}';
    }

    
}
