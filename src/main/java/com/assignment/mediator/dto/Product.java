package com.assignment.mediator.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Dani
 */
@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private String imgPath;
    private long qtyOnHand;
    private double unitPrice;
    private String create_user_id;
    private String statusId;
    private ProductCategory product_category;
    private List<ProductImage> productImageList;
   
}
