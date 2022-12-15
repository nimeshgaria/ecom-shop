package com.nimesh.shop.productws.dto.response;

import com.nimesh.shop.productws.entity.Category;
import com.nimesh.shop.productws.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {
    private String productId;
    private String name;
    private Category category;
    private int price;
    private int discount;
    private String description;
    private String currency;
    private List<String> images;
}
