package com.example.p218_intent2_subsub;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity
    {
        EditText etName;
        intent in;
        Button next0;
        private Object intent;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        public void next0(View v) {
            Intent in = new Intent(this, Flagment11.class);

            //戻った時に値を受信するメソッド
            //第2引数にはリクエストコード（任意の整数）、受信した時に識別するため
            startActivityForResult((Intent) intent,0);
        }





    }
