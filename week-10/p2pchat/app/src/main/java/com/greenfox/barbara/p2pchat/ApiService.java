package com.greenfox.barbara.p2pchat;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Barbara on 16/11/2017.
 */

    public interface ApiService {
        @GET("/api/messages")
        Call<MessageResponse> getMessages();

        @POST("/api/messages")
        Call<StatusResponse> postMessage(@Body Message message);
    }

