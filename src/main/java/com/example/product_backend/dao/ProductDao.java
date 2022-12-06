package com.example.product_backend.dao;

import com.example.product_backend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
