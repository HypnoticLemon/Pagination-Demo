package com.example.sit78.recyclerpaginationdemo;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by sit78 on 12-01-2018.
 */

public interface ApiInterface {

    @POST("list_movies.json")
    Call<MovieListData> getMovieListDataCall();
}
