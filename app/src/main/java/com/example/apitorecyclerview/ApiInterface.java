package com.example.apitorecyclerview;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/posts")
    Call<ArrayList<Posts>> getPosts();
}
