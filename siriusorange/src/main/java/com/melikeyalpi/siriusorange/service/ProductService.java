package com.melikeyalpi.siriusorange.service;

import com.melikeyalpi.siriusorange.model.Product;
import com.melikeyalpi.siriusorange.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void removeProduct(Product product) {
        productRepository.delete(product);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
