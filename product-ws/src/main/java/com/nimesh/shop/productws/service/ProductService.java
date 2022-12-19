package com.nimesh.shop.productws.service;

import com.nimesh.shop.productws.dto.request.ProductRequest;
import com.nimesh.shop.productws.dto.response.ProductResponse;
import com.nimesh.shop.productws.entity.Product;


public interface ProductService {
ProductRequest createList(ProductRequest productRequest);
//List<ProductResponse> getProducts();
ProductResponse getProductViaId(String productId);
ProductResponse updateProductById(String productId, ProductRequest productRequest);
String deleteProduct(String productId);

String deleteAllProducts();
//ProductResponse deleteProductViaId(String productId);
}
