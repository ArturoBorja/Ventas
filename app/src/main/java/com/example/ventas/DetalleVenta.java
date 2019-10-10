package com.example.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import io.realm.Realm;

public class DetalleVenta extends AppCompatActivity {
    TextView txt_detalle_nombre;
    TextView txt_detalle_fecha;
    TextView txt_detalle_total;
    ListView lv_detalle_detalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_venta);
        txt_detalle_nombre=findViewById(R.id.txt_detalle_nombre);
        txt_detalle_fecha=findViewById(R.id.txt_detalle_fecha);
        txt_detalle_total=findViewById(R.id.txt_detalle_total);
        lv_detalle_detalle=findViewById(R.id.lv_detalle_detalle);
        Intent i = getIntent();
        CargarDatos(i.getIntExtra("cod_pedidos",0));
    }
    void CargarDatos(int codigoPedidos){
        Realm realm = Realm.getDefaultInstance();
        Pedidos p =realm.where(Pedidos.class).equalTo("id",codigoPedidos).findFirst();
        Clientes c =realm.where(Clientes.class).equalTo("rowid",p.getRowidcliente()).findFirst();
        txt_detalle_nombre.setText(c.getNombres());
        txt_detalle_total.setText("S/. "+p.getTotal());
        txt_detalle_fecha.setText(p.getFecha());
        ArrayAdapter<Items> adapter = new ArrayAdapter<>(DetalleVenta.this,
                android.R.layout.simple_list_item_1, p.getItems());
        lv_detalle_detalle.setAdapter(adapter);
    }
}
