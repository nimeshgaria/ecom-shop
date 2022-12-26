package com.nimesh.shop.productws.controller;

import com.nimesh.shop.productws.dto.response.BaseResponse;
import com.nimesh.shop.productws.entity.Category;
import com.nimesh.shop.productws.response.CategoryRequest;
import com.nimesh.shop.productws.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

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
    @GetMapping("/getAll")
    public ResponseEntity<BaseResponse> getAllCategories(){
        List<Category> responseList =  categoryService.getAllList();
        BaseResponse baseResponse = new BaseResponse(200, true, "Success" , responseList);
        return new ResponseEntity<BaseResponse>(baseResponse,OK);
    }
    @GetMapping("/{categoryId}")
    public ResponseEntity<BaseResponse> getOneCategory(@PathVariable String categoryId){
    CategoryRequest categoryResponse = categoryService.getSingleCategory(categoryId);
    BaseResponse baseResponse = new BaseResponse(200, true, "Ok", categoryResponse);
    return new ResponseEntity<BaseResponse>(baseResponse,OK);
    }

    @DeleteMapping("/deleteByCategory/{categoryId}")
    public ResponseEntity<BaseResponse> deleteBySingleCategoryId(@PathVariable String categoryId){
        Category category= categoryService.deletesSingleCategory(categoryId);
        BaseResponse baseResponse  = new BaseResponse(200,  true , "OK", category);
        return new ResponseEntity<>(baseResponse, OK);
    }
    @DeleteMapping("/deleteAllCategory")
    public ResponseEntity<BaseResponse> deleteAllCategory( ){
        String message= categoryService.deletesAll();
        BaseResponse baseResponse  = new BaseResponse(200,  true , "OK", message);
        return new ResponseEntity<>(baseResponse, OK);
    }
   /* @PutMapping("/update/{categoryId}")
    public ResponseEntity<BaseResponse> updateOneCategory(@PathVariable String categoryId, @RequestBody CategoryRequest categoryRequest){
        Category category= categoryService.updateSingleCategory(String categoryId,CategoryRequest categoryRequest);
    }*/

}
