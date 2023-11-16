package com.example.myapplication;

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
        setContentView(R.layout.activity_main);

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

                if (edtPanjang.getText().toString().length() == 0) {
                    edtPanjang.setError("Masukkan Nilai Panjang!");
                } else if (edtlebar.getText().toString().length() == 0) {
                    edtlebar.setError("Masukkan Nilai Lebar!");
                } else {
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double luas = p * l;

                    txtLuas.setText("Luas : "+luas);
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtPanjang.setText("");
                edtlebar.setText("");
                txtLuas.setText("");
                edtPanjang.requestFocus();
            }
        });
    }
}