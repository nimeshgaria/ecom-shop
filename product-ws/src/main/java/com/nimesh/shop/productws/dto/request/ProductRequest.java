package com.nimesh.shop.productws.dto.request;

import com.nimesh.shop.productws.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {
    private String name;
    private Category category;
    private int price;
    private int discount;
    private String description;
    private String currency;
    private List<String> images;
}
