package com.example.yangyang.demo.data;

import com.example.yangyang.demo.ApiServer;
import com.example.yangyang.demo.callback.AccountCallBack;
import com.example.yangyang.demo.modle.api.Loginmodle;
import com.example.yangyang.demo.modle.api.UserCard;
import com.example.yangyang.demo.modle.db.User;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AccountHelper {




    public static void login(Loginmodle loginmodle, final AccountCallBack.Callback<UserCard> callback){

        OkHttpClient client = new OkHttpClient.Builder().build();

        Retrofit.Builder builder = new Retrofit.Builder();

        Retrofit retrofit = builder.baseUrl("http://10.30.11.36:8080/Gradle___iTalker___iTalker_1_0_SNAPSHOT_war/api/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create()).build();
        ApiServer server = retrofit.create(ApiServer.class);

        Call<UserCard> call = server.accountLogin(loginmodle);

        call.enqueue(new Callback<UserCard>() {
            @Override
            public void onResponse(Call<UserCard> call, Response<UserCard> response) {

                UserCard userCard = response.body();

                if (userCard != null){

                    callback.Success(userCard);
                }



            }

            @Override
            public void onFailure(Call<UserCard> call, Throwable t) {

                callback.Failed(1);

            }
        });







    }
}
