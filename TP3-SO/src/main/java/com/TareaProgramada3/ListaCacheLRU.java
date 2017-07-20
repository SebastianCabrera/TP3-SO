package com.TareaProgramada3;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ListaCacheLRU extends ListaCache{

    public ListaCacheLRU()
    {

    }

    //Regresa la key asignada al objeto que lleva mas tiempo sin ser referenciado en la lista
    public int lru()
    {
        int eLife = 0;
        int key = 0;
        if(!list.isEmpty())
        {
            for(int i = 0; i<tamano; i++)
            {
                if(i == 0) //Primera iteracion
                {
                    //Falta investigar sobre uso de Timer
                    key=list.get(i).getKey();
                }
                else
                {
                    if(true) //Es un contador, por lo que se debería elegir el más grande
                    {
                        //Falta investigar sobre uso de Timer
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
            int keyVictim = lru();
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
