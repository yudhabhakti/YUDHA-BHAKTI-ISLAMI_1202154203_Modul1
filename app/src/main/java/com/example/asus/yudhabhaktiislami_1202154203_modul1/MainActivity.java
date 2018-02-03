package com.example.asus.yudhabhaktiislami_1202154203_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditMenu;
    private EditText Porsi;
    private Button Eatbus;
    private Button Abnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditMenu = findViewById(R.id.Pesan);
        Porsi = findViewById(R.id.Porsi);
        Eatbus = findViewById(R.id.btn_eatbus);
        Abnormal = findViewById(R.id.btn_abnormal);


    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String Makanan = EditMenu.getText().toString();
        String jumlahporsi = Porsi.getText().toString();
        String RM = Eatbus.getText().toString();


        intent.putExtra("Makanan", Makanan);
        intent.putExtra("jumlahporsi", jumlahporsi);
        intent.putExtra("RM", RM);

        startActivity(intent);
    }

    public void Abnormal(View view) {

        Intent intent = new Intent(this, Main2Activity.class);

        String Makanan = EditMenu.getText().toString();
        String jumlahporsi = Porsi.getText().toString();
        String RM = Abnormal.getText().toString();


        intent.putExtra("Makanan", Makanan);
        intent.putExtra("jumlahporsi", jumlahporsi);
        intent.putExtra("RM", RM);

        startActivity(intent);
    }
}