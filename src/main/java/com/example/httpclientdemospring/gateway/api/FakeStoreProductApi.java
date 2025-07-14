package com.example.httpclientdemospring.gateway.api;

import com.example.httpclientdemospring.dto.FakeStoreProductByCategoryResponseDTO;
import com.example.httpclientdemospring.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FakeStoreProductApi {

    @GET("products/category")
    Call<FakeStoreProductByCategoryResponseDTO> getProductByCategory(@Query("type") String type);

    @GET("products/{productId}")
    Call<FakeStoreProductResponseDTO> getProductById(@Path("productId") Integer productId);

}
