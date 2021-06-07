    package com.juan.villanosretrofil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
  RecyclerView recyclerView;
  VillanosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView = findViewById(R.id.recycle);
         getDatos(this);


    }

    private void getDatos(Context context){
        
    }

    }