package com.example.ventas;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Items extends RealmObject{
    @PrimaryKey
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    private String total;

    private String cantidad;

    private String idproducto;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getCantidad ()
    {
        return cantidad;
    }

    public void setCantidad (String cantidad)
    {
        this.cantidad = cantidad;
    }

    public String getIdproducto ()
    {
        return idproducto;
    }

    public void setIdproducto (String idproducto)
    {
        this.idproducto = idproducto;
    }

    public Items() {
        this.id = MyAplication.cod_item.incrementAndGet();
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", cantidad = "+cantidad+", idproducto = "+idproducto+"]";
    }
}