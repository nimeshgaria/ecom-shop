package com.nimesh.shop.productws.request;

import com.nimesh.shop.productws.entity.Product;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    private String categoryId;
    private String name;
    private String brand;
    private Product product;
}
