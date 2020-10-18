package vn.com.dev.mvvm.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import io.reactivex.annotations.NonNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.com.dev.mvvm.networks.ApiClient;
import vn.com.dev.mvvm.networks.ApiService;
import vn.com.dev.mvvm.response.TvShowsResponse;

public class MostPopularTvShowsRepository {
    private ApiService apiService;

    public MostPopularTvShowsRepository() {
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TvShowsResponse> getMostPopularTvShows(int page) {
        final MutableLiveData<TvShowsResponse> data = new MutableLiveData();
        apiService.getMostPopularTvShows(page).enqueue(new Callback<TvShowsResponse>() {
            @Override
            public void onResponse(@NonNull Call<TvShowsResponse> call, @NonNull Response<TvShowsResponse> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<TvShowsResponse> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }
}
