package com.example.ratingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);

    }
    public void submit(View view){
        float Ratingvalue =ratingBar.getRating();
        if(Ratingvalue<=0){
            textView.setText("Rating"+ Ratingvalue + "\n very bad");
        }
       else if(Ratingvalue < 2) {
            textView.setText("Rating" + Ratingvalue + "\n we will try better next time");
        }
        else if(Ratingvalue <= 3 && Ratingvalue >= 2) {
            textView.setText("Rating" + Ratingvalue + "\n we are constantly improving");
        }
        else if (Ratingvalue < 5 && Ratingvalue >= 4) {
            textView.setText("Rating" + Ratingvalue + "\n good");
        }
        else if(Ratingvalue == 5) {
            textView.setText("Rating" + Ratingvalue + "\n very good");
        }
        }
        }

