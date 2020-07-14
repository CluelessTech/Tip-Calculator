package com.priyankgandhi.tipcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText billAmount;
    private SeekBar seekBar;
    private Button calculateButton;
    private TextView resultTotal, textViewSeekBar;
    private int seekBarPercentage;
    private float enterBillFloat;
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        billAmount = findViewById(R.id.billAmountId);
        seekBar = findViewById(R.id.seekBar);
        calculateButton = findViewById(R.id.calculate);
        resultTotal = findViewById(R.id.resultID);
        textViewSeekBar = findViewById(R.id.tvSeekBar);

        calculateButton.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSeekBar.setText(String.valueOf(seekBar.getProgress()) + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBarPercentage = seekBar.getProgress();
            }
        });

    }

    @Override
    public void onClick(View v) {
        calculate();
    }

    private void calculate() {
        float result = 0.0f;
        if (!billAmount.getText().toString().equals("")) {
            enterBillFloat = Float.parseFloat(billAmount.getText().toString());
            result = enterBillFloat * seekBarPercentage / 100;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Your tip will be Rs." + String.valueOf(result) + "\n");
            stringBuilder.append("Total bill amount is Rs." + String.valueOf(enterBillFloat + result));
            resultTotal.setText(stringBuilder);
        } else {
            Toast.makeText(MainActivity.this, "Please enter bill amount", Toast.LENGTH_LONG).show();
        }
    }
}