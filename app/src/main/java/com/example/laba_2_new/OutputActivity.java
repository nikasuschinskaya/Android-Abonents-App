package com.example.laba_2_new;

import static com.example.laba_2_new.AddActivity.phones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    private Button buttonCancel;
    private TextView textView;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        buttonCancel = findViewById(R.id.button8);
        textView = findViewById(R.id.textView4);

        s = "";
        for (Phone p : phones) {
            if(p.getInternalCallTime() != 0){
                s += p.toString() + "\n";
            }
        }
        textView.setText(s);

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OutputActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}