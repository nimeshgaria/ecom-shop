package com.nimesh.shop.productws.controller;

import com.nimesh.shop.productws.dto.request.ProductRequest;
import com.nimesh.shop.productws.dto.response.BaseResponse;
import com.nimesh.shop.productws.dto.response.ProductResponse;
import com.nimesh.shop.productws.entity.Product;
import com.nimesh.shop.productws.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController

@RequestMapping("/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> addProducts(@RequestBody @Valid ProductRequest productRequest) {

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
/*

    @GetMapping("/getAll")
    public ResponseEntity<BaseResponse> getAllProducts() {
        List<ProductResponse> productList = productService.getProducts();
        BaseResponse baseResponse = BaseResponse.builder()
                .result(productList)
                .statusCode(200)
                .success(true)
                .message("Fetched")
                .build();
        return new ResponseEntity<BaseResponse>(baseResponse, OK);

    }
*/

    // products / product id as parameter find and show that id
    /*@GetMapping("/getViaProductId/{productId}")/
    public ResponseEntity<BaseResponse> getProductViaId(@PathVariable String productId) {
        ProductResponse response = productService.getProductViaId(productId);
        BaseResponse baseResponse = new BaseResponse();

        if (response != null) {
            baseResponse = new BaseResponse(200, true, "fetched", response);

        } else {
            baseResponse = new BaseResponse(200, false, "not fetched", null);
        }
        return new ResponseEntity<BaseResponse>(baseResponse, OK);
    }*/
    // products / product id as parameter update productbyId
    @PutMapping("/update/{productId}")
    public ResponseEntity<BaseResponse> updateViaId(@PathVariable String productId, @RequestBody ProductRequest productRequest){
        ProductResponse response = productService.updateProductById(productId, productRequest);
        BaseResponse baseResponse = new BaseResponse();
        if(response != null){
            baseResponse = new BaseResponse(200, true, "fetched", response);
        }else{
            baseResponse = new BaseResponse(200, true, "fetched", null);
        }
        return new ResponseEntity<BaseResponse>(baseResponse,OK);

    }
    //    products / product id as parameter delete productById
    @DeleteMapping("/delete/{productId}")
    public ResponseEntity<BaseResponse> deleteViaId(@PathVariable String productId){
        String message =  productService.deleteProduct(productId);
        BaseResponse baseResponse = new BaseResponse(200,true, "deleted", message);
        return new ResponseEntity<BaseResponse>(baseResponse,OK);
    }
    //    products / product id as parameter deleteAll products

    //  /products/cateogry/findall
    // products / cateogry/id as parameter find and show that id
    // products / cateogry/id as parameter update productbyId
    //    products / product id as parameter delete productById
    //    products / product id as parameter deleteAll products


}
