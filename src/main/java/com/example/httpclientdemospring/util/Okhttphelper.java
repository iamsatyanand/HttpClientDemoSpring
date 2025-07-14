package com.example.httpclientdemospring.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Okhttphelper {

    private final OkHttpClient client;

    public Okhttphelper(OkHttpClient client) {
        this.client = client;
    }

    public String get(String url) throws IOException{
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unable tp process the request"+ response);
            }
            return response.body().string();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
