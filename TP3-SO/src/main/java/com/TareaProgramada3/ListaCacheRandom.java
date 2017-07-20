package com.TareaProgramada3;

import java.util.Random;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCacheRandom extends ListaCache{

    public ListaCacheRandom()
    {

    }

    //Regresa la key asignada de un objeto al azar en la lista
    public int random()
    {
        int key = 0;
        int max = tamano;
        int randomNumber = 0;
        if(!list.isEmpty())
        {
            Random rand = new Random();
            randomNumber = rand.nextInt((max - 0) + 1);
            key=list.get(randomNumber).getKey();
            return key;
        }
        else
        {
            return -1;
        }
    }

    public void put(Integer var1, ObjectC var2)
    {

    }
}
