package com.example.client.utils;

import com.example.client.Entity.Bookentity;
import com.example.client.response.BaseResponse;
import com.example.client.response.BookListResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;

import java.io.IOException;
import java.net.CacheRequest;

public class HTTPUtils {


    OkHttpClient client = new OkHttpClient();
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();

    public BaseResponse post(String url, Bookentity book) throws IOException {
        System.out.println(url);
        RequestBody body = RequestBody.create(
                gson.toJson(book),
                MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code" + response);
            return gson.fromJson(response.body().string(), BaseResponse.class);
        }
    }
            public BookListResponse get (String url, String args) throws IOException {

                Request req = new Request
                    .Builder()
                    .url(url + args)
                    .build();
            try(Response response = client
                    .newCall(req)
                    .execute())
            {
                BookListResponse book = new BookListResponse();
                book = gson.fromJson(response.body().string(),BookListResponse.class);
                return book;
            }

        }
    }

