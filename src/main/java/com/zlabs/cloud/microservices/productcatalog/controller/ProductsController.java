package com.zlabs.cloud.microservices.productcatalog.controller;

import com.zlabs.cloud.microservices.productcatalog.model.Products;
import com.zlabs.cloud.microservices.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan(basePackages = "com.zlabs.cloud.microservices.productcatalog")
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductService product;

    @GetMapping("/get-all")
    public List<Products> getAllEntry() {
        return product.getAllProducts();
    }

    @GetMapping("/get-all/brands/{brand}")
    public List<Products> getProductsByBrand(@PathVariable String brand) {
        return product.getProductsByBrand(brand);
    }

    @GetMapping("/get-all/price/{from}/{to}")
    public List<Products> getProductsByPrice(@PathVariable String from, @PathVariable String to) {
        return product.getProductsByPrice(from, to);
    }

    @GetMapping("/get-all/colors/{color}")
    public List<Products> getProductsByColor(@PathVariable String color) {

        return product.getProductsByColor(color);
    }

    @GetMapping("/get-all/sizes/{size}")
    public List<Products> getProductsBySize(@PathVariable String size) {
        return product.getProductsBySize(size);
    }

    @GetMapping("/get-all/ids/{id}")
    public List<Products> getProductsBySKU(@PathVariable Long id) {
        return product.getProductsBySKU(id);
    }

    @GetMapping("/get-all/sellers/{seller}")
    public List<Products> getProductsBySeller(@PathVariable String seller) {
        return product.getAvailableNumberOfProductsBySeller(seller);
    }

}
