package com.example.scrollview;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scrollview.R;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    int imageindex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmap.getIntrinsicWidth();
        imageView.getLayoutParams().height = bitmap.getIntrinsicHeight();
    }

    public void onButton1Clicked(View view) {
        changeImage();
    }

    private void changeImage() {
        if(imageindex==0) {
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image02);
            imageView.setImageDrawable(bitmap);
            imageView.getLayoutParams().width = bitmap.getIntrinsicWidth();
            imageView.getLayoutParams().height = bitmap.getIntrinsicHeight();

            imageindex = 1;
        }
        else {
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
            imageView.setImageDrawable(bitmap);
            imageView.getLayoutParams().width = bitmap.getIntrinsicWidth();
            imageView.getLayoutParams().height = bitmap.getIntrinsicHeight();

            imageindex =0;
        }
    }
}

