package edu.qc.seclass.tipcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TipCalculatorActivity extends AppCompatActivity {
    // Declare all variable
    Button buttonCompute;
    EditText checkAmountValue,partySizeValue;
    EditText fifteenPercentTipValue,twentyPercentTipValue,twentyfivePercentTipValue;
    EditText fifteenPercentTotalValue,twentyPercentTotalValue,twentyfivePercentTotalValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkAmountValue=findViewById(R.id.checkAmountValue);
        partySizeValue=findViewById(R.id.partySizeValue);
        buttonCompute=findViewById(R.id.buttonCompute);

        fifteenPercentTipValue=findViewById(R.id.fifteenPercentTipValue);
        twentyPercentTipValue=findViewById(R.id.twentyPercentTipValue);
        twentyfivePercentTipValue=findViewById(R.id.twentyfivePercentTipValue);
        fifteenPercentTotalValue=findViewById(R.id.fifteenPercentTotalValue);
        twentyPercentTotalValue=findViewById(R.id.twentyPercentTotalValue);
        twentyfivePercentTotalValue=findViewById(R.id.twentyfivePercentTotalValue);
        // click listener on button
        buttonCompute.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        // get the value form the edit text i.e checkAmountValue
        String ed_text1 = checkAmountValue.getText().toString().trim();
        // get the value form the edit text i.e partySizeValue
        String ed_text2 = partySizeValue.getText().toString().trim();
        // check checkAmountValue is empty or not
        if (ed_text1.equals("")) {
            Toast.makeText(getApplicationContext(), "Empty or incorrect value(s)!", Toast.LENGTH_LONG).show();
            // check partySizeValue is empty or not
        } else if (ed_text2.equals("")) {
            Toast.makeText(getApplicationContext(), "Empty or incorrect value(s)!", Toast.LENGTH_LONG).show();
        } else {
            // convert checkAmountValue,partySizeValue to int
            // trim use for extra white space
            int amount;
            amount = Integer.parseInt(checkAmountValue.getText().toString().trim());
            int partySize = Integer.valueOf(partySizeValue.getText().toString().trim());
            // check amount is negative
            if (amount < 0) {
                Toast.makeText(getApplicationContext(), "Invalid for negative values!", Toast.LENGTH_LONG).show();
                // check partySize is negative
            } else if (partySize <= 0) {
                Toast.makeText(getApplicationContext(), "Invalid for negative values!", Toast.LENGTH_LONG).show();
            }
            else {
                // calculate the value
                double value = ((double) amount / partySize);
                // find all tip percentage
                long fifteenTip = Math.round(value * (.15));
                long twentyTip = Math.round(value * (.20));
                long twentyfiveTip = Math.round(value * (.25));
                // find the tip total
                double fifteenTotal = value + fifteenTip;
                double twentyTotal = value + twentyTip;
                double twentyfiveTotal = value + twentyfiveTip;
                // set all tip values on edittext
                fifteenPercentTipValue.setText(String.valueOf(fifteenTip));
                twentyPercentTipValue.setText(String.valueOf(twentyTip));
                twentyfivePercentTipValue.setText(String.valueOf(twentyfiveTip));
                // set all total values on edittext
                fifteenPercentTotalValue.setText(String.valueOf((int) fifteenTotal));
                twentyPercentTotalValue.setText(String.valueOf((int) twentyTotal));
                twentyfivePercentTotalValue.setText(String.valueOf((int) twentyfiveTotal));
            }
        }

    }
}