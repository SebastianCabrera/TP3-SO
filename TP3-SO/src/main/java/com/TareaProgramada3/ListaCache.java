package com.TareaProgramada3;
import java.lang.Runnable;
import java.lang.Thread;
import java.util.ArrayList;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCache implements Cache<Integer, ObjectC>{

    ArrayList<ObjectC> list;
    private String id;
    private int tiempoVidaElemento;
    private int tamano = 10;
    private int tiempoVidaCache;
    private final int tiempoVidaCache_DEFAULT = -1;
    private final int TIEMPO_DEFAULT = 3600; //Es decir, una hora de tiempoVidaCache como máximo para cada objeto en el cache
    private final int DEFAULT_ELEMENTO = 1; //Un segundo como default?


    public ListaCache(){}

    public ListaCache(String idParam, int tamanoParam, int tiempoVidaCacheParam)
    {
        id = idParam;
        tiempoVidaElemento = TIEMPO_DEFAULT;
        tamano = tamanoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, String idParam, int tiempoParam)
    {
        id = idParam;
        tiempoVidaCache = tiempoVidaCache_DEFAULT;
        tamano = tamanoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, String idParam)
    {
        id = idParam;
        tiempoVidaCache = tiempoVidaCache_DEFAULT;
        tiempoVidaElemento = TIEMPO_DEFAULT;
        tamano = tamanoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    //sin tiempoVidaElemento por elemento
    public ListaCache(int tamanoParam, int tiempoVidaCacheParam,int tiempoParam,String idParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCacheParam;
        tiempoVidaElemento = tiempoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache( int tamanoParam, int tiempoVidaCacheParam,String idParam)
    {
        id = idParam;
        tiempoVidaElemento = TIEMPO_DEFAULT;
        tamano = tamanoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public void destruirCache()
    {
        if(tiempoVidaCache!=tiempoVidaCache_DEFAULT)
        {}
        else
        {
            Thread limpiar = new Thread();
            limpiar.start();
        }
    }

    String buscarPorTitulo(String titulo)
    {

        return null;
    }

    String buscarPorID(String idParam)
    {
        return null;
    }

    void matarObjeto(int key)
    {

    }

    String buscarPorId(String idParam)
    {
        return null;

    }

    //Luego vendría la implementación de las funciones de "Cache"

    public String getName()
    {
        return id;
    }

    public ObjectC get(Integer var1)
    {
        ObjectC retornoC = new ObjectC();
        try
        {
            retornoC=list.get(var1);//posiblemente hay que convertir Integer a int pero no estoy seguro
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("El número que se utilizó no está en el rango permitido.");
        }
        return retornoC;
    }

    public void put(Integer llave, ObjectC objeto) //Cuando se ingrese un objeto, se deben actualizar su hora, minuto y segundo
    {
        System.out.println("Se usó el put de ListaCache.");
    }

    public void evict(Integer var1)
    {
        try
        {
            list.remove(var1);//posiblemente hay que convertir Integer a int pero no estoy seguro
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("El número que se utilizó no está en el rango permitido.");
        }
    }

    public void clear()
    {
        list.clear();
    }
}
