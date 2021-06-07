    package com.juan.villanosretrofil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDatos(this);

    }

        private void getDatos(Context context) {
        /*
        Retrofit retrofit = new ApiAdapter().getDatosServidor();
        ApiService service = retrofit.create(ApiService.class);

        Call.<RespuestaServisdor> call = service.getDatos();

        call.enqueue(new Call.Callback<RespuestaServisdor>()

*/
        }

    }