package com.TareaProgramada3;

import java.util.ArrayList;

/**
 * Created by Sebastián on 19/7/2017.
 */
public abstract class ListaCache implements Cache{

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

    public ObjectC get(int var1) //Supongo que aquí sería cambiar V por object y K por int, verdad?
    {
        return null;

    }

    public void put(int var1, ObjectC var2)
    {

    }

    public void evict(int var1)
    {

    }
    public void clear()
    {
    }
}
