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
                    key=list.get(i).getKey();
                }
                else
                {
                    if(list.get(i).getEntryLifetime() > eLife) //Es un contador, por lo que se debe elegir el más grande
                    {
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

    }
}
