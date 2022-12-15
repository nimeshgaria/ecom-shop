package com.nimesh.shop.productws.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Category {
    private String categoryId;
    private String name;
    private String brand;

}
