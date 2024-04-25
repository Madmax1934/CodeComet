package com.interviewprep.restapp.controller;

import com.interviewprep.restapp.entity.Product;
import com.interviewprep.restapp.exception.ProductNotFoundException;
import com.interviewprep.restapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/{product_type}")
    public List<Product> getProdByType(@PathVariable("product_type") String productType)
    {
        List<Product> myList= productService.getByProductType(productType);
        return myList;
    }

    @PostMapping("/products/add/")
    public List<Product> saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}
