package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

import static com.example.myapplication.MainActivity.EXTRA_MESSAGE;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        String m = i.getStringExtra(EXTRA_MESSAGE);

        Student s = (Student)i.getSerializableExtra("MyClass");

        TextView textView = findViewById(R.id.textView2);
        textView.setText(s.getFirstName() + m);
    }
}
