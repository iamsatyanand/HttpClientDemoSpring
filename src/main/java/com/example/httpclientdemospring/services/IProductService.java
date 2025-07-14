package com.example.httpclientdemospring.services;

import com.example.httpclientdemospring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {

    List<ProductDTO> getProductByCategory(String type) throws IOException;

    ProductDTO getProductById(Integer productId) throws IOException;
}
