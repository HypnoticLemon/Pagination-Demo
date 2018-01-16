package com.example.sit78.recyclerpaginationdemo;

// FIXME generate failure  field _$Meta40

import java.util.List;

/**
 * Created by Vikrant on 11-01-2018.
 */

public class MovieListData {

    private String status;
    private String status_message;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private int movie_count;
        private int limit;
        private int page_number;
        private java.util.List<MoviesBean> movies;

        public int getMovie_count() {
            return movie_count;
        }

        public void setMovie_count(int movie_count) {
            this.movie_count = movie_count;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getPage_number() {
            return page_number;
        }

        public void setPage_number(int page_number) {
            this.page_number = page_number;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {

            private int id;
            private String url;
            private String imdb_code;
            private String title;
            private String title_english;
            private String title_long;
            private String slug;
            private int year;
            private double rating;
            private int runtime;
            private String summary;
            private String description_full;
            private String synopsis;
            private String yt_trailer_code;
            private String language;
            private String mpa_rating;
            private String background_image;
            private String background_image_original;
            private String small_cover_image;
            private String medium_cover_image;
            private String large_cover_image;
            private String state;
            private String date_uploaded;
            private int date_uploaded_unix;
            private java.util.List<String> genres;
            private java.util.List<TorrentsBean> torrents;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getImdb_code() {
                return imdb_code;
            }

            public void setImdb_code(String imdb_code) {
                this.imdb_code = imdb_code;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTitle_english() {
                return title_english;
            }

            public void setTitle_english(String title_english) {
                this.title_english = title_english;
            }

            public String getTitle_long() {
                return title_long;
            }

            public void setTitle_long(String title_long) {
                this.title_long = title_long;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public double getRating() {
                return rating;
            }

            public void setRating(double rating) {
                this.rating = rating;
            }

            public int getRuntime() {
                return runtime;
            }

            public void setRuntime(int runtime) {
                this.runtime = runtime;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getDescription_full() {
                return description_full;
            }

            public void setDescription_full(String description_full) {
                this.description_full = description_full;
            }

            public String getSynopsis() {
                return synopsis;
            }

            public void setSynopsis(String synopsis) {
                this.synopsis = synopsis;
            }

            public String getYt_trailer_code() {
                return yt_trailer_code;
            }

            public void setYt_trailer_code(String yt_trailer_code) {
                this.yt_trailer_code = yt_trailer_code;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public String getMpa_rating() {
                return mpa_rating;
            }

            public void setMpa_rating(String mpa_rating) {
                this.mpa_rating = mpa_rating;
            }

            public String getBackground_image() {
                return background_image;
            }

            public void setBackground_image(String background_image) {
                this.background_image = background_image;
            }

            public String getBackground_image_original() {
                return background_image_original;
            }

            public void setBackground_image_original(String background_image_original) {
                this.background_image_original = background_image_original;
            }

            public String getSmall_cover_image() {
                return small_cover_image;
            }

            public void setSmall_cover_image(String small_cover_image) {
                this.small_cover_image = small_cover_image;
            }

            public String getMedium_cover_image() {
                return medium_cover_image;
            }

            public void setMedium_cover_image(String medium_cover_image) {
                this.medium_cover_image = medium_cover_image;
            }

            public String getLarge_cover_image() {
                return large_cover_image;
            }

            public void setLarge_cover_image(String large_cover_image) {
                this.large_cover_image = large_cover_image;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getDate_uploaded() {
                return date_uploaded;
            }

            public void setDate_uploaded(String date_uploaded) {
                this.date_uploaded = date_uploaded;
            }

            public int getDate_uploaded_unix() {
                return date_uploaded_unix;
            }

            public void setDate_uploaded_unix(int date_uploaded_unix) {
                this.date_uploaded_unix = date_uploaded_unix;
            }

            public List<String> getGenres() {
                return genres;
            }

            public void setGenres(List<String> genres) {
                this.genres = genres;
            }

            public List<TorrentsBean> getTorrents() {
                return torrents;
            }

            public void setTorrents(List<TorrentsBean> torrents) {
                this.torrents = torrents;
            }

            public static class TorrentsBean {
                /**
                 * url : https://yts.am/torrent/download/2AA5718ACCA795893A18CA246998FC55C1A876C0
                 * hash : 2AA5718ACCA795893A18CA246998FC55C1A876C0
                 * quality : 720p
                 * seeds : 608
                 * peers : 121
                 * size : 636.61 MB
                 * size_bytes : 667533967
                 * date_uploaded : 2018-01-06 18:27:16
                 * date_uploaded_unix : 1515281236
                 */

                private String url;
                private String hash;
                private String quality;
                private int seeds;
                private int peers;
                private String size;
                private long size_bytes;
                private String date_uploaded;
                private long date_uploaded_unix;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHash() {
                    return hash;
                }

                public void setHash(String hash) {
                    this.hash = hash;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public int getSeeds() {
                    return seeds;
                }

                public void setSeeds(int seeds) {
                    this.seeds = seeds;
                }

                public int getPeers() {
                    return peers;
                }

                public void setPeers(int peers) {
                    this.peers = peers;
                }

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public long getSize_bytes() {
                    return size_bytes;
                }

                public void setSize_bytes(long size_bytes) {
                    this.size_bytes = size_bytes;
                }

                public String getDate_uploaded() {
                    return date_uploaded;
                }

                public void setDate_uploaded(String date_uploaded) {
                    this.date_uploaded = date_uploaded;
                }

                public long getDate_uploaded_unix() {
                    return date_uploaded_unix;
                }

                public void setDate_uploaded_unix(long date_uploaded_unix) {
                    this.date_uploaded_unix = date_uploaded_unix;
                }
            }
        }
    }
}
