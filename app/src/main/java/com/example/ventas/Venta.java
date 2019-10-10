package com.example.ventas;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Venta extends RealmObject{
    private String idzona;
    private String idvend;
    private RealmList<Pedidos> pedidos;
    private RealmList <Clientes> clientes;
    public Venta() {
    }
    public String getIdzona ()
    {
        return idzona;
    }
    public void setIdzona (String idzona)
    {
        this.idzona = idzona;
    }
    public String getIdvend ()
    {
        return idvend;
    }
    public void setIdvend (String idvend)
    {
        this.idvend = idvend;
    }
    public void setPedidos(RealmList<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    public void setClientes(RealmList<Clientes> clientes) {
        this.clientes = clientes;
    }
    public RealmList<Pedidos> getPedidos() {
        return pedidos;
    }
    public RealmList<Clientes> getClientes() {
        return clientes;
    }
    @Override
    public String toString()
    {
        return "ClassPojo [idzona = "+idzona+", idvend = "+idvend+", pedidos = "+pedidos+", clientes = "+clientes+"]";
    }
}


