package com.nimesh.shop.productws.util;

import com.nimesh.shop.productws.dto.request.ProductRequest;

public class ProductServiceUtil {
    public static String productIdGenerator(ProductRequest productRequest) {
        return productRequest.getName().substring(0, 3) + "-" + (int)Math.random();
    }
}
