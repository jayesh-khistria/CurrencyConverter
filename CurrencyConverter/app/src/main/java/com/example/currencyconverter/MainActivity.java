package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText cadEditText;
    private EditText usdEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadEditText = findViewById(R.id.cadEdit);
        usdEditText = findViewById(R.id.usdEdit);

    }

    public void calculate(View view){
        String cadVal = cadEditText.getText().toString();
        String usdVal = usdEditText.getText().toString();
        if(!cadVal.isEmpty() && usdVal.isEmpty()){
            double finalValue = 0.75 * Double.parseDouble(cadVal);
            usdEditText.setText(String.valueOf(finalValue));
        }
        if(cadVal.isEmpty() && !usdVal.isEmpty()){
            double finalValue = 1.34 * Double.parseDouble(usdVal);
            cadEditText.setText(String.valueOf(finalValue));
        }

        if(cadVal.isEmpty() && usdVal.isEmpty()){
            Toast.makeText(this, "Please Enter any value", Toast.LENGTH_SHORT).show();
        }

        if (!cadVal.isEmpty() && !usdVal.isEmpty()){
            Toast.makeText(this, "Please Enter Only One value", Toast.LENGTH_SHORT).show();
        }
    }
}