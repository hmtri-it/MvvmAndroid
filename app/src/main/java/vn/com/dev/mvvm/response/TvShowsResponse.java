package vn.com.dev.mvvm.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.dev.mvvm.models.TvShow;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TvShowsResponse {
    @SerializedName("total")
    public String total;
    @SerializedName("page")
    public int page;
    @SerializedName("pages")
    public int pages;
    @SerializedName("tv_shows")
    public List<TvShow> tv_shows;
}
