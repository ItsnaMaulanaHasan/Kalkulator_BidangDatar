package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends Fragment {
    private Button btnLuas, btnKeliling;
    private EditText txt_jari_jari;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.lingkaran, container, false);

        btnLuas = v.findViewById(R.id.btnLuas);
        btnKeliling = v.findViewById(R.id.btnKeliling);
        txt_jari_jari = v.findViewById(R.id.txt_jari_jari);
        hasil = v.findViewById(R.id.hasil);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = txt_jari_jari.getText().toString();
                if (nilai.isEmpty()){
                    txt_jari_jari.setError("Data tidak boleh kosong");
                    txt_jari_jari.requestFocus();
                }else{
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14*(jari*jari);
                    hasil.setText(String.format("%.2f", luas));
                }
            }
        });

        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = txt_jari_jari.getText().toString();
                if (nilai.isEmpty()){
                    txt_jari_jari.setError("Data tidak boleh kosong");
                    txt_jari_jari.requestFocus();
                }else{
                    Double jari = Double.parseDouble(nilai);
                    Double keliling = 2*3.14*jari;
                    hasil.setText(String.format("%.2f", keliling));
                }
            }
        });
        return v;
    }
}