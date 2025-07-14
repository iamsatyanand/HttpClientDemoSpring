package com.example.httpclientdemospring.gateway;

import com.example.httpclientdemospring.dto.FakeStoreProductByCategoryResponseDTO;
import com.example.httpclientdemospring.dto.FakeStoreProductResponseDTO;
import com.example.httpclientdemospring.dto.ProductDTO;
import com.example.httpclientdemospring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway{

    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public List<ProductDTO> getProductByCategory(String type) throws IOException {
        FakeStoreProductByCategoryResponseDTO response = fakeStoreProductApi.getProductByCategory(type).execute().body();
        if(response == null){
            throw new IOException("Products with category "+type+ " not found.");
        }
        return response.getProducts();

    }

    @Override
    public ProductDTO getProductById(Integer productId) throws IOException{
        FakeStoreProductResponseDTO response = fakeStoreProductApi.getProductById(productId).execute().body();
        if (response == null) {
            throw new IOException("Product not found");
        }

        return response.getProduct();
    }


}
