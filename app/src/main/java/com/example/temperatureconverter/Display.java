package com.example.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        textView.setText(result);
    }

    public void backClick(View view) {
        Intent intent = new Intent(Display.this, MainActivity.class);
        startActivity(intent);
    }
}
