package com.example.my_lenovo.markdowntest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ru.noties.markwon.Markwon;

public class MainActivity extends AppCompatActivity {
private TextView textView = (TextView) findViewById(R.id.text);
private Markwon markdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Markwon.setMarkdown(textView, String.valueOf(markdown));

    }
}
