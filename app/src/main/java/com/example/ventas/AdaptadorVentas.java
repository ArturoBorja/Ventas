package com.example.ventas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdaptadorVentas extends BaseAdapter {
    Context context;
    int layout;
    List <Pedidos> pedidos;
    List <Clientes> clientes;

    public AdaptadorVentas(Context context, int layout, List<Pedidos> pedidos, List<Clientes> clientes) {
        this.context = context;
        this.layout = layout;
        this.pedidos = pedidos;
        this.clientes = clientes;
    }

    @Override
    public int getCount() {        return pedidos.size(); }
    @Override
    public Object getItem(int i) {        return pedidos.get(i);    }
    @Override
    public long getItemId(int i) {        return i;    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(layout,null);
        TextView nombre = view.findViewById(R.id.txt_item_nombre);
        TextView fecha = view.findViewById(R.id.txt_item_fecha);
        TextView total = view.findViewById(R.id.txt_item_total);
        nombre.setText(clientes.get(i).getNombres());
        fecha.setText(pedidos.get(i).getFecha());
        total.setText("S/. "+ pedidos.get(i).getTotal());
        return view;
    }
}
