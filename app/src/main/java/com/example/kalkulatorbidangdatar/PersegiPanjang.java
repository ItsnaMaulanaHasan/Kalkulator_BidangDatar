package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends Fragment {

    private Button btnLuas, btnkeliling;
    private EditText txt_panjang, txt_lebar;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.persegi_panjang, container, false);
        btnLuas = v.findViewById(R.id.btnLuas);
        btnkeliling = v.findViewById(R.id.btnKeliling);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        hasil = v.findViewById(R.id.hasil);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                if(nilai1.isEmpty()){
                    txt_panjang.setError("Data tidak boleh kosong");
                    txt_panjang.requestFocus();
                }else if(nilai2.isEmpty()){
                    txt_lebar.setError("Data tidak boleh kosong");
                    txt_lebar.requestFocus();
                }else {
                    Double panjang = Double.parseDouble(nilai1);
                    Double lebar = Double.parseDouble(nilai2);

                    Double luas = panjang*lebar;
                    hasil.setText(String.format("%.2f", luas));
                }
            }
        });

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                if(nilai1.isEmpty()){
                    txt_panjang.setError("Data tidak boleh kosong");
                    txt_panjang.requestFocus();
                }else if(nilai2.isEmpty()){
                    txt_lebar.setError("Data tidak boleh kosong");
                    txt_lebar.requestFocus();
                }else {
                    Double panjang = Double.parseDouble(nilai1);
                    Double lebar = Double.parseDouble(nilai2);

                    Double keliling = 2*(panjang+lebar);
                    hasil.setText(String.format("%.2f", keliling));
                }
            }
        });

        return v;
    }
}