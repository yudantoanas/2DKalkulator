package com.example.yuda.kalkulator2d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HasilActivity extends AppCompatActivity {

    TextView textNama;
    Button btnBack;
    String FORMAT_NAMA = "Nama : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        textNama = (TextView) findViewById(R.id.textNama);
        btnBack = (Button) findViewById(R.id.btnBack);

        textNama.setText(FORMAT_NAMA + getIntent().getStringExtra("nama"));
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BiodataActivity.class));
                finish();
            }
        });
    }
}
