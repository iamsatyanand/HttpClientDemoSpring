package com.example.httpclientdemospring.gateway;

import com.example.httpclientdemospring.dto.CategoryDTO;
import com.example.httpclientdemospring.dto.FakeStoreCategoryResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Component("fakeStoreCategoryRestTemplateGateway")
//@Primary
public class FakeStoreCategoryRestTemplateGateway implements ICategoryGateway{

    private final RestTemplate restTemplate;
    @Value("${BASE_URL}")
    private String BASE_URL;

    public FakeStoreCategoryRestTemplateGateway(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO response = restTemplate.getForObject(BASE_URL+"products/category", FakeStoreCategoryResponseDTO.class);
        if(response == null){
            throw new IOException("No content found");
        }
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
