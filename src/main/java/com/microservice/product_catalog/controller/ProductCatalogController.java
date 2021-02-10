package com.microservice.product_catalog.controller;

import com.microservice.product_catalog.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductCatalogController {
    private static Map<String, ProductDTO> productCatalog = new HashMap<>();

    @PostMapping("/product")
    public String addProduct(@RequestBody ProductDTO product) {
        productCatalog.put(product.getId(), product);
        return "product added successfully";
    }

    @GetMapping("/product/{id}")
    public ProductDTO getProductDetails(@PathVariable String id) {
        return productCatalog.get(id);
    }

    @GetMapping("/product")
    public List<ProductDTO> getProductList() {
        return new ArrayList<ProductDTO>(productCatalog.values());
    }

    @PutMapping("/product")
    public String updateProduct(@RequestBody ProductDTO product) {
        productCatalog.put(product.getId(), product);
        return "product updated successfully";
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable String id) {
        productCatalog.remove(id);
        return "product deleted successfully";
    }
}
