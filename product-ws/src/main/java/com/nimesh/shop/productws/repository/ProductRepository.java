package com.nimesh.shop.productws.repository;

import com.nimesh.shop.productws.dto.response.ProductResponse;
import com.nimesh.shop.productws.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
 // List<ProductResponse> findAllProductResponse();
}
