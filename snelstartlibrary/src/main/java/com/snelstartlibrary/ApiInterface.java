package com.snelstartlibrary;

import com.modelclass.SnelStartProductResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by samir on 9/4/2017.
 */

public interface ApiInterface {

    @GET("products?")
    Call<SnelStartProductResponse> getProductList(@Query("api_key") String apiKey, @Query("page_number") String pageNumber);





}
