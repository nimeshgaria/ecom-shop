package com.nimesh.shop.productws.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "ECOM_CATEGORY")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
   @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String categoryId;
    private String name;
    private String brand;
    @OneToOne(mappedBy = "category")
    private Product product;
}
