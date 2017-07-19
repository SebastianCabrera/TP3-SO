package com.TareaProgramada3;

import java.util.ArrayList;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCache implements Cache<Integer, ObjectC>{

    ArrayList<ObjectC> list;
    String nombreLista;
    int tiempoObjeto;
    int tiempoCache;


    public ListaCache(String nombreLista)
    {

    }


    public ListaCache()
    {

    }

    void destruirCache()
    {

    }

    void matarObjeto(int key)
    {

    }

    String buscarPorTitulo(String titulo)
    {
        return null;

    }

    String buscarPorId(String id)
    {
        return null;

    }

    //Luego vendría la implementación de las funciones de "Cache"

    public String getName()
    {
        return null;
    }

    public ObjectC get(Integer var1) //Supongo que aquí sería cambiar V por object y K por int, verdad?
    {
        return null;

    }

    public void put(Integer var1, ObjectC var2)
    {

    }

    public void evict(Integer var1)
    {

    }

    public void clear()
    {
        System.out.println("Se usó el clear de ListaCache.");
    }
}
