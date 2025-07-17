package com.example.httpclientdemospring.mapper;

import com.example.httpclientdemospring.dto.CategoryDTO;
import com.example.httpclientdemospring.dto.FakeStoreCategoryResponseDTO;

import java.util.List;

public class GetAllCategoriesMapper {

    public static List<CategoryDTO> toCategoryDTO(FakeStoreCategoryResponseDTO response){
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }

}
