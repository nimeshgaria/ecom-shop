package com.nimesh.shop.productws.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.nimesh.shop.productws.dto.request.ProductRequest;
import com.nimesh.shop.productws.dto.response.BaseResponse;
import com.nimesh.shop.productws.dto.response.ProductResponse;
import com.nimesh.shop.productws.entity.Product;
import com.nimesh.shop.productws.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController

@RequestMapping("/products/")
public class ProductController {


    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> addProducts(@RequestBody ProductRequest productRequest){

        ProductRequest savedProduct = productService.createList(productRequest);
        BaseResponse response = new BaseResponse();

                 response = BaseResponse.builder()
                .statusCode(200)
                .success(true)
                .message("success")
                .result(savedProduct)
                .build();
        return new ResponseEntity<BaseResponse>(response, OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<BaseResponse> getAllProducts(){
        List<Product> productList = productService.getProducts();
        BaseResponse baseResponse = BaseResponse.builder()
                .result(productList)
                .build();
        return new ResponseEntity<BaseResponse>(productList, OK);

    }

    @GetMapping("/category/getAll")
    public ResponseEntity<BaseResponse> getAllProducts(){
        List<Product> productList = productService.getProducts();
        Product productList1 = productList.get(0);

        return new ResponseEntity<List<Product>>(productList, OK);

    }
    // products / product id as parameter find and show that id
    // products / product id as parameter update productbyId
    //    products / product id as parameter delete productById
    //    products / product id as parameter deleteAll products

    //  /products/cateogry/findall
    // products / cateogry/id as parameter find and show that id
    // products / cateogry/id as parameter update productbyId
    //    products / product id as parameter delete productById
    //    products / product id as parameter deleteAll products

}
