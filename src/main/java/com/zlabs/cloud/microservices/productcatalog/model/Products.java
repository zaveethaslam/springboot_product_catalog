package com.zlabs.cloud.microservices.productcatalog.model;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @Generated
    private int skuID;

    private String product_name;

    private String product_description;

    private String category;

    private int total_stocks;

    private int current_stock;

    private String color;

    private String brand;

    private String size;

    private String retail_cost;

    private String cost_price;

    private boolean discount_eligible;

    private int max_discounts;

    private String seller;

    private String last_updated;
}
