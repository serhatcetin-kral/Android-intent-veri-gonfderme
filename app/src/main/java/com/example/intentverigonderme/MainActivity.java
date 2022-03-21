package com.example.intentverigonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText name,surname;
   Button btn_gonder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.edit_name);
        surname=findViewById(R.id.edit_surname);
        btn_gonder=findViewById(R.id.send);
        btn_gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ad=name.getText().toString();
                String soyad=surname.getText().toString();

                Intent git=new Intent(MainActivity.this,BilgilerActivity.class);

                git.putExtra("isim",ad);
                git.putExtra("soyad",soyad);
                startActivity(git);


            }
        });
    }
}