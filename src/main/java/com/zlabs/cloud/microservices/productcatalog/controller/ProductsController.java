package com.zlabs.cloud.microservices.productcatalog.controller;

import com.zlabs.cloud.microservices.productcatalog.config.LocalCacheManager;
import com.zlabs.cloud.microservices.productcatalog.model.Products;
import com.zlabs.cloud.microservices.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan(basePackages = "com.zlabs.cloud.microservices.productcatalog")
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductService product;

    @Autowired
    LocalCacheManager localCacheManager;

    @Cacheable(value="allentry")
    @GetMapping("/get-all")
    public List<Products> getAllEntry() {
        return product.getAllProducts();
    }

    @GetMapping("/get-all/brands/{brand}")
    @Cacheable(value="brandlist", key="{#root.methodName,#brand}")
    public List<Products> getProductsByBrand(@PathVariable String brand) {
        return product.getProductsByBrand(brand);
    }

    @Cacheable(value="pricelist", key="{#root.methodName,#to,#from}")
    @GetMapping("/get-all/price/{from}/{to}")
    public List<Products> getProductsByPrice(@PathVariable String from, @PathVariable String to) {
        return product.getProductsByPrice(from, to);
    }

    @Cacheable(value="colorlist", key="{#root.methodName,#color}")
    @GetMapping("/get-all/colors/{color}")
    public List<Products> getProductsByColor(@PathVariable String color) {
        return product.getProductsByColor(color);
    }


    @GetMapping("/get-all/sizes/{size}")
    @Cacheable(value="sizelist", key="{#root.methodName,#size}")
    public List<Products> getProductsBySize(@PathVariable String size) {
        return product.getProductsBySize(size);
    }

    @GetMapping("/get-all/ids/{id}")
    @Cacheable(value="skuid", key="{#root.methodName,#id}")
    public List<Products> getProductsBySKU(@PathVariable Long id) {
        return product.getProductsBySKU(id);
    }

    @GetMapping("/get-all/sellers/{seller}")
    @Cacheable(value="sellerlist", key="{#root.methodName,#seller}")
    public List<Products> getProductsBySeller(@PathVariable String seller) {
        return product.getAvailableNumberOfProductsBySeller(seller);
    }

    @GetMapping("/removeCache")
    public String cacheRemoved(){
        localCacheManager.evictAllCacheValues("allentry");
        return "Cache Removed";
    }


}
