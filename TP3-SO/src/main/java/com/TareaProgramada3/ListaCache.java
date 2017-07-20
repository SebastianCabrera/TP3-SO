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
    private int tiempo;
    private int tamano = 10;
    private int vida;
    private int tiempoElemento;
    private final int VIDA_DEFAULT = -1;
    private final int TIEMPO_DEFAULT = 3600; //Es decir, una hora de vida como máximo para cada objeto en el cache
    private final int DEFAULT_ELEMENTO = 1; //Un segundo como default?


    public ListaCache(){}

    public ListaCache(String idParam, int tamanoParam, int vidaParam, int elementoParam)
    {
        id = idParam;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;
        tiempoElemento = elementoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, String idParam, int tiempoParam, int elementoParam )
    {
        id = idParam;
        vida = VIDA_DEFAULT;
        tamano = tamanoParam;
        tiempoElemento = elementoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, String idParam, int elementoParam)
    {
        id = idParam;
        vida = VIDA_DEFAULT;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;
        tiempoElemento = elementoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    //sin tiempo por elemento
    public ListaCache(int tamanoParam, int vidaParam,int tiempoParam,String idParam)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        id = idParam;
        tamano = tamanoParam;
        vida = vidaParam;
        tiempo = tiempoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(String idParam, int tamanoParam, int vidaParam)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        id = idParam;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, int tiempoParam,  String idParam)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        id = idParam;
        vida = VIDA_DEFAULT;
        tamano = tamanoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }

    public ListaCache(int tamanoParam, String idParam)
    {
        tiempoElemento = DEFAULT_ELEMENTO;
        id = idParam;
        vida = VIDA_DEFAULT;
        tiempo = TIEMPO_DEFAULT;
        tamano = tamanoParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
    }


    public void destruirCache()
    {
        if(vida!=VIDA_DEFAULT)
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
