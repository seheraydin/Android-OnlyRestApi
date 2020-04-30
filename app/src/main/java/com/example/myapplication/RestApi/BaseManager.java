package com.example.myapplication.RestApi;

public class BaseManager {
    //7: RestApi yi döndürecek bu sınıf

    protected RestApi getRestApiClient()
    {
        RestApiClient restApiClient = new RestApiClient(BaseUrl.url_bilgi);
        return restApiClient.getRestApi();
    }
}
