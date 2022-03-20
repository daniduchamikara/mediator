package com.assignment.mediator.controller;


import com.assignment.mediator.dto.Product;
import com.assignment.mediator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author Dani
 */
@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product-list")
    public List<Product> getProductList() {
        return productService.getProductList();
    }

    @PostMapping("/search-data")
    public List<Product> getProductsByCategory(@PathParam("selectVal") String categoryId,
                                               @PathParam("searchVal") String searchVal) {
        return productService.getProductsByCategory(categoryId, searchVal);
    }

}
