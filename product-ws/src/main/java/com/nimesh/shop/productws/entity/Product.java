package com.nimesh.shop.productws.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Product {
//    @Id
    private String productId;
    private String name;
    private Category category;
    private int price;
    private int discount;
    private String description;
    private String currency;
    private List<String> images;


}
