package com.TareaProgramada3;

import java.time.LocalDateTime;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCacheLRU extends ListaCache{

    public ListaCacheLRU()
    {

    }

    /// Esta función regresa la llave asignada al objeto que lleva mas tiempo sin ser referenciado en la lista
    /// \return[out] int - Devuelve la llave del objeto seleccionado como victima
    public int lru()
    {
        LocalDateTime eLifeTime = null;
        int key = 0;
        if(!list.isEmpty())
        {
            for(int i = 0; i<tamano; i++)
            {
                if(i == 0) //Primera iteracion
                {
                    eLifeTime = list.get(i).geteLifeTime();
                    key=list.get(i).getKey();
                }
                else
                {
                    if(list.get(i).geteLifeTime().isBefore(eLifeTime)) //Se elige si lleva mas tiempo en la lista sin ser referenciado
                    {
                        eLifeTime = list.get(i).geteLifeTime();
                        key=list.get(i).getKey();
                    }
                }
            }
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
            int keyVictim = lru();
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
