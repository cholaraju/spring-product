package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String name, double price) {
        // Create a new Product instance
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        // Save the Product to the database
        productRepository.save(product);
    }
}
