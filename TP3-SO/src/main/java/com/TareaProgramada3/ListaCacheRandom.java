package com.TareaProgramada3;

import java.util.Random;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCacheRandom extends ListaCache{

    public ListaCacheRandom()
    {

    }

    /// Esta función regresa la llave asignada a un objeto al azar en la lista
    /// \return[out] int - Devuelve la llave del objeto seleccionado como victima
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

    /// Esta función guarda un objeto en la lista, y si la lista está llena saca a un objeto de esta
    /// \param[in] var1 - La llave que se va a asignar al objeto que se vaya a introducir en la lista
    /// \param[in] var2 - El objeto que se va a introducir en la lista
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
                    list.get(i).myTimer.cancel(); //Se cancela el Timer del objeto que se va a sacar de la lista
                    list.set(i, var2);
                    list.get(i).myTimer.schedule(new TTask(i, this), (long)tiempoVidaElemento); //El objeto se elimina de la lista si se cumple el tiempo de vida
                }
            }
        }
        else
        {
            var2.setKey(var1);
            var2.setAge();
            list.add(var2);
            for(int i=0; i<tamano; i++)
            {
                if(list.get(i) == var2)
                {
                    list.get(i).myTimer.schedule(new TTask(i, this), (long)tiempoVidaElemento); //El objeto se elimina de la lista si se cumple el tiempo de vida
                }
            }
        }
        System.out.println("Se usó el put de ListaCache.");
    }
}
