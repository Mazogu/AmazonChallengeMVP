package com.example.micha.amazonmvp.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by micha on 2/8/2018.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookHolder> {

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BookHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BookHolder extends RecyclerView.ViewHolder{

        public BookHolder(View itemView) {
            super(itemView);
        }
    }
}
