package com.TareaProgramada3;
import java.lang.Runnable;
import java.lang.Thread;

/**
 * Created by sebastian on 19/7/2017.
 */
public class Concurrencia implements Runnable
{
    int metodo = -1;
    int tiempo = 0;
    ListaCache cache;
    /*
    Contructor de la clase concurrencia esta clase es para realizar todos los metodos que necesiten crear un hilo, el parametro metodo es el que define
    * cual se va a usar
    * */
    Concurrencia(int tipo, ListaCache nuevaListaCache)
    {
        metodo = tipo;
        cache = new ListaCache();
        cache = nuevaListaCache;
    }

    Concurrencia(int tipo, int tiempoParametro, ListaCache nuevaListaCache)
    {
        tiempo = tiempoParametro;
        metodo = tipo;
        cache = new ListaCache();
        cache = nuevaListaCache;
    }
/*
* metodo que se ejecuta con el hilo
* */
    public void run()
    {
        switch(metodo)
        {
            case 0:
                //destruye el cache
                try{
                    Thread.sleep(tiempo);
                    cache.clear();
                }
                catch(InterruptedException interrupcion)
                {}
                cache.clear();
                break;
            case 1:
                break;
            case 2:
                break;
        }

    }


}
