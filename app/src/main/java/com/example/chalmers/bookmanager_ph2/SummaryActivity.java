package com.example.chalmers.bookmanager_ph2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    SimpleBookManager bookManager = new SimpleBookManager();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Summary");
        setContentView(R.layout.activity_summary);
        final TextView totalTextView = (TextView) findViewById(R.id.totalcost_Value);
        final TextView maxTextView = (TextView) findViewById(R.id.mostexpensive_value);
        final TextView minTextView = (TextView) findViewById(R.id.leastexpensive_Value);
        final TextView avgTextView = (TextView) findViewById(R.id.avg_priceValue);


        bookManager.createBook("James Brown","Davinci Code",200,"testNumber1","History");
        bookManager.createBook("Mark Manson","How to...",201,"testNumber2","self help");
        bookManager.createBook("Mark3","Davinci3",202,"testNumber3","history3");
        bookManager.createBook("Mark4","Davinci4",203,"testNumber4","history4");
        bookManager.createBook("Mark5","Davinci5",204,"testNumber5","history5");
try {
    totalTextView.setText(String.valueOf(bookManager.getTotalCost()));
} catch(Exception e){
    e.printStackTrace();
    Log.d("setText Exception:",e.toString());
}

        maxTextView.setText(String.valueOf(bookManager.getMaxPrice()));

        minTextView.setText(String.valueOf(bookManager.getMinPrice()));

        avgTextView.setText(String.valueOf(bookManager.getMeanPrice()));
    }
//    final Context context = this;
//    final Button backButton = (Button) findViewById(R.id.goback);
//    backButton.setOnClickListener(new View.OnClickListener(){
//        public void onClick(View v){
//            //(View.getId() == R.id.goto_summary){
//            Intent intent = new Intent(context, TestActivity.class);
//            startActivity(intent);
//            //}
//        }
//     }
//    );
//}
}