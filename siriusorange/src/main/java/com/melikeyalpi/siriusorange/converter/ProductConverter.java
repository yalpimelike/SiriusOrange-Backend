package com.melikeyalpi.siriusorange.converter;

import com.melikeyalpi.siriusorange.dto.ProductResponse;
import com.melikeyalpi.siriusorange.model.Product;

public class ProductConverter {
    public static ProductResponse toResponse(Product product) {
        return ProductResponse.builder()
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .stock(product.getStock())
                .build();
    }
}
