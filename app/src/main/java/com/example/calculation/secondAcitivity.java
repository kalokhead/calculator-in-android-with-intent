package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondAcitivity extends AppCompatActivity {
    Button button22;
    EditText editText22;
    String sdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acitivity);
        button22 = (Button) findViewById(R.id.button22);
        editText22 = (EditText) findViewById(R.id.editText22);
        editText22.setText(getIntent().getStringExtra("data"));

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sdata = editText22.getText().toString();
                Intent intent = new Intent(secondAcitivity.this, MainActivity.class);
                intent.putExtra("data2", sdata);
                startActivity(intent);
                finish();
            }
        });

    }
}
