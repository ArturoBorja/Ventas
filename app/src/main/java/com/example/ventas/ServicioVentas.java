package com.example.ventas;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioVentas {
    @GET("ventas.json")
    Call<Venta>obtenerVentaDia();
}
