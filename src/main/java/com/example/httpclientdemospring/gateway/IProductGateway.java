package com.example.httpclientdemospring.gateway;

import com.example.httpclientdemospring.dto.FakeStoreProductByCategoryResponseDTO;
import com.example.httpclientdemospring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {

    List<ProductDTO> getProductByCategory(String type) throws IOException;

    ProductDTO getProductById(Integer productId) throws IOException;
}
