package com.example.micha.amazonmvp.main;

import com.example.micha.amazonmvp.model.Book;
import com.example.micha.amazonmvp.utils.BasePresenter;
import com.example.micha.amazonmvp.utils.BaseView;

/**
 * Created by micha on 2/8/2018.
 */

public interface MainContract {
    public interface MainViewInteractor extends BaseView{
        public void addBooks(Book[] books);
    }

    public interface MainPresenterInteractor extends BasePresenter<MainViewInteractor>{
        public void start();
    }
}
