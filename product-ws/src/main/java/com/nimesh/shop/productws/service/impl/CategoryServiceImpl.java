package com.nimesh.shop.productws.service.impl;

import com.nimesh.shop.productws.entity.Category;
import com.nimesh.shop.productws.repository.CategoryRepository;
import com.nimesh.shop.productws.repository.ProductRepository;
import com.nimesh.shop.productws.response.CategoryRequest;
import com.nimesh.shop.productws.service.CategoryService;
//mport com.nimesh.shop.productws.util.CategoryIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public CategoryRequest addCategories(CategoryRequest categoryRequest) {
         Category category = Category.builder()
                // .categoryId(CategoryIdGenerator.IdGenerator(categoryRequest.getCategoryId()))
                 .categoryId(categoryRequest.getCategoryId())
                 .brand(categoryRequest.getBrand())
                 .name(categoryRequest.getName())
                 .product(categoryRequest.getProduct())
               //  .product(new Product().g)
                 .build();
         categoryRepository.save(category);
        return categoryRequest;
    }

    @Override
    public List<Category> getAllList() {
        List<Category> categoryList = categoryRepository.findAll();
        //List<CategoryResponse> categoryResponseList = categoryList;
        return categoryList;
    }
    @Override
    public CategoryRequest getSingleCategory(String categoryId){
        Category category = categoryRepository.findByCategoryId(categoryId);
        CategoryRequest categoryResponse = CategoryRequest.builder()
                .product(category.getProduct())
                .categoryId(category.getCategoryId())
                .name(category.getName())
                .brand(category.getBrand())
                .build();
        return categoryResponse;
    }

    @Override
    public Category deletesSingleCategory(String categoryId){
        Category category = categoryRepository.findByCategoryId(categoryId);
        categoryRepository.delete(category);
        return category;
    }
    @Override
    public String deletesAll(){
        categoryRepository.deleteAll();
        return "All deleted";
    }

    @Override
    public Category updateSingleCategory(String categoryId, com.nimesh.shop.productws.request.CategoryRequest categoryRequest){
        Category category = categoryRepository.findByCategoryId(categoryId);
        categoryRepository.delete(category);
        Category categoryNew = Category.builder()
                .categoryId(categoryRequest.getCategoryId())
                .product(category.getProduct())
                .name(categoryRequest.getName())
                .brand(categoryRequest.getBrand())
                .build();
        categoryRepository.save(categoryNew);
        //categoryRepository.save(ModelMapperHelper.maptoObject(categoryRequest, Category.class));
        return categoryNew;
    }
}
