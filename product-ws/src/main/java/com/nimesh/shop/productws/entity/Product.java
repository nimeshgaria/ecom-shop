package com.nimesh.shop.productws.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "ECOM_PRODUCT")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
     @Id
    private String productId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id",referencedColumnName = "categoryId")
    private Category category;
    private int price;
    private int discount;
    private String description;
    private String currency;
    private List<String> images;


}
