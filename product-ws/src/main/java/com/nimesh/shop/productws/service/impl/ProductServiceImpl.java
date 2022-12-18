package com.nimesh.shop.productws.service.impl;

import com.nimesh.shop.productws.dto.request.ProductRequest;
import com.nimesh.shop.productws.dto.response.ProductResponse;
import com.nimesh.shop.productws.entity.Category;
import com.nimesh.shop.productws.entity.Product;
import com.nimesh.shop.productws.repository.ProductRepository;
import com.nimesh.shop.productws.service.ProductService;
import com.nimesh.shop.productws.util.ModelMapperHelper;
import com.nimesh.shop.productws.util.ProductServiceUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private List<ProductResponse> productResponseList = new ArrayList<>();

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductRequest createList(ProductRequest productRequest) {

        Product p = Product.builder()
                .productId(productRequest.getProductId())
                .name(productRequest.getName())
                .category(productRequest.getCategory())
                .discount(productRequest.getDiscount())
                .price(productRequest.getPrice())
                .images(productRequest.getImages())
                .description(productRequest.getDescription())
                .currency(productRequest.getCurrency())
                .build();

        productRepository.save(p);

        return productRequest;
    }
    public List<ProductResponse> getProducts(){
      // List<Product> p = productRepository.findAll(pr);
       List<Product> listProduct = productRepository.findAll();
        List<ProductResponse> listProductResponse = listProduct.stream().map(product -> {
           ModelMapper modelMapper = new ModelMapper();
           return modelMapper.map(listProduct,ProductResponse.class);}).collect(Collectors.toList());
       return listProductResponse;
    }

    @Override
    public ProductResponse getProductViaId(String productId){
        for(int i=0;i<productResponseList.size(); i++){
            if(productResponseList.get(i).getProductId().equals(productId)){
                return productResponseList.get(i);
                //return productResponseList.get(i);
            }
        }
        return null;
    }

    @Override
    public ProductResponse updateProductById(String productId, ProductRequest productRequest){
      /*  for(int i=0; i<productResponseList.size(); i++){
            if(productResponseList.get(i).getProductId().equals(productId)){
             *//*   productResponseList.remove(i);
                productList.remove(i);*//*
                productResponseList.set(i,ProductResponse.builder()
                        .productId(ProductServiceUtil.productIdGenerator(productRequest))
                        .category(productRequest.getCategory())
                        .name(productRequest.getName())
                        .price(productRequest.getPrice())
                        .currency(productRequest.getCurrency())
                        .description(productRequest.getDescription())
                        .images(productRequest.getImages())
                        .build());
                *//*productResponseList.add(i,ProductResponse.builder()
                        .productId(ProductServiceUtil.productIdGenerator(productRequest))
                        .category(productRequest.getCategory())
                        .name(productRequest.getName())
                        .price(productRequest.getPrice())
                        .currency(productRequest.getCurrency())
                        .description(productRequest.getDescription())
                        .images(productRequest.getImages())
                        .build());*//*
            }
            return productResponseList.get(i);
        }*/
        Product product = productRepository.findByProductId(productId);
        productRepository.save(ModelMapperHelper.mapToObject(productRequest,Product.class));
        return null;
    }
    @Override
    public String deleteProduct(String productId) {
        Product productToDelete = productRepository.findByProductId(productId);
        productRepository.delete(productToDelete);
        return "Product has been deleted" +productId;
        /* for(int i =0 ; i< productResponseList.size(); i++){
            if(productResponseList.get(i).getProductId().equals(productId)){
               return productList.remove(productResponseList.get(i));
            }
        }
        return null;
    }
      productResponseList =  productList.stream().map(product -> {
            return ProductResponse.builder()
                    .productId("234")
                    .name(product.getName())
                    .build();
        }).collect(Collectors.toList());
       //
*/
    }
    }

