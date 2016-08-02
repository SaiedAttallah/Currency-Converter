package com.cosmos.sattallah.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        EditText dollarEditText = (EditText) findViewById(R.id.dollar_edit_text);
        Double dollarAmount = Double.valueOf(dollarEditText.getText().toString());
        Double egyPoundAmount = dollarAmount * 8.8;
        ImageView currencyImage = (ImageView) findViewById(R.id.currency_image_view);
        currencyImage.setImageResource(R.drawable.egyptian_pound);
        TextView egyPoundTextView = (TextView) findViewById(R.id.egy_pound_text_view);
        egyPoundTextView.setText(egyPoundAmount.toString());
    }

    public void resetImage(View view){
        ImageView currencyImage = (ImageView) findViewById(R.id.currency_image_view);
        currencyImage.setImageResource(R.drawable.us_dollar);
    }
}
