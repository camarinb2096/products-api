package com.api.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;
import java.util.Optional;

import com.api.products.services.ProductsServices;
import com.api.products.entities.ProductsEntity;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {
    private final ProductsServices productsServices;

    @Autowired
    public ProductsController(ProductsServices productsServices) {
        this.productsServices = productsServices;
    }

    @GetMapping()
    public List<ProductsEntity> getAllProducts(){
        return productsServices.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<ProductsEntity> getProductById(@PathVariable UUID id) {
        return productsServices.getProductById(id);
    }
    
}
