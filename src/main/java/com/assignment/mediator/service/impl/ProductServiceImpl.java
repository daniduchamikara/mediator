package com.assignment.mediator.service.impl;


import com.assignment.mediator.connector.Connector;
import com.assignment.mediator.dto.Product;
import com.assignment.mediator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    
    
    @Autowired
    Connector connector;

    @Override
    public List<Product> getProductList() {
        List<Product> products = new ArrayList<>();
        products.addAll(connector.getAbanceAllProduct());
//        products.addAll(connector.getSingerAllProduct());
//        products.addAll(connector.getSoftLogicAllProduct());
        return products;
    }

    @Override
    public List<Product> getProductsByCategory(String searchVal, String categoryId) {
        List<Product> productList = getProductList();
        List<Product> productListByCategory = getProductList();

        if (searchVal.isEmpty()|| searchVal==null){
            for (Product product: productList) {
                if(product.getProduct_category().getId() == categoryId ){
                    productListByCategory.add(product);
                }
            }
        }else if (categoryId.isEmpty()|| categoryId==null){
            for (Product product: productList) {
                if(product.getDescription()==(searchVal) ){
                    productListByCategory.add(product);
                }
            }
        }else if ((!categoryId.isEmpty()|| categoryId!=null) && (!searchVal.isEmpty()|| searchVal!=null)){
            for (Product product: productList) {
                if((product.getDescription()==(searchVal)&&(product.getProduct_category().getId().equals(categoryId))) ){
                    productListByCategory.add(product);
                }
            }
        }
        return productListByCategory;
    }
}
