package com.TareaProgramada3;

import java.time.LocalDateTime;
/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCacheFIFO extends ListaCache{

    public ListaCacheFIFO()
    {

    }

    //Regresa la key asignada al objeto más antiguo en la lista
    public int fifo()
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
                    if(list.get(i).getAge().isBefore(time))
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
            return -1; //Hacer algo despues para que recibir un numero negativo sea sinonimo de error
        }
    }


    public void put(Integer var1, ObjectC var2)
    {
        if (list.size() == tamano) //Si la lista esta llena
        {
            int keyVictim = fifo();
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
        System.out.println("Se usó el put de ListaCacheFIFO.");
    }

}
