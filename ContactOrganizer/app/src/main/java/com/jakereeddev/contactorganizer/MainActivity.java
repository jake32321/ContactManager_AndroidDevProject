package com.jakereeddev.contactorganizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameTxt, phoneTxt, emailTxt, addressTxt;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigns various text-inputs to variables
        nameTxt = (EditText) findViewById(R.id.contactName);
        phoneTxt = (EditText) findViewById(R.id.contactPhoneNumber);
        emailTxt = (EditText) findViewById(R.id.contactEmail);
        addressTxt = (EditText) findViewById(R.id.contactAddress);
        addBtn = (Button) findViewById(R.id.addButton);

        nameTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                addBtn.setEnabled(!nameTxt.getText().toString().trim().isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
