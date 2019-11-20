package com.ksitizd.insertingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    RadioButton rdoPatlu, rdoMotu, rdoTom;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoPatlu = findViewById(R.id.rdoPatlu);
        rdoMotu = findViewById(R.id.rdoMotu);
        rdoTom = findViewById(R.id.rdoTom);
        img = findViewById(R.id.img);

        rdoPatlu.setOnClickListener(this);
        rdoMotu.setOnClickListener(this);
        rdoTom.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.rdoMotu:
                img.setImageResource(R.drawable.motu);
            break;

            case R.id.rdoPatlu:
                img.setImageResource(R.drawable.patlu);
                break;
            case R.id.rdoTom:
                img.setImageResource(R.drawable.tom);
                break;


        }

    }
}
