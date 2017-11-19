package com.example.yuda.kalkulator2d;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HasilActivity extends AppCompatActivity {

    TextView textNama;
    String FORMAT_NAMA = "Nama : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        textNama = (TextView) findViewById(R.id.textNama);
        textNama.setText(FORMAT_NAMA);
    }
}
