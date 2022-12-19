package com.nimesh.shop.productws.service.impl;

import com.nimesh.shop.productws.entity.Category;
import com.nimesh.shop.productws.repository.CategoryRepository;
import com.nimesh.shop.productws.response.CategoryRequest;
import com.nimesh.shop.productws.service.CategoryService;
import com.nimesh.shop.productws.util.ModelMapperHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryRequest addCategories(CategoryRequest categoryRequest) {
         Category category = ModelMapperHelper.maptoObject(categoryRequest, Category.class);
        categoryRepository.save(category);
        return categoryRequest;
    }
}
