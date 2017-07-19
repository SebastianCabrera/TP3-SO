package com.TareaProgramada3;

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
        int hour = 0;
        int minute = 0;
        int second = 0;
        int key = 0;
        if(!list.isEmpty())
        {
            for(int i = 0; i<list.size(); i++)
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
                    if(list.get(i).getHour() < hour) //Se elige la hora menor
                    {
                        hour=list.get(i).getHour();
                        minute=list.get(i).getMinute();
                        second=list.get(i).getSecond();
                        key=list.get(i).getKey();
                    }
                    else if(list.get(i).getHour() == hour) //Si tienen la misma hora se revisan los minutos
                    {
                        if(list.get(i).getMinute() < minute) //Se elige el minuto menor
                        {
                            minute=list.get(i).getMinute();
                            second=list.get(i).getSecond();
                            key=list.get(i).getKey();
                        }
                        else if(list.get(i).getMinute() == minute) //Si tienen el mismo minuto se revisan los segundos
                        {
                            if(list.get(i).getSecond() < second)
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
            return -1; //Hacer algo despues para que recibir un numero negativo sea sinonimo de error
        }
    }


    public void put(Integer var1, ObjectC var2)
    {

    }

}
