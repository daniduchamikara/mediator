package com.assignment.mediator.service;


import com.assignment.mediator.dto.Product;

import java.util.List;

/**
 * @author Dani
 */
public interface ProductService {
    
    List<Product> getProductList();
    List<Product> getProductsByCategory(String searchVal, String categoryId);
}
