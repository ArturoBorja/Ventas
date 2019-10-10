package com.example.ventas;

import io.realm.RealmObject;

public class Items extends RealmObject
{
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

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", cantidad = "+cantidad+", idproducto = "+idproducto+"]";
    }
}