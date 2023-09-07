package com.example.laba_2_new;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {
    public static ArrayList<Phone> phones = new ArrayList<Phone>(){
        {
            add( new Phone(1, "Suschinskaya", "Veronika","Anatolevna",
                "Bobruisk", "234678903456771",
                new Double("2.678"), new Double("6.987"),
                230, 6));
            add(new Phone(2, "Ovchinina", "Olya","Vadimovna",
                    "Kobrin", "555678909456770",
                    new Double("9.678"), new Double("1.987"),
                    50, 0));
        }
};

    private TextInputLayout inputName;
    private TextInputLayout inputSurname;
    private TextInputLayout inputSecondName;
    private TextInputLayout inputAddress;
    private TextInputLayout inputCard;
    private TextInputLayout inputDebet;
    private TextInputLayout inputCredit;
    private TextInputLayout inputCityCallTime;
    private TextInputLayout inputInternalCallTime;
    private Button buttonAdd;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        buttonAdd = findViewById(R.id.button5);
        buttonCancel = findViewById(R.id.button6);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputProcessing();
                DialogFragment dialog = new MyDialogFragment();
                dialog.show(getSupportFragmentManager(), "MyDialogFragmentTag");
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void InitViews(){
        inputName = findViewById(R.id.inputName);
        inputSurname = findViewById(R.id.inputSurname);
        inputSecondName = findViewById(R.id.inputSecondName);
        inputAddress = findViewById(R.id.inputAdress);
        inputCard = findViewById(R.id.inputCard);
        inputDebet = findViewById(R.id.inputDebet);
        inputCredit = findViewById(R.id.inputCredit);
        inputCityCallTime = findViewById(R.id.inputCityCallTime);
        inputInternalCallTime = findViewById(R.id.inputIntCallTime);
    }

    private void InputProcessing(){
        InitViews();
        phones.add(new Phone(phones.size() + 1,
                inputName.getEditText().getText().toString(),
                inputSurname.getEditText().getText().toString(),
                inputSecondName.getEditText().getText().toString(),
                inputAddress.getEditText().getText().toString(),
                inputCard.getEditText().getText().toString(),
                Double.parseDouble(inputDebet.getEditText().getText().toString()),
                Double.parseDouble(inputCredit.getEditText().getText().toString()),
                Integer.parseInt(inputCityCallTime.getEditText().getText().toString()),
                Integer.parseInt(inputInternalCallTime.getEditText().getText().toString())
        ));
    }
}