package com.example.httpclientdemospring.controllers;

import com.example.httpclientdemospring.dto.ProductDTO;
import com.example.httpclientdemospring.services.IProductService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    List<ProductDTO> getProductsBycategory(@RequestParam String type) throws IOException {
        return productService.getProductByCategory(type);
    }

    @GetMapping("/{productId}")
    ProductDTO getProductById(@PathVariable Integer productId) throws IOException{
        return productService.getProductById(productId);
    }

}
