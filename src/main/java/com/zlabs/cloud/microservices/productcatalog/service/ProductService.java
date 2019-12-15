package com.zlabs.cloud.microservices.productcatalog.service;

import com.zlabs.cloud.microservices.productcatalog.model.Products;
import com.zlabs.cloud.microservices.productcatalog.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductsRepository productRepository;

    public ProductService(ProductsRepository productsRepository){
        this.productRepository = productsRepository;
    }

    //Group All Products
    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    //Group by brand / client
    public List<Products> getProductsByBrand(String brandName){
        return productRepository.getProductsByBrand(brandName);
    };

    //Group by price
    public List<Products> getProductsByPrice(String priceFrom, String priceTo){
        return productRepository.getProductsByPrice(priceFrom, priceTo);
    }

    // Group by Color
    public List<Products> getProductsByColor(String color){
        return productRepository.getProductsByColor(color);
    }

    //Group by Size
    public List<Products> getProductsBySize(String size){
        return productRepository.getProductsBySize(size);
    }

    //Get by SKU
    public List<Products> getProductsBySKU(Long skuID){
        return productRepository.getProductsBySKU(skuID);
    }

    //Available number of product by seller
    public List<Products> getAvailableNumberOfProductsBySeller(String seller){
        return productRepository.getProductsBySeller(seller);
    }

    public Products addProduct(Products product){
        return productRepository.save(product);
    }
}
