package com.assignment.mediator.connector;


import com.assignment.mediator.dto.Product;

import java.util.List;

/**
 * @author Dani on 2/2/2022 8:51 PM
 */
public interface Connector {
    
    List<Product> getAbanceAllProduct();
    List<Product> getSoftLogicAllProduct();
    List<Product> getSingerAllProduct();
    
}
