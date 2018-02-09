package com.example.micha.amazonmvp.main;

import com.example.micha.amazonmvp.Exceptions.ViewNotBoundException;
import com.example.micha.amazonmvp.model.Book;
import com.example.micha.amazonmvp.utils.RetrofitHelper;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by micha on 2/8/2018.
 */

public class MainPresenter implements MainContract.MainPresenterInteractor {

    MainContract.MainViewInteractor view;
    public static final String Base_Url = "http://de-coding-test.s3.amazonaws.com/";


    @Override
    public void bindToView(MainContract.MainViewInteractor view) {
        this.view = view;
    }

    @Override
    public void unbindView() {
        view = null;
    }

    @Override
    public void start() {
        if(view != null){
            RetrofitHelper.getBooks().observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io()).subscribe(new Observer<Book[]>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(Book[] books) {
                    view.addBooks(books);
                }

                @Override
                public void onError(Throwable e) {
                    e.printStackTrace();
                }

                @Override
                public void onComplete() {

                }
            });
        }
        else{
            throw new ViewNotBoundException();
        }
    }
}
