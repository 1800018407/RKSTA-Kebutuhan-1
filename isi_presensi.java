package com.example.rksta1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class isi_presensi extends AppCompatActivity {
    private RadioButton isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_presensi);

        isi=(RadioButton)findViewById(R.id.rdb1);

        isi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(isi_presensi.this, presensi.class);
                startActivity(intent);
            }
        });
    }
}