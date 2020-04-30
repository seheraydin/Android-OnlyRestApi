package com.example.myapplication.RestApi;

import com.example.myapplication.Models.Bilgi;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager{

    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance()
    {
        return ourInstance;
    }

    public Call<List<Bilgi>> getirBilgi()
    {


        Call<List<Bilgi>> x = getRestApiClient().getir();
        return x;
    }
}
