package com.example.chalmers.bookmanager_ph2;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    SimpleBookManager bookManager = new SimpleBookManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Book View");
        bookManager.createBook("James Brown","Davinci Code",200,"testNumber1","History");
        bookManager.createBook("Mark Manson","How to...",200,"testNumber2","self help");
        bookManager.createBook("Mark3","Davinci3",200,"testNumber3","history3");
        bookManager.createBook("Mark4","Davinci4",200,"testNumber4","history4");
        bookManager.createBook("Mark5","Davinci5",200,"testNumber5","history5");
        //setContentView(R.layout.activity_test);
        setContentView(R.layout.book_view);

        final TextView titleTextView = (TextView) findViewById(R.id.titleValue);
        titleTextView.setText(bookManager.getBook(0).getTitle());

        final TextView authorTextView = (TextView) findViewById(R.id.authorValue);
        authorTextView.setText(bookManager.getBook(0).getAuthor());

        final TextView courseTextView = (TextView) findViewById(R.id.courseValue);
        courseTextView.setText(bookManager.getBook(0).getCourse());

        final TextView priceTextView = (TextView) findViewById(R.id.priceValue);
        priceTextView.setText(String.valueOf(bookManager.getBook(0).getPrice()));

        final TextView isbnTextView = (TextView) findViewById(R.id.isbnValue);
        isbnTextView.setText(bookManager.getBook(0).getIsbn());
        final Context context = this;

        final Button button = (Button) findViewById(R.id.goto_summary);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //(View.getId() == R.id.goto_summary){
                    Intent intent = new Intent(context, SummaryActivity.class);
                    startActivity(intent);
                //}
            }
        }
        );


    }

}
