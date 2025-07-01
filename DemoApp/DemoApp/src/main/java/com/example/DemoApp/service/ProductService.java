package com.example.DemoApp.service;

import com.example.DemoApp.model.Product;
import com.example.DemoApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "iPhone", 1000),
//            new Product(101, "Canon Camera", 500),
//            new Product(103, "Shure Mic", 100)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProductById(int prodId) {
        repo.deleteById(prodId);
    }

}
