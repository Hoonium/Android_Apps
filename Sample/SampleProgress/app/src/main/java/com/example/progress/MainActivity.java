package com.example.progress;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.FileUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setIndeterminate(false);
        progressBar.setProgress(80);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog = new ProgressDialog(MainActivity.this);
                dialog.setCancelable(false);
                dialog.setCanceledOnTouchOutside(false);
                dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                dialog.setMessage("데이터 확인하는 중입니다.");

                dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "닫기",(DialogInterface.OnClickListener) null );

                dialog.show();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
    }
}
