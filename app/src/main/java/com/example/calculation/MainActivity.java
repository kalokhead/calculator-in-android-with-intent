package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtScreen, resultTxtView, otxtView;
    Float input1, input2, lastChar;
    String len, tempTxtScreen;
    boolean addition, substraction, multiplication, divide;
//    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
//            button0, buttonClear, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonDot, buttonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.button0)).setOnClickListener(this);
        ((Button) findViewById(R.id.button1)).setOnClickListener(this);
        ((Button) findViewById(R.id.button22)).setOnClickListener(this);
        ((Button) findViewById(R.id.button3)).setOnClickListener(this);
        ((Button) findViewById(R.id.button4)).setOnClickListener(this);
        ((Button) findViewById(R.id.button5)).setOnClickListener(this);
        ((Button) findViewById(R.id.button6)).setOnClickListener(this);
        ((Button) findViewById(R.id.button7)).setOnClickListener(this);
        ((Button) findViewById(R.id.button8)).setOnClickListener(this);
        ((Button) findViewById(R.id.button9)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonClear)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonAdd)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonSub)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonMul)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonDiv)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonEqual)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonDot)).setOnClickListener(this);
        txtScreen = (TextView) findViewById(R.id.txtScreen);
        resultTxtView = (TextView) findViewById(R.id.resultTxtView);


        resultTxtView.setText(getIntent().getStringExtra("data2"));
    }

    @Override
    public void onClick(View v) {
        String btnTxt = ((Button) v).getText().toString();

        switch (v.getId()) {
            case R.id.button0:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button1:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button22:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button3:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button4:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button5:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button6:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button7:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button8:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.button9:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;
            case R.id.buttonDot:
                txtScreen.setText(tempTxtScreen = txtScreen.getText() + btnTxt);
                break;


            case R.id.buttonAdd:
                // lastChar=txtScreen.toString().charAt(txtScreen.length()-1);
                if (txtScreen.length() > 0) {
                    txtScreen.setText(tempTxtScreen = txtScreen.getText() + "+");
                    addition = true;
                }
                break;
            case R.id.buttonSub:
                // lastChar=txtScreen.toString().charAt(txtScreen.length()-1);
                if (txtScreen.length() > 0) {
                    txtScreen.setText(tempTxtScreen = txtScreen.getText() + "-");


                    substraction = true;


                }
                break;
            case R.id.buttonMul:
                // lastChar=txtScreen.toString().charAt(txtScreen.length()-1);
                if (txtScreen.length() > 0) {
                    txtScreen.setText(tempTxtScreen = txtScreen.getText() + "*");


                    multiplication = true;
                    divide = false;


                }
                break;
            case R.id.buttonDiv:
                // lastChar=txtScreen.toString().charAt(txtScreen.length()-1);
                if (txtScreen.length() > 0) {
                    txtScreen.setText(tempTxtScreen = txtScreen.getText() + "/");


                    divide = true;


                }
                break;

            case R.id.buttonClear:
                if (txtScreen.length() > 0) {
//
                    String input = txtScreen.getText().toString();
                    String myStr = input.substring(0, input.length() - 1);
                    txtScreen.setText(myStr);
                }
                break;
            case R.id.buttonEqual:
                if (addition || substraction || multiplication || divide) {
                    String spl[] = txtScreen.getText().toString().split("[/*+-]");
                    input1 = Float.parseFloat(spl[0]);
                    input2 = Float.parseFloat(spl[1]);
                }
                if (addition) {
                    resultTxtView.setText(input1 + input2 + "");
                }
                if (substraction) {
                    resultTxtView.setText(input1 - input2 + "");
                }
                if (multiplication) {
                    resultTxtView.setText(input1 * input2 + "");
                }
                if (divide) {
                    resultTxtView.setText(input1 / input2 + "");
                }
                String data=resultTxtView.getText().toString();
                Intent intent=new Intent(MainActivity.this,secondAcitivity.class);
                intent.putExtra("data",data);
                startActivity(intent);
                finish();

        }


    }

}


