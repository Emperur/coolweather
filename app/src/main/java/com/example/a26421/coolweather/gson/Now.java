package com.example.a26421.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 26421 on 2018/5/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
