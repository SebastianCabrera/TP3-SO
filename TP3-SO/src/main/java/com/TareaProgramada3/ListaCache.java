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
    public int tamano = 10;
    private int tiempoVidaCache;
    private int tiempoVidaElemento;
    private final int tiempoVidaCache_DEFAULT = -1; //Infinito
    private final int tiempoVidaElemento_DEFAULT = 3600; //Es decir, una hora de tiempoVidaElemento como máximo para cada objeto en el cache

    public ListaCache(){}

    public ListaCache(String idParam, int tamanoParam, int tiempoVidaCacheParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCacheParam;
        tiempoVidaElemento = tiempoVidaElemento_DEFAULT;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, String idParam, int tiempoVidaElemParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCache_DEFAULT;
        tiempoVidaElemento = tiempoVidaElemParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, String idParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCache_DEFAULT;
        tiempoVidaElemento = tiempoVidaElemento_DEFAULT;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, int tiempoVidaCacheParam,int tiempoVidaElemParam,String idParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCacheParam;
        tiempoVidaElemento = tiempoVidaElemParam;
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
            for(int contador =0; contador <list.size();contador++)
            {
                if(list.get(contador).getKey()==var1)
                {
                    retornoC = list.get(contador);//posiblemente hay que convertir Integer a int pero no estoy seguro
                }
            }
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
            for(int contador =0; contador <list.size();contador++)
            {
                if(list.get(contador).getKey()==var1)
                {
                    list.remove(contador);//posiblemente hay que convertir Integer a int pero no estoy seguro
                }
            }
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
