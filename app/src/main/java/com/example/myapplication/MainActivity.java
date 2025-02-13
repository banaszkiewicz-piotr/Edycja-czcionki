package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        SeekBar seekBar = findViewById(R.id.seekBar);
        Button button = findViewById(R.id.button);
    }

    public String Welcome(String text){
        switch(text){
            case "Dzień dobry":
                return "Hello";
            break;
            case "Hello":
                return "Guten Tag";
            break;
            case "Guten Tag":
                return "Buenos dias";
            break;
            case "Buenos dias":
                return "Dzień dobry";
            break;
            default:
                return text;
        }
    }
}