package com.example.micha.amazonmvp.main;

import com.example.micha.amazonmvp.utils.BaseView;

/**
 * Created by micha on 2/8/2018.
 */

public class MainPresenter implements MainContract.MainPresenter {

    MainContract.MainView view;
    public static final String Base_Url = "http://de-coding-test.s3.amazonaws.com/";


    @Override
    public void bindToView(MainContract.MainView view) {
        this.view = view;
    }

    @Override
    public void unbindView() {
        view = null;
    }
}
