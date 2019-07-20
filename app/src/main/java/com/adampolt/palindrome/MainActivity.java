package com.adampolt.palindrome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText wordToCheck = findViewById(R.id.word);
        Button checkButton = findViewById(R.id.check);
        final TextView result = findViewById(R.id.result);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get word to check
                String word = wordToCheck.getText().toString();

                // Reverse it
                String reversed = new StringBuilder(word).reverse().toString();

                // Check that it's equal to itself reversed
                if(word.equals(reversed)) {
                    result.setText(word + " is a palindrome");
                } else {
                    result.setText(word + " is not a palindrome");
                }
            }
        });
    }
}
