package vn.com.dev.mvvm.networks;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import vn.com.dev.mvvm.response.TvShowsResponse;

public interface ApiService {

    @GET("most-popular")
    Call<TvShowsResponse> getMostPopularTvShows(@Query("page") int page);
}
