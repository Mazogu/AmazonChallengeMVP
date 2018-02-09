package com.example.micha.amazonmvp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.micha.amazonmvp.R;
import com.example.micha.amazonmvp.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainViewInteractor {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private List<Book> books;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        books = new ArrayList<>();
        recyclerView = findViewById(R.id.recycle);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        presenter = new MainPresenter();
        presenter.bindToView(this);
        presenter.start();
    }

    @Override
    public void showError(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void addBooks(Book[] books) {
        this.books.addAll(Arrays.asList(books));
        Log.d(TAG, "addBooks: Success");
    }
}
