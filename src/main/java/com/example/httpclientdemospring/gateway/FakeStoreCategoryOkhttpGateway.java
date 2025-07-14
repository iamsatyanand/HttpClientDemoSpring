//package com.example.httpclientdemospring.gateway;
//
//import com.example.httpclientdemospring.dto.CategoryDTO;
//import com.example.httpclientdemospring.util.Okhttphelper;
//import org.springframework.beans.factory.annotation.Value;
//
//import java.io.IOException;
//import java.util.List;
//
//public class FakeStoreCategoryOkhttpGateway implements ICategoryGateway{
//
////    public FakeStoreCategoryOkhttpGateway(Okhttphelper okhttphelper) {
////        this.okhttphelper = okhttphelper;
////    }
////
////    private final Okhttphelper okhttphelper;
////    @Value("${BASE_URL}")
////    private String BASE_URL ;
////
////    @Override
////    public List<CategoryDTO> getAllCategories() throws IOException {
////        return okhttphelper.get(BASE_URL+"products/category");
////    }
//}
