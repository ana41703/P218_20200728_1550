package com.example.p218_intent2_subsub;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class Flagment12 extends AppCompatActivity {
    public void next_1(View v){
        finish();
    }
    public void next_2(View v) {
        Intent in = new Intent(this,Flagment13.class);
        startActivity(in);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.flagment12_main, container, false);
    }
}