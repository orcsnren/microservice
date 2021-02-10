package com.microservice.product_catalog.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
public class ProductDTO {
    private String id;
    private String title;
    private String desc;
    private String imagePath;
    private double unitPrice;
}
