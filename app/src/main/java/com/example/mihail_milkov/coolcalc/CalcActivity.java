package com.example.mihail_milkov.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Stack;

public class CalcActivity extends Activity {

    TextView resultsView;
    private static final String one = "1";
    private static final String two = "2";
    private static final String three = "3";
    private static final String four = "4";
    private static final String five = "5";
    private static final String six = "6";
    private static final String seven = "7";
    private static final String eight = "8";
    private static final String nine = "9";
    private static final String zero = "0";

    private static final String divide = String.valueOf(Character.toChars(247));
    private static final String multiply = String.valueOf(Character.toChars(215));
    private static final String add = "+";
    private static final String subtract = "-";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        //Buttons
        final Button oneBtn = (Button) findViewById(R.id.oneBtn);
        Button twoBtn = (Button) findViewById(R.id.twoBtn);
        Button threeBtn = (Button) findViewById(R.id.threeBtn);
        Button fourBtn = (Button) findViewById(R.id.fourBtn);
        Button fiveBtn = (Button) findViewById(R.id.fiveBtn);
        Button sixBtn = (Button) findViewById(R.id.sixBtn);
        final Button sevenBtn = (Button) findViewById(R.id.sevenBtn);
        Button eightBtn = (Button) findViewById(R.id.eightBtn);
        Button nineBtn = (Button) findViewById(R.id.nineBtn);
        Button zeroBtn = (Button) findViewById(R.id.zeroBtn);
        Button clearBtn = (Button) findViewById(R.id.clearBtn);

        //Image Buttons
        ImageButton calcBtn = (ImageButton) findViewById(R.id.calcBtn);
        ImageButton devideBtn = (ImageButton) findViewById(R.id.devideBtn);
        ImageButton multiplyBtn = (ImageButton) findViewById(R.id.multiplyBtn);
        ImageButton subtractBtn = (ImageButton) findViewById(R.id.subtractBtn);
        ImageButton addBtn = (ImageButton) findViewById(R.id.addBtn);

        //Text Views
        resultsView = (TextView) findViewById(R.id.resultsView);

        resultsView.setText("0");

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(one);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(two);
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(three);
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(four);
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(five);
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(six);
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(seven);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(eight);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(nine);
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(zero);
            }
        });

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        devideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(divide);
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(multiply);
            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(subtract);
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPress(add);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultsView.setText("0");
            }
        });

    }

    private void numberPress(String number){
        String currentText = resultsView.getText().toString();
        if("0".equals(currentText)){
            resultsView.setText("");
            currentText = "";
        }
        currentText += number;
        resultsView.setText(currentText);
//        changeTextSize();
        calculate();
    }

//    private void changeTextSize() {
//        float textSize = resultsView.getTextSize();
//        int textLen = resultsView.getText().toString().length();
//        if(textSize > 35 && textLen >= 26){
//            textSize = textSize - 1;
//            resultsView.setTextSize(textSize);
//        }
//    }


    public void infixToPostfix() {
        String expr = "A+B*C-D*E";
        Stack<Character> operators = new Stack<Character>();

        for(int i=0; i<expr.length(); i++) {


        }
    }
}
