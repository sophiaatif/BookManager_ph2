package com.example.chalmers.bookmanager_ph2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    SimpleBookManager bookManager = new SimpleBookManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail); // xml is attached here to the current view

        bookManager.createBook("James Brown","Davinci Code",200,"testNumber1","History");
        bookManager.createBook("Mark Manson","How to...",200,"testNumber2","self help");

        final TextView titleView = (TextView) findViewById(R.id.title);
        titleView.setText(bookManager.getBook(0).getTitle());

//        final TextView titleView = (TextView) findViewById(R.id.authorValue);
//        titleView.setText(bookManager.getBook(0).getTitle());
//
//        final TextView courseView = (TextView) findViewById(R.id.courseValue);
//        courseView.setText(bookManager.getBook(0).getCourse());
//
////        final TextView priceView = (TextView) findViewById(R.id.priceValue);
////        priceView.setText(bookManager.getBook(0).getPrice());
//
//        final TextView isbnView = (TextView) findViewById(R.id.isbnValue);
//        isbnView.setText(bookManager.getBook(0).getIsbn());



    }
}
