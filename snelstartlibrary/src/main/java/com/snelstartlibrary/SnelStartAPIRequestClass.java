package com.snelstartlibrary;

import com.modelclass.SnelStartProductResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by haresh
 * on 19-03-2019.
 */
public class SnelStartAPIRequestClass {

    public void GetProductData(String APIKey,String PageNumber,final CallBackRequest mCallback) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<SnelStartProductResponse> call = apiService.getProductList(APIKey, PageNumber);
        call.enqueue(new Callback<SnelStartProductResponse>() {
            @Override
            public void onResponse(Call<SnelStartProductResponse> call, Response<SnelStartProductResponse> response) {
                SnelStartProductResponse snelStartProductResponse=response.body();
                mCallback.onSuccess(snelStartProductResponse);
            }

            @Override
            public void onFailure(Call<SnelStartProductResponse> call, Throwable t) {
                mCallback.onFailure(t.getLocalizedMessage());
            }
        });
    }
}
