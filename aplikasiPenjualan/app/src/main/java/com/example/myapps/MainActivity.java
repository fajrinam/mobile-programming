package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtnmPembeli, edtnmBrg, edtjmlBrg, edtHarga, edtBayar;
    private TextView txtnmPembeli, txtnmBrg, txtjmlBrg, txtHarga, txtBayar, txtTotal, txtKembalian, txtBonus, txtKeterangan;
    private Button btnProses, btnClear, btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnmPembeli = (EditText) findViewById((R.id.edtnmPembeli));
        edtnmBrg = (EditText) findViewById((R.id.edtnmBrg));
        edtjmlBrg = (EditText) findViewById((R.id.edtjmlBrg));
        edtHarga = (EditText) findViewById((R.id.edtHarga));
        edtBayar = (EditText) findViewById((R.id.edtBayar));
        btnProses = (Button) findViewById((R.id.btnProses));
        btnClear = (Button) findViewById((R.id.btnClear));
        btnKeluar = (Button) findViewById((R.id.btnKeluar));
        txtnmPembeli = (TextView) findViewById((R.id.txtnmPembeli));
        txtnmBrg = (TextView) findViewById((R.id.txtnmBrg));
        txtjmlBrg = (TextView) findViewById((R.id.txtjmlBrg));
        txtHarga = (TextView) findViewById((R.id.txtHarga));
        txtBayar = (TextView) findViewById((R.id.txtBayar));
        txtTotal = (TextView) findViewById((R.id.txtTotal));
        txtKembalian = (TextView) findViewById((R.id.txtKembalian));
        txtBonus = (TextView) findViewById((R.id.txtBonus));
        txtKeterangan = (TextView) findViewById((R.id.txtKeterangan));

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nmPembeli = edtnmPembeli.getText().toString().trim();
                String nmBrg = edtnmBrg.getText().toString().trim();
                String jmlBrg = edtjmlBrg.getText().toString().trim();
                String harga = edtHarga.getText().toString().trim();
                String bayar = edtBayar.getText().toString().trim();

                if (edtnmPembeli.getText().toString().length() == 0) {
                    edtnmPembeli.setError("Masukkan Nama Pembeli !");
                    edtnmPembeli.requestFocus();
                } else if (edtnmBrg.getText().toString().length() == 0) {
                    edtnmBrg.setError("Masukkan Nama Barang !");
                    edtnmBrg.requestFocus();
                } else if (edtjmlBrg.getText().toString().length() == 0) {
                    edtjmlBrg.setError("Masukkan Jumlah Barang !");
                    edtjmlBrg.requestFocus();
                } else if (edtHarga.getText().toString().length() == 0) {
                    edtHarga.setError("Masukkan Harga Barang !");
                    edtHarga.requestFocus();
                } else if (edtBayar.getText().toString().length() == 0) {
                    edtBayar.setError("Masukkan Uang Bayar !");
                    edtBayar.requestFocus();
                } else {
                    int jmlh = Integer.parseInt(jmlBrg);
                    int hrg = Integer.parseInt(harga);
                    int byr = Integer.parseInt(bayar);
                    int total = jmlh * hrg;
                    int kembali = byr - total;

                    if (byr < total){
                        edtBayar.setError("Nominal Uang Kurang !");
                        edtBayar.requestFocus();
                    } else {
                        txtnmPembeli.setText("Nama Pembeli: "+nmPembeli);
                        txtnmBrg.setText("Nama Barang: "+nmBrg);
                        txtjmlBrg.setText("Jumlah Barang: "+jmlBrg);
                        txtHarga.setText("Harga Barang: "+harga);
                        txtBayar.setText("Uang Bayar: "+bayar);
                        txtTotal.setText("Total Belanja: "+total);
                        txtKembalian.setText("Uang Kembalian: Rp."+kembali);
                        if (total <= 500000){
                            txtBonus.setText("Bonus: HardDisk 500GB");
                        } else {
                            txtBonus.setText("Bonus: HardDisk 1TB");
                        }
                        txtKeterangan.setText("Keterangan: Tunggu Kembalian");
                    }
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtnmPembeli.setText("");
                edtnmBrg.setText("");
                edtjmlBrg.setText("");
                edtHarga.setText("");
                edtBayar.setText("");
                txtnmPembeli.setText("");
                txtjmlBrg.setText("");
                txtnmBrg.setText("");
                txtHarga.setText("");
                txtBayar.setText("");
                txtTotal.setText("");
                txtKembalian.setText("");
                txtBonus.setText("");
                txtKeterangan.setText("");
                edtnmPembeli.requestFocus();
            }
        });

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}