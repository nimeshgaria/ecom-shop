package com.nimesh.shop.productws.service;

import com.nimesh.shop.productws.entity.Category;
import com.nimesh.shop.productws.response.CategoryRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    CategoryRequest addCategories(CategoryRequest  categoryRequest);

    List<Category>  getAllList();
    CategoryRequest getSingleCategory(String categoryId);
    Category deletesSingleCategory(String categoryId);
    String deletesAll();

    Category updateSingleCategory(String categoryId, com.nimesh.shop.productws.request.CategoryRequest categoryRequest);
}
