package vn.com.dev.mvvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import vn.com.dev.mvvm.repositories.MostPopularTvShowsRepository;
import vn.com.dev.mvvm.response.TvShowsResponse;

public class MostPopularTvShowsViewModel extends ViewModel {
    MostPopularTvShowsRepository tvShowsRepository;

    public MostPopularTvShowsViewModel() {
        tvShowsRepository = new MostPopularTvShowsRepository();
    }

    public LiveData<TvShowsResponse> getMostPopularTvShows(int page) {
        return tvShowsRepository.getMostPopularTvShows(page);
    }
}

