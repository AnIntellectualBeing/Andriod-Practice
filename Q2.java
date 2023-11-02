package com.example.termwork2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView nameDisplay;
    private Button increaseButton;
    private TextView message;
    private int fontSizeCount = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameDisplay = findViewById(R.id.nameDisplay);
        increaseButton = findViewById(R.id.increaseButton);
        message = findViewById(R.id.message);

        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fontSizeCount < 5) {
                    fontSizeCount++;
                    nameDisplay.setTextSize(20 + fontSizeCount * 5);
                    nameDisplay.setText("Your Name");
                } else {
                    increaseButton.setText("You can't perform this operation");
                }
            }
        });
    }
}
