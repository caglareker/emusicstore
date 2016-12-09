package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by Caglar on 9.12.2016.
 */
public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(String Id);

    List<Product> getAllProducts();

    void deleteProduct(String Id);
}
