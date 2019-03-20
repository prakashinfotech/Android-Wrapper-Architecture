package rest;

import ModelClass.AvailableDaysBean;
import ModelClass.GermanPostalCode;
import ModelClass.PostCode;
import ModelClass.SearchPrinterEntity;
import ModelClass.SubmitJobEntity;
import ModelClass.TokenResponse;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import webservice.ConfigrationFile;

/**
 * Created by samir on 9/4/2017.
 */

public interface ApiInterface {

    @GET("lookup/getcalenderavailability/{key}/{date}")
    Call<AvailableDaysBean> getAvailableDays(@Path("key") String apiKey, @Path("date") String date);

    @Headers("X-Api-Key: tdyb8kxrqL4yRtLZI0Bvp2wXSInN4K4n1KOBwYHd")
    @GET("/v2/addresses/")
    Call<PostCode> getpostCode(@Query("postcode") String postcode, @Query("number") String number);

    @Headers("X-Api-Key: tdyb8kxrqL4yRtLZI0Bvp2wXSInN4K4n1KOBwYHd")
    @GET("/v2/addresses/")
    Call<PostCode> getCityAndAddressUsingPostalCode(@Query("postcode") String postcode);

    @Headers("X-Api-Key: q8sdpW9TvJ2GuimI7zveT8PObyprxNUi2Tzu5uNL")
    @GET("/v1/postcodes/{postcode}")
    Call<GermanPostalCode> getpostCodeforGermany(@Path("postcode") String postcode);

    @GET("{key}")
    Call<ConfigrationFile> getConfiguration(@Path("key") String url);
    //http://cllqtv.com/config/Almeerplant-02022018.json

    @FormUrlEncoded
    @POST("oauth2/v4/token")
    Call<TokenResponse> getGenerateToken(@Field("client_id") String client_id, @Field("client_secret") String client_secret, @Field("grant_type") String qrantType, @Field("code") String Code);


    @GET("cloudprint/search")
    Call<SearchPrinterEntity> getSearchPrinter();

    @Multipart
    @POST("cloudprint/submit")
    Call<SubmitJobEntity> getSubmitJob(@Part("printerid") RequestBody printerid,
                                       @Part MultipartBody.Part file,
                                       @Part("title") RequestBody title,
                                       @Part("contentType") RequestBody contentType);



}
