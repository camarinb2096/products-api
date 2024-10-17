package com.api.products.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.api.products.entities.ProductsEntity;

@Service
public class ProductServices {
    private List<ProductsEntity> products;

    public ProductServices(){
        products = new ArrayList<ProductsEntity>();
    
        products.add(new ProductsEntity(UUID.randomUUID(), "Pc Asus", "LAPTOP", 199.5, 20));
        products.add(new ProductsEntity(UUID.randomUUID(), "iPhone 13", "SMARTPHONE", 799.99, 15));
        products.add(new ProductsEntity(UUID.randomUUID(), "Samsung Galaxy S21", "SMARTPHONE", 699.99, 18));
        products.add(new ProductsEntity(UUID.randomUUID(), "Dell XPS 13", "LAPTOP", 1099.99, 10));
        products.add(new ProductsEntity(UUID.randomUUID(), "MacBook Pro", "LAPTOP", 1299.99, 8));
        products.add(new ProductsEntity(UUID.randomUUID(), "Lenovo ThinkPad", "LAPTOP", 899.99, 12));
        products.add(new ProductsEntity(UUID.randomUUID(), "Google Pixel 6", "SMARTPHONE", 599.99, 20));
        products.add(new ProductsEntity(UUID.randomUUID(), "Sony WH-1000XM4", "HEADPHONES", 299.99, 30));
        products.add(new ProductsEntity(UUID.randomUUID(), "Bose QuietComfort 35", "HEADPHONES", 249.99, 25));
        products.add(new ProductsEntity(UUID.randomUUID(), "Apple AirPods Pro", "HEADPHONES", 199.99, 40));
        products.add(new ProductsEntity(UUID.randomUUID(), "Samsung Galaxy Buds", "HEADPHONES", 149.99, 35));
        products.add(new ProductsEntity(UUID.randomUUID(), "LG 4K OLED TV", "TELEVISION", 1399.99, 5));
        products.add(new ProductsEntity(UUID.randomUUID(), "Samsung QLED TV", "TELEVISION", 1199.99, 6));
        products.add(new ProductsEntity(UUID.randomUUID(), "Apple Watch Series 6", "WEARABLE", 399.99, 25));
        products.add(new ProductsEntity(UUID.randomUUID(), "Fitbit Versa 3", "WEARABLE", 229.99, 30));
        products.add(new ProductsEntity(UUID.randomUUID(), "Amazon Echo Dot", "SMART HOME", 49.99, 50));
        products.add(new ProductsEntity(UUID.randomUUID(), "Google Nest Mini", "SMART HOME", 49.99, 45));
        products.add(new ProductsEntity(UUID.randomUUID(), "GoPro HERO9", "CAMERA", 399.99, 10));
        products.add(new ProductsEntity(UUID.randomUUID(), "Canon EOS R5", "CAMERA", 3499.99, 4));
        products.add(new ProductsEntity(UUID.randomUUID(), "Sony A7 III", "CAMERA", 1999.99, 7));
    }
    // Método para obtener todos los productos
    public List<ProductsEntity> getAllProducts() {
        return products;
    }

    // Método para obtener un producto por ID
    public Optional<ProductsEntity> getProductById(UUID id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

}
