package com.example.laba_2_new;

import static com.example.laba_2_new.AddActivity.phones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;

public class ComparerActivity extends AppCompatActivity {

    private Button buttonCancel;
    private TextView textView;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparer);

        textView = findViewById(R.id.textView5);
        buttonCancel = findViewById(R.id.button11);

        Collections.sort(phones, new PhoneSurnameComparator());
        s = "";
        for (Phone p: phones) {
            s += p.toString() + "\n";
        }
        textView.setText(s);

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ComparerActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}