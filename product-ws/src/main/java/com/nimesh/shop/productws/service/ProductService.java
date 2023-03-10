package com.nimesh.shop.productws.service;

import com.nimesh.shop.productws.dto.request.ProductRequest;
import com.nimesh.shop.productws.dto.response.ProductResponse;
import com.nimesh.shop.productws.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
ProductRequest createList(ProductRequest productRequest);

List<Product> getProducts();
}
