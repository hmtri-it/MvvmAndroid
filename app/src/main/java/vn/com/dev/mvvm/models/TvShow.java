package vn.com.dev.mvvm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TvShow {
    public int id;
    public String name;
    public String permalink;
    public String start_date;
    public Object end_date;
    public String country;
    public String network;
    public String status;
    public String image_thumbnail_path;
}
