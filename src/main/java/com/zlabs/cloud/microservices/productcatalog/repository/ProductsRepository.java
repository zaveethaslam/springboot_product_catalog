package com.zlabs.cloud.microservices.productcatalog.repository;

import com.zlabs.cloud.microservices.productcatalog.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

   @Query("SELECT p FROM Products p WHERE p.brand = :brand")
   public List<Products> getProductsByBrand(@Param("brand") String brandName);

    @Query("SELECT p FROM Products p WHERE p.retail_cost > :priceFrom and p.retail_cost < :priceTo")
    public List<Products> getProductsByPrice(@Param("priceFrom") String priceFrom, @Param("priceTo") String priceTo);

    @Query("SELECT p FROM Products p WHERE p.color = :color")
    public List<Products> getProductsByColor(@Param("color") String color);

    @Query("SELECT p FROM Products p WHERE p.size = :size")
    public List<Products> getProductsBySize(@Param("size") String size);

    @Query("SELECT p FROM Products p WHERE p.skuID = :sku")
    public List<Products> getProductsBySKU(@Param("sku") Long sku);

    @Query("SELECT p FROM Products p WHERE p.seller = :seller")
    public List<Products> getProductsBySeller(@Param("seller") String seller);

}