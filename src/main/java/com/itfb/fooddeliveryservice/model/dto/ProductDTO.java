package com.itfb.fooddeliveryservice.model.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private Long restaurantId;
    private double price;
    private String name;
}
