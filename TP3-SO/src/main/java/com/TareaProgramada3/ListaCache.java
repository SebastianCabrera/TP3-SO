package com.TareaProgramada3;

import java.util.ArrayList;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCache implements Cache<Integer, ObjectC>{

    ArrayList<ObjectC> list;
    private String tipo;
    private int tiempo;
    private int tamano;
    private int vida;
    private int tiempoElemento;
    private final int VIDA_DEFAULT = -1;
    private final int TIEMPO_DEFAULT = 3600;
    private final int DEFAULT_ELEMENTO = 1;


    public ListaCache(){}

    public ListaCache(String id, int tamanoParam, int vidaParam, int elementoParam)
    {
        tipo = id;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;

        tiempoElemento = elementoParam;
    }

    public ListaCache(int tamanoParam, String id, int tiempoParam, int elementoParam )
    {
        tipo = id;
        vida = VIDA_DEFAULT;
        tamano = tamanoParam;


        tiempoElemento = elementoParam;
    }

    public ListaCache(int tamanoParam, String id, int elementoParam)
    {
        tipo = id;
        vida = VIDA_DEFAULT;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;

        tiempoElemento = elementoParam;
    }

    //sin tiempo por elemento
    public ListaCache(int tamanoParam, int vidaParam,int tiempoParam,String id)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        tipo = id;
        tamano = tamanoParam;
        vida = vidaParam;
        tiempo = tiempoParam;
    }

    public ListaCache(String id, int tamanoParam, int vidaParam)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        tipo = id;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;
    }

    public ListaCache(int tamanoParam, int tiempoParam,  String id)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        tipo = id;
        vida = VIDA_DEFAULT;
        tamano = tamanoParam;
    }

    public ListaCache(int tamanoParam, String id)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        tipo = id;
        vida = VIDA_DEFAULT;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;
    }


    public void destruirCache()
    {}

    String buscarPorTitulo(String titulo)
    {
        return null;
    }

    String buscarPorID(String id)
    {
        return null;
    }

    void matarObjeto(int key)
    {

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

    public ObjectC get(Integer var1)
    {
        return null;

    }

    public void put(Integer var1, ObjectC var2) //Cuando se ingrese un objeto, se deben actualizar su hora, minuto y segundo
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
