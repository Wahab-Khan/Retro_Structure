package com.example.lenovo.retrovsretro.retro;

import com.example.lenovo.retrovsretro.models.GitHubModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WebClient {

    @GET("/users/{userName}/repos")
    Call<List<GitHubModel>> getRepoFromUser(@Path("userName") String name);
}
