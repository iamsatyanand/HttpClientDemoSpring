package com.example.httpclientdemospring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreProductResponseDTO {
    private String status;

    private String message;

    private ProductDTO product;
}
