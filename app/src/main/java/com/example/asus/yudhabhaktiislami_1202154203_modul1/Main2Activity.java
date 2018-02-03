package com.example.asus.yudhabhaktiislami_1202154203_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String Makanan = intent.getStringExtra("Makanan");
        String jumlahporsi = intent.getStringExtra("jumlahporsi");
        String Rm = intent.getStringExtra("RM");
        TextView textmakanan = findViewById(R.id.NamaMakanan);
        TextView Porsi = findViewById(R.id.Jumlah);
        TextView Beatbos = findViewById(R.id.RmhMakan);
        TextView Hitung = findViewById(R.id.Jumlah2);
        int X = Integer.parseInt(jumlahporsi);

        int HargaEatbus = 50000 * X;
        String A = String.valueOf(HargaEatbus);

        int Y = Integer.parseInt(jumlahporsi);
        int HargaAbnormal = 30000 * Y;
        String B = String.valueOf(HargaAbnormal);


        if (Rm.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Beatbos.setText(Rm);
                Hitung.setText(A);
                Toast.makeText(this, "Sepurane lur, jangan disini makan malamnya , uangmu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Beatbos.setText(Rm);
                Hitung.setText(A);
                Toast.makeText(this, "Mantab lur, disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Beatbos.setText(Rm);
                Hitung.setText(B);
                Toast.makeText(this, "Sepurane lur, jangan disini makan malamnya , uangmu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Beatbos.setText(Rm);
                Hitung.setText(B);
                Toast.makeText(this, "Mantab lur, disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }
        }

    }

}