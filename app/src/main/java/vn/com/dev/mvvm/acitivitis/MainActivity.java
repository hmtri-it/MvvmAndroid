package vn.com.dev.mvvm.acitivitis;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import vn.com.dev.mvvm.R;
import vn.com.dev.mvvm.response.TvShowsResponse;
import vn.com.dev.mvvm.viewmodels.MostPopularTvShowsViewModel;

public class MainActivity extends AppCompatActivity {

    private MostPopularTvShowsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MostPopularTvShowsViewModel.class);
        getMostPopularTvShows();
    }

    private void getMostPopularTvShows() {
        viewModel.getMostPopularTvShows(0).observe(this, new Observer<TvShowsResponse>() {
            @Override
            public void onChanged(TvShowsResponse response) {
                Toast.makeText(MainActivity.this,
                        "Total page: " + response.pages,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}