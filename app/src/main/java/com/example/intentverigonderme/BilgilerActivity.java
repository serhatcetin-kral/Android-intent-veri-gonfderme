package com.example.intentverigonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BilgilerActivity extends AppCompatActivity {

    TextView txtbilgiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgiler);


        txtbilgiler=findViewById(R.id.txt_bilgiler);

        Intent verial=getIntent();


        String alinanad=verial.getStringExtra("isim");
        String alinansoyad=verial.getStringExtra("soyad");
 txtbilgiler.setText(alinanad+" "+alinansoyad);
    }
}