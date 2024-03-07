package ru.mirea.lednevadd.ex6;

import static ru.mirea.lednevadd.ex6.R.id.textViewStudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(textViewStudent);

        TextView myTextView = (TextView) findViewById(R.id.textView);

        myTextView.setText("New text in MIREA");

        Button button = findViewById(R.id.button);

        button.setText("MireaButton");

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
    }
}