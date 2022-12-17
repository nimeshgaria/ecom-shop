package com.nimesh.shop.productws.dto.request;

import com.nimesh.shop.productws.entity.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.objenesis.instantiator.sun.MagicInstantiator;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {

    @NotNull
    @Size(min= 3, message = "Name can not be smaller than 3 ")
    private String name;
    private Category category;
    private int price;
    private int discount;
    private String description;
    private String currency;
    private List<String> images;


}
