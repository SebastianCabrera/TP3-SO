package com.TareaProgramada3;

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
        int hour = 0;
        int minute = 0;
        int second = 0;
        int key = 0;
        if(!list.isEmpty())
        {
            for(int i = 0; i<tamano; i++)
            {
                if(i == 0) //Primera iteracion
                {
                    hour=list.get(i).getHour();
                    minute=list.get(i).getMinute();
                    second=list.get(i).getSecond();
                    key=list.get(i).getKey();
                }
                else
                {
                    if(list.get(i).getHour() > hour) //Se elige el objeto con la hora mayor
                    {
                        hour=list.get(i).getHour();
                        minute=list.get(i).getMinute();
                        second=list.get(i).getSecond();
                        key=list.get(i).getKey();
                    }
                    else if(list.get(i).getHour() == hour) //Si tienen la misma hora se revisan los minutos
                    {
                        if(list.get(i).getMinute() > minute) //Se elige el objeto con el minuto mayor
                        {
                            minute=list.get(i).getMinute();
                            second=list.get(i).getSecond();
                            key=list.get(i).getKey();
                        }
                        else if(list.get(i).getMinute() == minute) //Si tienen el mismo minuto se revisan los segundos
                        {
                            if(list.get(i).getSecond() > second) //Se elige el objeto con el segundo mayor
                            {
                                second=list.get(i).getSecond();
                                key=list.get(i).getKey();
                            }
                        }
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
