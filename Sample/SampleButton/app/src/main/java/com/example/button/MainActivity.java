package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);



        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton.setChecked(true);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                display_message();
                Log.d("Hustar","Change the RadioCheckBox");
            }
        });

        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setChecked(true);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_message();
            }
        });
        display_message();
    }

    private void display_message(){
        String checkBoxMsg = "";

        if(checkBox.isChecked())
        {
            Log.d("Hustar","Checkbox is Checked");
            checkBoxMsg = checkBox.getText().toString();
        }

        int SelectedRadioId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(SelectedRadioId);

        String msg = radioButton.getText().toString() + " " + checkBoxMsg;
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }
}