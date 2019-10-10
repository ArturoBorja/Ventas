package com.example.ventas;

import io.realm.RealmObject;

public class Clientes extends RealmObject {
    private String apellidos;

    private String latitud;

    private String longitud;

    private String estado;

    private String razsocial;

    private String direccion;

    private String fono;

    private String id;

    private String rowid;

    private String nombres;

    public String getApellidos ()
    {
        return apellidos;
    }

    public void setApellidos (String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getLatitud ()
    {
        return latitud;
    }

    public void setLatitud (String latitud)
    {
        this.latitud = latitud;
    }

    public String getLongitud ()
    {
        return longitud;
    }

    public void setLongitud (String longitud)
    {
        this.longitud = longitud;
    }

    public String getEstado ()
    {
        return estado;
    }

    public void setEstado (String estado)
    {
        this.estado = estado;
    }

    public String getRazsocial ()
    {
        return razsocial;
    }

    public void setRazsocial (String razsocial)
    {
        this.razsocial = razsocial;
    }

    public String getDireccion ()
    {
        return direccion;
    }

    public void setDireccion (String direccion)
    {
        this.direccion = direccion;
    }

    public String getFono ()
    {
        return fono;
    }

    public void setFono (String fono)
    {
        this.fono = fono;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getRowid ()
    {
        return rowid;
    }

    public void setRowid (String rowid)
    {
        this.rowid = rowid;
    }

    public String getNombres ()
    {
        return nombres;
    }

    public void setNombres (String nombres)
    {
        this.nombres = nombres;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [apellidos = "+apellidos+", latitud = "+latitud+", longitud = "+longitud+", estado = "+estado+", razsocial = "+razsocial+", direccion = "+direccion+", fono = "+fono+", id = "+id+", rowid = "+rowid+", nombres = "+nombres+"]";
    }
}
