package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editBil1, editBil2;
    private TextView txtHasil;
    private Button btnTambah, btnKurang, btnBagi, btnKali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editBil1=(EditText)findViewById(R.id.editTextBil1);
        editBil2=(EditText)findViewById(R.id.editTextBil2);
        txtHasil=(TextView)findViewById(R.id.textViewHasil);
        btnTambah=(Button)findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(this);
        btnKurang=(Button)findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(this);
        btnKali=(Button)findViewById(R.id.btnKali);
        btnKali.setOnClickListener(this);
        btnBagi=(Button)findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float bil1,bil2, hasil=0;
        Button btn;

        bil1=Float.parseFloat(editBil1.getText().toString());
        bil2=Float.parseFloat(editBil2.getText().toString());

        if (v.getId() == R.id.btnTambah) {
            hasil = bil1 + bil2;
            btn = btnTambah;
        } else if (v.getId() == R.id.btnKurang) {
            hasil = bil1 - bil2;
            btn = btnKurang;
        } else if (v.getId() == R.id.btnKali) {
            hasil = bil1 * bil2;
            btn = btnKali;
        } else if (v.getId() == R.id.btnBagi) {
            hasil = bil1 / bil2;
            btn = btnBagi;
        }
        btn = (Button)findViewById(v.getId());

        txtHasil.setText(bil1+ " " + btn.getText() + " " +bil2 +  " = "+hasil);
    }
}




