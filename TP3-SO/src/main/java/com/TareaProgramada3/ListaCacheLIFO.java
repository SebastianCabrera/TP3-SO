package com.TareaProgramada3;

import java.time.LocalDateTime;
/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCacheLIFO extends ListaCache{

    public ListaCacheLIFO()
    {

    }

    //Regresa la key asignada al objeto más nuevo en la lista
    public int lifo()
    {
        LocalDateTime time = null;
        int key = 0;
        if(!list.isEmpty())
        {
            for(int i = 0; i<tamano; i++)
            {
                if(i == 0) //Primera iteracion
                {
                    time = list.get(i).getAge();
                    key=list.get(i).getKey();
                }
                else
                {
                    if(list.get(i).getAge().isAfter(time))
                    {
                        time = list.get(i).getAge();
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

    public void put(Integer var1, ObjectC var2)
    {
        if (list.size() == tamano) //Si la lista esta llena
        {
            int keyVictim = lifo();
            for(int i=0; i<tamano; i++)
            {
                if(list.get(i).getKey() == keyVictim)
                {
                    var2.setKey(var1);
                    var2.setAge();
                    list.get(i).myTimer.cancel(); //Se cancela el Timer del objeto que se va a sacar de la lista
                    list.set(i, var2);
                    list.get(i).myTimer.schedule(new TTask(i, this.list), (long)tiempoVidaElemento); //El objeto se elimina de la lista si se cumple el tiempo de vida
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
                    list.get(i).myTimer.schedule(new TTask(i, this.list), (long)tiempoVidaElemento); //El objeto se elimina de la lista si se cumple el tiempo de vida
                }
            }
        }
        System.out.println("Se usó el put de ListaCacheLIFO.");
    }

}
