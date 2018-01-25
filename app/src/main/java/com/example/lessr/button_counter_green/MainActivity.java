package com.example.lessr.button_counter_green;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lessr.button_counter_green.R.id.btn2;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    Button increase;
    Button decrease;
    Button reset;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase = (Button) findViewById(R.id.btn1);
        txv = (TextView) findViewById(R.id.tv);
        decrease = (Button) findViewById(R.id.btn2);
        reset = (Button) findViewById(R.id.btn3);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                txv.setText(Integer.toString(counter));
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                txv.setText(Integer.toString(counter));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                txv.setText(Integer.toString(counter));
            }
        });
    }
}
