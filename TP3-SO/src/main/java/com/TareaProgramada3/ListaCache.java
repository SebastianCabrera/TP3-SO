package com.TareaProgramada3;
import java.lang.Runnable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCache implements Cache<Integer, ObjectC> {

    //Lista que se va a usar como cache
    ArrayList<ObjectC> list;
    //Nombre que se le va a asignar al cache
    public String id;
    //Tamaño del cache
    public int tamano = 10;
    //Tiempo que pasa entre cada ejecución de la función "clear"
    public int tiempoVidaCache;
    //Tiempo maximo que un objeto puede estar en el cache sin ser accesado
    public int tiempoVidaElemento;
    //Semaforo para evitar problemas de sincronización con respecto al "entry lifetime"
    public Semaphore sync;
    //Default del tiempo de vida del contenido total del cache
    public final int tiempoVidaCache_DEFAULT = -1; //Infinito
    //Default del tiempo de vida de cada elemento sin ser accesado en el cache
    public final int tiempoVidaElemento_DEFAULT = 3600; //Es decir, una hora de tiempoVidaElemento como máximo para cada objeto en el cache


    //Se presentan 4 constructores, considerando que los unicos dos valores obligatorios son "id" y "tamano"

    public ListaCache(){}

    public ListaCache(String idParam, int tamanoParam, int tiempoVidaCacheParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCacheParam;
        tiempoVidaElemento = tiempoVidaElemento_DEFAULT;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
        sync = new Semaphore(1);
    }

    public ListaCache(int tamanoParam, String idParam, int tiempoVidaElemParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCache_DEFAULT;
        tiempoVidaElemento = tiempoVidaElemParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
        sync = new Semaphore(1);
    }

    public ListaCache(int tamanoParam, String idParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCache_DEFAULT;
        tiempoVidaElemento = tiempoVidaElemento_DEFAULT;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
        sync = new Semaphore(1);
    }

    public ListaCache(int tamanoParam, int tiempoVidaCacheParam,int tiempoVidaElemParam,String idParam)
    {
        id = idParam;
        tamano = tamanoParam;
        tiempoVidaCache = tiempoVidaCacheParam;
        tiempoVidaElemento = tiempoVidaElemParam;
        list = new ArrayList<ObjectC>(tamano);
        this.destruirCache();
        sync = new Semaphore(1);
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

    String buscarPorTitulo(String titulo)  //Esta y la de id no deberia implementarse en el proyecto de pruebas?
    {

        return null; //Al final de estas dos funciones se debe volver a guardar la hora en el eLifeTime del objeto
    }

    String buscarPorID(String idParam)
    {
        return null;
    }

    void matarObjeto(int key)
    {

    }


    //Las siguientes son las implementaciones de las funciones de "Cache"

    /// Esta función consigue el nombre (id) del cache
    /// \return[out] String - Devuelve el nombre del cache
    public String getName()
    {
        return id;
    }

    /// Esta función consigue el objeto en el cache con la llave especificada, si se encuentra
    /// \param[in] var1 - La llave que se va a usar para buscar al objeto en la lista
    /// \return[out] ObjectC - Devuelve el objeto encontrado en la lista
    public ObjectC get(Integer var1)
    {
        try
        {
            sync.acquire();
        }
        catch(InterruptedException e){} //No sé si esto daría problemas
        ObjectC retornoC = new ObjectC();
        retornoC = null;
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
        sync.release();
        return retornoC;
    }

    //esta función no se debería ejecutar por como funciona la herencia, se escribió un mensaje para detectar el error
    public void put(Integer llave, ObjectC objeto)
    {
        System.out.println("Se usó el put de ListaCache.");
    }

    /// Esta función elimina el objeto del cache con la llave especificada
    /// \param[in] var1 - La llave que se va a usar para buscar al objeto en la lista
    public void evict(Integer var1)
    {
        try
        {
            sync.acquire();
        }
        catch(InterruptedException e){}
        try
        {
            for(int contador =0; contador <list.size();contador++)
            {
                if(list.get(contador).getKey()==var1)
                {
                    list.get(contador).myTimer.cancel(); //Se cancela su contador
                    list.remove(contador);//posiblemente hay que convertir Integer a int pero no estoy seguro
                }
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("El número que se utilizó no está en el rango permitido.");
        }
        sync.release();
    }

    /// Esta función saca todos los objetos que se encuentren actualmente en el cache
    public void clear()
    {
        for(int i=0; i<list.size(); i++)
        {
            list.get(i).myTimer.cancel(); //Se cancela el Timer de todos los objetos
        }
        list.clear();
    }

}
