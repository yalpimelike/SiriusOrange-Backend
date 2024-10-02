package com.melikeyalpi.siriusorange.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
    private String name;
    private String description;
    private int price;
    private int stock;
}
