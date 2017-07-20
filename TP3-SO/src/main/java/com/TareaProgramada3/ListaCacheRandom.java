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

        if (list.size() == tamano) //Si la lista esta llena
        {
            int keyVictim = random();
            for(int i=0; i<tamano; i++)
            {
                if(list.get(i).getKey() == keyVictim)
                {
                    var2.setKey(var1);
                    var2.setAge();
                    var2.myTimer.cancel();
                    var2.myTimer.schedule(task, tiempoVidaElemento); //Se eapera el tiempo del vida del elemento para eliminarlo
                    list.set(i, var2);
                }
            }
        }
        else
        {
            var2.setKey(var1);
            var2.setAge();
            var2.myTimer.cancel();
            var2.myTimer.schedule(task, tiempoVidaElemento);
            list.add(var2);
        }
        System.out.println("Se usó el put de ListaCache.");
    }
}
