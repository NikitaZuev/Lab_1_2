package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private TextView text_gen;
    private Button gen_bt;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_gen = findViewById(R.id.text_gen);
        gen_bt = findViewById(R.id.gen_bt);
        tv_result = findViewById((R.id.tv_result));
        gen_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textone = ( (Phraser.PhraserGen()) );
                text_gen.setText(textone.substring(0,1).toUpperCase()+ textone.substring(1));
                int indexIs = textone.indexOf("это");
                indexIs = indexIs + 5;
                String Delete = textone.substring(indexIs,textone.length()-1);
                String Lenr = (Delete.substring(0,1).toUpperCase()+ Delete.substring(1) + " - это " + textone.substring(0,indexIs-7) + "." );
                tv_result.setText(Lenr);
            }
        });
    }
}