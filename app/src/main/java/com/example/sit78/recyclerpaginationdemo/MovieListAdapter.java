package com.example.sit78.recyclerpaginationdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

/**
 * Created by Vikrant on 11-01-2018.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieRowHolder> {

    private Context context;
    private List<MovieListData.DataBean.MoviesBean> movieListData;
    private RecyclerListListener recyclerListListener;
    private String TAG = MovieListAdapter.class.getSimpleName();

    public MovieListAdapter(Context context, List<MovieListData.DataBean.MoviesBean> movieListData, RecyclerListListener recyclerListListener) {
        this.context = context;
        this.movieListData = movieListData;
        this.recyclerListListener = recyclerListListener;
        Log.e(TAG, "MovieListAdapter: " + this.movieListData.size() );
    }

    @Override
    public MovieRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_list_row_holder, parent, false);
        return new MovieRowHolder(view);
    }

    @Override
    public void onBindViewHolder(final MovieRowHolder holder, final int position) {

        Log.e(TAG, "onBindViewHolder: " + position);

        holder.textViewMovieTitle.setText(movieListData.get(position).getTitle_english());
        holder.textViewMovieYear.setText(movieListData.get(position).getYear());

        Glide.with(context)
                .load(movieListData.get(position).getMedium_cover_image())
                .apply(new RequestOptions()
                        .placeholder(R.drawable.ic_launcher_foreground)
                        .fitCenter()
                        .diskCacheStrategy(DiskCacheStrategy.ALL))
                .into(holder.imageViewMovieList);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerListListener.ItemClick(position, "Item Click", holder.imageViewMovieList, 0);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != movieListData ? movieListData.size() : 0);
    }

    public class MovieRowHolder extends RecyclerView.ViewHolder {

        ImageView imageViewMovieList;
        TextView textViewMovieTitle, textViewMovieYear;


        public MovieRowHolder(View itemView) {
            super(itemView);
            imageViewMovieList = itemView.findViewById(R.id.imageViewMovieList);
            textViewMovieTitle = itemView.findViewById(R.id.textViewMovieTitle);
            textViewMovieYear = itemView.findViewById(R.id.textViewMovieYear);
        }
    }
}
