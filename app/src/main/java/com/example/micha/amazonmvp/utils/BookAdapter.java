package com.example.micha.amazonmvp.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.micha.amazonmvp.R;
import com.example.micha.amazonmvp.model.Book;

import java.util.List;

/**
 * Created by micha on 2/8/2018.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookHolder> {
    Context context;
    List<Book> list;

    public BookAdapter(Context context, List<Book> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_layout, parent, false);
        return new BookHolder(view);
    }

    @Override
    public void onBindViewHolder(BookHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.author.setText(list.get(position).getAuthor());
        Glide.with(context).load(list.get(position).getImageURL()).into(holder.picture);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BookHolder extends RecyclerView.ViewHolder{
        final TextView title,author;
        final ImageView picture;
        public BookHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.bookTitle);
            author = itemView.findViewById(R.id.author);
            picture = itemView.findViewById(R.id.bookImage);
        }
    }
}
