package com.example.httpclientdemospring.gateway;

import com.example.httpclientdemospring.dto.CategoryDTO;
import com.example.httpclientdemospring.dto.FakeStoreCategoryResponseDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

List<CategoryDTO> getAllCategories() throws IOException;
}
