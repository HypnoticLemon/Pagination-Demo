package com.example.sit78.recyclerpaginationdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ProgressBar;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements RecyclerListListener {
    private RecyclerView recyclerView;
    private MovieListAdapter movieListAdapter;
    private List<MovieListData.DataBean.MoviesBean> movieListData;
    private Context context;
    LinearLayoutManager layoutManager;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    public static final int PAGE_SIZE = 30;
    RecyclerListListener recyclerListListener;
    private ProgressBar progressBarMovieList;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, MainActivity.class.getSimpleName());
        context = MainActivity.this;
        recyclerListListener = this;
        initialization();
        eventListener();
    }

    private void initialization() {
        Log.d(TAG, "initialization");
        recyclerView = new RecyclerView(context);
        layoutManager = new LinearLayoutManager(context);
        progressBarMovieList = findViewById(R.id.progressBarMovieList);
        recyclerView.setLayoutManager(layoutManager);
        movieListData = new ArrayList<>();
        movieListAdapter = new MovieListAdapter(context, movieListData, recyclerListListener);
        recyclerView.setAdapter(movieListAdapter);
        getMovieList();
    }

    private void eventListener() {
        recyclerView.addOnScrollListener(onScrollListener);
    }


    private RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            int visibleItemCount = layoutManager.getChildCount();
            int totalItemCount = layoutManager.getItemCount();
            int firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();

            if (!isLoading && !isLastPage) {
                if ((visibleItemCount + firstVisibleItemPosition) >= totalItemCount
                        && firstVisibleItemPosition >= 0
                        && totalItemCount >= PAGE_SIZE) {
                    loadMoreItems();
                }
            }
        }
    };


    private void loadMoreItems() {

    }

    @Override
    public void ItemClick(int position, String data, View view, int id) {
        
    }

    private void getMovieList() {
        progressBarMovieList.setVisibility(View.VISIBLE);
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<MovieListData> call = apiService.getMovieListDataCall();
        call.enqueue(new Callback<MovieListData>() {
            @Override
            public void onResponse(Call<MovieListData> call, Response<MovieListData> response) {
                Log.e(TAG, "onResponse: " + response);
                Log.e(TAG, "onResponse:getMovie_count =  " + response.body().getData().getMovie_count());
                progressBarMovieList.setVisibility(View.GONE);
                if (response.isSuccessful()) {
                    if (response.body().getStatus().equals("ok")) {
                        Gson mGson = new Gson();

                        MovieListData.DataBean movieListData = response.body().getData();

                        List<MovieListData.DataBean.MoviesBean> moviesBeans = movieListData.getMovies();

                        Log.e(TAG, "onResponse:size " + moviesBeans.size());
                        Log.d(TAG, "Test logs");
                        Log.d(TAG, "Test fifth logs");


                        Log.e(TAG, "onResponse: " + moviesBeans.get(0).getTitle());
                        movieListAdapter = new MovieListAdapter(context, moviesBeans, recyclerListListener);
                        recyclerView.setAdapter(movieListAdapter);
                        movieListAdapter.notifyDataSetChanged();

                    } else {
                        Log.e(TAG, "onResponse: " + response.body().getStatus_message());
                    }
                }
            }

            @Override
            public void onFailure(Call<MovieListData> call, Throwable t) {
                progressBarMovieList.setVisibility(View.GONE);
                t.printStackTrace();
            }
        });
    }
}

