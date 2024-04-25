package com.interviewprep.restapp.service;

import com.interviewprep.restapp.entity.Product;
import com.interviewprep.restapp.exception.ProductAlreadyExistsException;
import com.interviewprep.restapp.exception.ProductNotFoundException;
import com.interviewprep.restapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    List<Product> productList = new ArrayList<>();

    public List<Product> addproducts(){
        productList.addAll(productRepo.findAll());
        return productList;
    }

    public List<Product> saveProduct(Product product)
    {
        boolean containsprodId=productList.stream().map(Product::getPid)
                .anyMatch(productId->productId.equals(product.getPid()));
        if(!containsprodId)
        {
            productList.add(product);
        }
        else{
            throw new ProductAlreadyExistsException("Product already exists in the system!"+product.getPid());
        }
        return productList;
    }

    public List<Product> getByProductType(String productType)
    {
        List<Product> products = addproducts().stream().filter(product -> product.getProduct_type().equals(productType))
                .collect(Collectors.toList());
       if(products.isEmpty())
           throw new ProductNotFoundException("Product Not Found..");
       else
           return products;
    }
}
