package com.example.laba_2_new;

import static com.example.laba_2_new.AddActivity.phones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class OutputWithInputActivity extends AppCompatActivity {

    private TextInputLayout inputNumber;
    private Button buttonOut;
    private Button buttonCancel;
    private TextView textView;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_with_input);

        inputNumber = findViewById(R.id.inputNumber);
        buttonOut = findViewById(R.id.button9);
        buttonCancel = findViewById(R.id.button7);
        textView = findViewById(R.id.textView3);

        buttonOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = "";
                for (Phone p : phones) {
                    if(p.getCityCallTime() > Integer.parseInt(inputNumber.getEditText().getText().toString())){
                        s += p.toString() + "\n";
                    }
                }
                textView.setText(s);
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OutputWithInputActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}