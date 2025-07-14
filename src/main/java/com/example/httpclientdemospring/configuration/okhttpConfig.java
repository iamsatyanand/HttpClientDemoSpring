package com.example.httpclientdemospring.configuration;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class okhttpConfig {

    @Bean
    OkHttpClient okHttpClient(){
        return new OkHttpClient();
    }


}
