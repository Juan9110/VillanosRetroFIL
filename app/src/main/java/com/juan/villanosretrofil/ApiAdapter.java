package com.juan.villanosretrofil;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;
import  retrofit2.Retrofit ;

public class ApiAdapter {
private static ApiService API_SERVICE;
private static Retrofit retrofit;
private static String baseUrl = "https://apcpruebas.es/";

    private static final int tiempoConexion = 60;


    public static Retrofit getDatosServidor(){  //CREAMOS UN INTERSECTOR Y LE INDICAMOS EL LOM LEVEL A USAR

    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
    logging.setLevel(HttpLoggingInterceptor.Level.BODY);

    //ASOCIAMOS EL INTERLOCUTOR ALA PETICICION
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .readTimeout(tiempoConexion, TimeUnit.SECONDS)
                .writeTimeout(tiempoConexion,TimeUnit.SECONDS)
                .connectTimeout(tiempoConexion,TimeUnit.SECONDS)
                .addInterceptor(logging).build();

        if (API_SERVICE == null){
            retrofit = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).client(httpClient).build();
            API_SERVICE = retrofit.create(ApiService.class);
        }
        return retrofit;

}
}
