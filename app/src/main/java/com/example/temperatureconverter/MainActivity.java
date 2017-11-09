package com.example.temperatureconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);

    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                float inputValue = Float.parseFloat(text.getText().toString());
                Intent intent;
                if (celsiusButton.isChecked()) {
                    intent = createIntent(MainActivity.this, String
                            .valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)), text
                            .getText().toString(), 1);
                } else {
                    intent = createIntent(MainActivity.this, text
                            .getText().toString(), String
                            .valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)), 0);
                }
                startActivity(intent);
                break;
        }
    }

    public static Intent createIntent(Context context, String celsius, String fahrenheit, int flag) {
        String result;
        if(flag == 1) {
            result = fahrenheit + "F is " + celsius + "C";
        } else {
            result = celsius + "C is " + fahrenheit + "F";
        }
        Intent intent = new Intent(context, Display.class);
        intent.putExtra("result", result);
        return intent;
    }
}