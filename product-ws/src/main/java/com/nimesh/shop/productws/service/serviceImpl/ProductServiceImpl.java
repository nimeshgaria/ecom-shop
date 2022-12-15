package com.nimesh.shop.productws.service.serviceImpl;

import com.nimesh.shop.productws.dto.request.ProductRequest;
import com.nimesh.shop.productws.dto.response.ProductResponse;
import com.nimesh.shop.productws.entity.Category;
import com.nimesh.shop.productws.entity.Product;
import com.nimesh.shop.productws.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
     private List<Product> productList = new ArrayList<>();
    private List<Category> categoryList = new ArrayList<>();

    @Override
    public ProductRequest createList(ProductRequest productRequest) {
        Product p = Product.builder()
                .name(productRequest.getName())
                .category(productRequest.getCategory())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .currency(productRequest.getCurrency())
                .build();

        productList.add(p);

        return productRequest;
    }

    public List<ProductResponse> getProducts(){
        for(Product p : productList){
            p.
        }
        for(int i=0; i<categoryList.size();i++)
        for(Category c : categoryList){

        }

   /*     productList.stream().map(product -> {
            ProductResponse.builder()
                    .productId("234")
                    .name(product.getName())
        }).collect(Collectors.toList())*/
        return productList;
    }
}
