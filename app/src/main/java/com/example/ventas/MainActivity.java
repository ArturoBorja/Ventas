package com.example.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv_main_ventas);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://172.23.8.161/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        ServicioVentas servicioVentas = retrofit.create(ServicioVentas.class);
        Call<Venta> llamada = servicioVentas.obtenerVentaDia();
        llamada.enqueue(new Callback<Venta>() {
            @Override
            public void onResponse(Call<Venta> call, Response<Venta> response) {
                switch (response.code()){
                    case 200:
                        Realm realm = Realm.getDefaultInstance();
                        realm.beginTransaction();

                        realm.commitTransaction();
                        AdaptadorVentas adapter =
                                new AdaptadorVentas(MainActivity.this,
                                        R.layout.pedido_item,response.body().getPedidos(),
                                        response.body().getClientes());
                        listView.setAdapter(adapter);
                        break;
                    default:
                         Log.e("Error","Error");
                         break;
                }

            }

            @Override
            public void onFailure(Call<Venta> call, Throwable t) {

            }
        });

    }
}
