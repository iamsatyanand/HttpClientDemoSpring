package com.example.httpclientdemospring.gateway;

import com.example.httpclientdemospring.dto.CategoryDTO;
import com.example.httpclientdemospring.dto.FakeStoreCategoryResponseDTO;
import com.example.httpclientdemospring.gateway.api.FakeStoreCategoryApi;
import com.example.httpclientdemospring.mapper.GetAllCategoriesMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {

        // 1. Make the HTTP request to the FakeStore API to fetch all categories
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();

        // 2. Check if the response is null and throw an IOException if it is
        if(response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        // 3. Map the response to a list of CategoryDTO objects
        return GetAllCategoriesMapper.toCategoryDTO(response);

//        Call<FakeStoreCategoryResponseDTO> retrofitCall = fakeStoreCategoryApi.getAllCategories();
//
//        Response<FakeStoreCategoryResponseDTO> response = retrofitCall.execute();
//
//        FakeStoreCategoryResponseDTO categories = response.body();
//
//        if (categories == null) {
//            throw new IOException("Failed to fetch categories: Response body is null");
//        }
//
//        return categories.getCategories()
//                .stream()
//                .map(category -> CategoryDTO.builder().name(category).build())
//                .toList();


    }
}
