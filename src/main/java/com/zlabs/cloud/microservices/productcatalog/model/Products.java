package com.zlabs.cloud.microservices.productcatalog.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    private Long skuID;

    @NotNull
    @NotEmpty
    private String product_name;

    private String product_description;

    @NotNull
    @NotEmpty
    private String category;

    @NotEmpty
    private int total_stocks;

    @NotEmpty
    private int current_stock;

    @NotNull
    @NotEmpty
    private String color;

    @NotNull
    private String brand;

    @NotNull
    @NotEmpty
    private String size;

    @NotNull
    private String retail_cost;

    @NotNull
    private String cost_price;

    private boolean discount_eligible;

    private int max_discounts;

    @NotNull
    private String seller;

    private String last_updated;
}
