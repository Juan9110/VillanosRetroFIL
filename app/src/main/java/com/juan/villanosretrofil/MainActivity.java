    package com.juan.villanosretrofil;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

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
        Retrofit retrofit = new ApiAdapter().getDatosServidor();
        ApiService service = retrofit.create(ApiService.class);

        Call<RespuestaServisdor> call = service.getDatos();
        call.enqueue(new Callback<RespuestaServisdor>() {
            @Override
            public void onResponse(Call<RespuestaServisdor> call, Response<RespuestaServisdor> response) {
                if (response.body() == null){
                    //el servidor no responde
                }else {
                    if(response.body().getEstado() == 1){

                        Datos.setListaVillanos(response.body().getListaVillanos());
                        mostrarRecycler(context);

                    }else {
                        Toast.makeText(MainActivity.this, "Fallo en el servidor", Toast.LENGTH_SHORT).show();

                    }
                }
            }

            @Override
            public void onFailure(Call<RespuestaServisdor> call, Throwable t) {
                System.out.println(t.toString());
                Toast.makeText(MainActivity.this,"Comprueba tu dirreccion",Toast.LENGTH_SHORT).show();


                   }
              });
           }
           public void mostrarRecycler(Context context){
                adapter = new VillanosAdapter(Datos.getListaVillanos(), context);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

           }

       }