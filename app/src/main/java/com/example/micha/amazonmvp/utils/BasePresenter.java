package com.example.micha.amazonmvp.utils;

import android.view.View;

/**
 * Created by micha on 2/8/2018.
 */

public interface BasePresenter <T extends BaseView>{
    void bindToView(T view);
    void unbindView();
}
