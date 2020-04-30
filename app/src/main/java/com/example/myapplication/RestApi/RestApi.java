package com.example.myapplication.RestApi;

import com.example.myapplication.Models.Bilgi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

    //linkin tamamı : https://jsonplaceholder.typicode.com/todos
   @GET("/todos")

   Call<List<Bilgi>> getir();

}
