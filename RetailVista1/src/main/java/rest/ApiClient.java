package rest;

import java.io.IOException;

import CommonClass.StaticValues;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by samir on 9/4/2017.
 */

public class ApiClient {
    public static String BASE_URL = "http://stagingsrapapi.azurewebsites.net/api/v2/";
    public static final String BASE_URL_FOR_POSTAL_CODE = "https://api.postcodeapi.nu";
    public static final String BASE_URL_FOR_GERMAN_POSTAL_CODE = "https://api.postleitzahlapi.de";
    public static final String BASE_URL_FOR_CONFIG = "http://cllqtv.com/config/";
    public static String BASE_URL_GOOGLE = "https://www.google.com/";
    private static Retrofit retrofit = null;
    public static String BASE_URL_GOOGLE_API = "https://www.googleapis.com/";
    public static Retrofit getClient(String apiName) {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client;
        if (apiName.equalsIgnoreCase(StaticValues.API_POSTCODE)) {
            client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL_FOR_POSTAL_CODE)
                    .addConverterFactory(GsonConverterFactory.create()).client(client)
                    .build();

        } else if (apiName.equalsIgnoreCase(StaticValues.API_GERMAN_POSTCODE)) {
            client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL_FOR_GERMAN_POSTAL_CODE)
                    .addConverterFactory(GsonConverterFactory.create()).client(client)
                    .build();

        } else if (apiName.equalsIgnoreCase(StaticValues.API_HOME_DELIVERY)) {
            client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).client(client)
                    .build();

        } else if (apiName.equalsIgnoreCase(StaticValues.API_CONFIG)) {
            client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL_FOR_CONFIG)
                    .addConverterFactory(GsonConverterFactory.create()).client(client)
                    .build();
        } else {
            return null;
        }

        return retrofit;
    }

    public static Retrofit getGoogleAuthClient(final String authorizationToken) {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("Authorization", "Bearer " + authorizationToken).build();
                return chain.proceed(request);
            }
        }).addInterceptor(interceptor);
        ;

        return new Retrofit.Builder()
                .baseUrl(BASE_URL_GOOGLE_API)
                .addConverterFactory(GsonConverterFactory.create()).client(httpClient.build())
                .build();
    }

    public static Retrofit getClientforAccessToken(final String authorizationToken) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("Authorization", "Bearer " + authorizationToken).build();
                return chain.proceed(request);
            }
        }).addInterceptor(interceptor);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL_GOOGLE)
                .addConverterFactory(GsonConverterFactory.create()).client(httpClient.build())
                .build();
        return retrofit;
    }
}

