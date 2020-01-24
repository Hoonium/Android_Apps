package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class LayoutCodeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        Button button1 = new Button(this);
        button1.setText("안녕하세요");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);

        Button button2 = new Button(this);
        button2.setText("반갑습니다.");
        button2.setLayoutParams(params);
        mainLayout.addView(button2);

        setContentView(mainLayout);
    }
}

