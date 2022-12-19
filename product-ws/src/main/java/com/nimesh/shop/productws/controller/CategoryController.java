package com.nimesh.shop.productws.controller;

import com.nimesh.shop.productws.dto.response.BaseResponse;
import com.nimesh.shop.productws.response.CategoryRequest;
import com.nimesh.shop.productws.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    //  /products/cateogry/findall
    // products / cateogry/id as parameter find and show that id
    // products / cateogry/id as parameter update productbyId
    //    products / product id as parameter delete productById
    //    products / product id as parameter deleteAll products
    @PostMapping("/add")
    public ResponseEntity<BaseResponse> addCategory(@RequestBody CategoryRequest categoryRequest){
        CategoryRequest addCategories = categoryService.addCategories(categoryRequest);
        BaseResponse baseResponse = new BaseResponse(200, true, "success", addCategories);
        return new ResponseEntity<BaseResponse>(baseResponse, OK);
    }

}
