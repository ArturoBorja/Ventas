package com.example.ventas;

import android.app.Application;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyAplication extends Application {
    public static AtomicInteger cod_venta;
    public static AtomicInteger cod_cliente;
    public static AtomicInteger cod_pedido;
    public static AtomicInteger cod_item;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration
                .Builder().deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(configuration);
        Realm realm = Realm.getDefaultInstance();
        cod_venta = ObtenerId(realm,Venta.class);
        cod_cliente = ObtenerId(realm, Clientes.class);
        cod_pedido = ObtenerId(realm, Pedidos.class);
        cod_item=ObtenerId(realm,Items.class);
        realm.close();

    }

    <T extends RealmObject> AtomicInteger ObtenerId(Realm realm, Class<T> object){
        RealmResults<T> resultados = realm.where(object).findAll();
        if(resultados.size() >0){
            return new AtomicInteger(resultados.max("id").intValue());
        }else{
            return new AtomicInteger();
        }

    }
}
