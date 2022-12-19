package com.nimesh.shop.productws.service;

import com.nimesh.shop.productws.response.CategoryRequest;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    CategoryRequest addCategories(CategoryRequest categoryRequest);
}
