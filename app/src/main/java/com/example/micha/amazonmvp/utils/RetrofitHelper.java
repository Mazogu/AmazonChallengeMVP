package com.example.micha.amazonmvp.utils;

import com.example.micha.amazonmvp.main.MainContract;
import com.example.micha.amazonmvp.main.MainPresenter;
import com.example.micha.amazonmvp.model.Book;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by micha on 2/8/2018.
 */

public class RetrofitHelper {
    public static class Factory{
        public static Retrofit getRetro(){
            return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(MainPresenter.Base_Url).build();
        }

        public RetrofitService getBooks(){
            return Factory.getRetro().create(RetrofitService.class);
        }
    }


    public interface RetrofitService{
        @GET("books.json")
        Observable<Book[]> getBooks();
    }
}
