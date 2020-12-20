package com.microservice.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
    private String id;
    private String title;
    private String desc;
    private String imagePath;
    private double unitPrice;
}
