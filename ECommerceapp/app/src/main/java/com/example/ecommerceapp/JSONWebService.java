package com.example.ecommerceapp;

public class JSONWebService {

    public static final String BASE_URL = "put webservice link here";

    private static Retrofit retrofit = null;

    public static Retrofit getRetrofitClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    // Code to define methods to retrieve product data and other information from the JSON web service.
}
