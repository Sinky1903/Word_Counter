package com.codeclan.example.stringsplit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sentence;
    Button countButton;
    TextView length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentence = (EditText) findViewById(R.id.sentence);
        countButton = (Button) findViewById(R.id.count_btn);
        length = (TextView) findViewById(R.id.count_number);
    }

    public void onCountButtonClicked(View button) {
        StringSplitter number = new StringSplitter();
        String digit = number.countString();
        length.setText(digit);
    }
}
