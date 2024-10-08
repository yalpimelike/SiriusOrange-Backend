package com.melikeyalpi.siriusorange.controller;

import com.melikeyalpi.siriusorange.converter.ProductConverter;
import com.melikeyalpi.siriusorange.dto.ProductResponse;
import com.melikeyalpi.siriusorange.model.Product;
import com.melikeyalpi.siriusorange.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductResponse> getProducts() {
        return productService.getAll().stream().map(ProductConverter::toResponse).toList();
    }

    @GetMapping("/{id}")
    public ProductResponse getProduct(@PathVariable Long id) {
        return ProductConverter.toResponse(productService.getProduct(id));
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping
    public void deleteProduct(@RequestBody Product product) {
        productService.removeProduct(product);
    }
}
