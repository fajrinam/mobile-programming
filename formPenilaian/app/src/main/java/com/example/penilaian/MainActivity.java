package com.example.penilaian;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNama, edtQuiz1, edtQuiz2, edtEts, edtEas;
    private Button btnProses, btnHapus, btnKeluar;
    private TextView txtMahasiswa, txtquiz1, txtquiz2, txtets, txteas, txtjumlahnilai, txtrataratanilai, txtabjadnilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.etNamaMahasiswa);
        edtQuiz1 = (EditText) findViewById(R.id.etquiz1);
        edtQuiz2 = (EditText) findViewById(R.id.etquiz2);
        edtEts = (EditText) findViewById(R.id.etets);
        edtEas = (EditText) findViewById(R.id.eteas);
        btnProses = (Button) findViewById(R.id.btnProses);
        btnHapus = (Button) findViewById(R.id.btnHapus);
        btnKeluar = (Button) findViewById(R.id.btnKeluar);
        txtMahasiswa = (TextView) findViewById(R.id.tvNamaMahasiswa);
        txtquiz1 = (TextView) findViewById(R.id.tvNilaiquiz1);
        txtquiz2 = (TextView) findViewById(R.id.tvNilaiquiz2);
        txtets = (TextView) findViewById(R.id.tvNilaiets);
        txteas = (TextView) findViewById(R.id.tvNilaieas);
        txtjumlahnilai = (TextView) findViewById(R.id.jumlahnilai);
        txtrataratanilai = (TextView) findViewById(R.id.rataratanilai);
        txtabjadnilai = (TextView) findViewById(R.id.abjadnilai);


        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String strquiz1 = edtQuiz1.getText().toString().trim();
                    String strquiz2 = edtQuiz2.getText().toString().trim();
                    String strets = edtEts.getText().toString().trim();
                    String streas = edtEas.getText().toString().trim();
                    String abjad = "";

                    int quiz1 = Integer.parseInt(strquiz1);
                    int quiz2 = Integer.parseInt(strquiz2);
                    int ets = Integer.parseInt(strets);
                    int eas = Integer.parseInt(streas);

                    int jumlah = quiz1+quiz2+ets+eas;
                    int ratarata = jumlah / 4;

                    if (ratarata >= 81) {
                        abjad = "A";
                    } else if (ratarata >= 61 && ratarata < 81) {
                        abjad = "B";
                    } else if (ratarata >= 41 && ratarata < 61) {
                        abjad = "C";
                    } else if (ratarata >= 21 && ratarata < 41) {
                        abjad = "D";
                    } else {
                        abjad = "E";
                    }

                    txtMahasiswa.setText("Nama Mahasiswa: " + edtNama.getText().toString());
                    txtquiz1.setText("Nilai Quiz 1: " + edtQuiz1.getText().toString());
                    txtquiz2.setText("Nilai Quiz 2: " + edtQuiz2.getText().toString());
                    txtets.setText("Nilai ETS: " + edtEts.getText().toString());
                    txteas.setText("Nilai EAS: " + edtEas.getText().toString());
                    txtjumlahnilai.setText("Jumlah Nilai: " + jumlah);
                    txtrataratanilai.setText("Rata - Rata Nilai: " + ratarata);
                    txtabjadnilai.setText("Nilai Huruf: " + abjad);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNama.setText("");
                edtQuiz1.setText("");
                edtQuiz2.setText("");
                edtEts.setText("");
                edtEas.setText("");
                txtMahasiswa.setText("");
                txtquiz1.setText("");
                txtquiz2.setText("");
                txtets.setText("");
                txteas.setText("");
                txtjumlahnilai.setText("");
                txtrataratanilai.setText("");
                txtabjadnilai.setText("");
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