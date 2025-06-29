package com.example.httpclientdemospring.services;

import com.example.httpclientdemospring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {


    List<CategoryDTO> getAllCategories() throws IOException;
}
