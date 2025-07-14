package com.example.httpclientdemospring.services;

import com.example.httpclientdemospring.dto.ProductDTO;
import com.example.httpclientdemospring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public List<ProductDTO> getProductByCategory(String type) throws IOException {
        return productGateway.getProductByCategory(type);
    }

    @Override
    public ProductDTO getProductById(Integer productId) throws IOException {
        return productGateway.getProductById(productId);
    }

}
