package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RadioButton gender;
    private RadioGroup radioGroup;
    private TextView resulTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnId);
        radioGroup = findViewById(R.id.radiogroupId);
        resulTextView = findViewById(R.id.resultId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                gender = findViewById(selectedId);
                String value = gender.getText().toString();
                resulTextView.setText(value + " is selected");
            }
        });
    }
}