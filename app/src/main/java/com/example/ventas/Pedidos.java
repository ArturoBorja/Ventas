package com.example.ventas;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Pedidos extends RealmObject {

    @PrimaryKey
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    private String fecha;

    private String total;

    private String nroguia;

    private String descuento;

    private String contado;

    private RealmList<Items> items;

    private String rowidcliente;

    public String getFecha ()
    {
        return fecha;
    }

    public void setFecha (String fecha)
    {
        this.fecha = fecha;
    }

    public Pedidos() {
        this.id = MyAplication.cod_pedido.incrementAndGet();
    }

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getNroguia ()
    {
        return nroguia;
    }

    public void setNroguia (String nroguia)
    {
        this.nroguia = nroguia;
    }

    public String getDescuento ()
    {
        return descuento;
    }

    public void setDescuento (String descuento)
    {
        this.descuento = descuento;
    }

    public String getContado ()
    {
        return contado;
    }

    public void setContado (String contado)
    {
        this.contado = contado;
    }

    public void setItems(RealmList<Items> items) {
        this.items = items;
    }

    public RealmList<Items> getItems() {
        return items;
    }

    public String getRowidcliente ()
    {
        return rowidcliente;
    }

    public void setRowidcliente (String rowidcliente)
    {
        this.rowidcliente = rowidcliente;
    }

    @Override
    public String toString()
    {
        return fecha +" - "+ total;
    }
}
