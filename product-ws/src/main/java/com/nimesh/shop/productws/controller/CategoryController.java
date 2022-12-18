package com.nimesh.shop.productws.controller;

import com.nimesh.shop.productws.dto.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @PostMapping("/")
    public ResponseEntity<BaseResponse> add

}
