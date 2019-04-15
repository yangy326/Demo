package com.example.yangyang.demo;

import android.support.annotation.StringRes;

import com.example.yangyang.demo.modle.api.Loginmodle;
import com.example.yangyang.demo.modle.api.UserCard;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServer {

    @POST("account/login")
    Call<UserCard> accountLogin(@Body Loginmodle model);
}
