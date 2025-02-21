package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        TextView size = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) textView.getText();
                textView.setText(Welcome(text));


            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setTextSize((float) i);
                size.setText("Rozmiar: " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public String Welcome(String text){
        switch(text){
            case "Dzień dobry":
                return "Good morning";
            case "Good morning":
                return "Buenos dias";
            case "Buenos dias":
                return "Dzień dobry";
            default:
               return text;
        }
        /*String[] hellos = {"Dzień dobry", "Good morning", "Buenos dias"};
        for (int j = 0; j < hellos.length; j++)
        {
            if(text == hellos[j])
            {
                if(j + 1 > hellos.length)
                {
                    return hellos[0];
                }
                else
                {
                    return hellos[j + 1];
                }
            }
        }*/
    }
}