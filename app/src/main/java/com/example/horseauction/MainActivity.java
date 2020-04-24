package com.example.horseauction;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    private Button eins;
    private Button zwie;
    private Button drei;
    private ImageView whiteHorse;
    private ImageView blackHorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eins = findViewById(R.id.button);
        zwie = findViewById(R.id.button2);
        drei = findViewById(R.id.button3);
        whiteHorse = findViewById(R.id.imageView2);
        blackHorse = findViewById(R.id.imageView3);

        eins.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View e)
            {

                whiteHorse.setVisibility(View.VISIBLE);
                blackHorse.setVisibility(View.INVISIBLE);

            }
        });

        zwie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View e)
            {

                whiteHorse.setVisibility(View.INVISIBLE);
                blackHorse.setVisibility(View.VISIBLE);

            }
        });

        drei.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View e)
            {

                whiteHorse.setVisibility(View.VISIBLE);
                blackHorse.setVisibility(View.VISIBLE);

            }
        });

    }
}
