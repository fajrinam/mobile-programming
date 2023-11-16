package com.example.hitungluas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtlebar;
    private Button btnHitung, btnClr;
    private TextView txtPanjang, txtLebar, txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText) findViewById((R.id.edtPanjang));
        edtlebar = (EditText) findViewById((R.id.edtlebar));
        btnHitung = (Button) findViewById((R.id.btnHitung));
        btnClr = (Button) findViewById((R.id.btnClr));
        txtLuas = (TextView) findViewById((R.id.txtLuas));

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtlebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double luas = p*l;

                txtLuas.setText("Luas : "+luas);
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtPanjang.setText(0);
                edtlebar.setText(0);
                txtLuas.setText(0);
            }
        });
    }
}