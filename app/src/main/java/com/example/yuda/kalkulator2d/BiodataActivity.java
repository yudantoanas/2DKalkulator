package com.example.yuda.kalkulator2d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BiodataActivity extends AppCompatActivity {

    EditText inputNama;
    Button btnSave, btnClear;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        inputNama = (EditText) findViewById(R.id.inputNama);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = inputNama.getText().toString();
                if (nama.isEmpty()) {
                    inputNama.setError("Nama tidak boleh kosong");
                } else {
                    Intent send = new Intent(getApplicationContext(), HasilActivity.class);
                    send.putExtra("nama", nama);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNama.setText("");
                Toast.makeText(BiodataActivity.this, "Cleared !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
