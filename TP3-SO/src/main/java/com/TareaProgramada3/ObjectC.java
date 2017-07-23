package com.TareaProgramada3;

import java.time.LocalDateTime;
import java.util.Timer;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ObjectC <V>{

    //La hora en la que se guarda el objeto en el cache
    LocalDateTime now;
    //La hora en la que se guarda el objeto en el cache (se vuelve a poner si el objeto es referenciado)
    LocalDateTime eLifeTime;
    //El objeto en sí
    private V value= null;
    //La llave asignada a este objeto
    private int key=0;
    //Timer utilizado para medir el "entry lifetime" del objeto
    public Timer myTimer = new Timer(true);

    public ObjectC()
    {}

    public void seteLifeTime() { eLifeTime = LocalDateTime.now(); } //Que se guarde la hora también cada vez que es referenciado

    public LocalDateTime geteLifeTime()
    {
        return eLifeTime;
    }

    public void setAge()
    {
        now = LocalDateTime.now();
    }

    public LocalDateTime getAge()
    {
        return now;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

}
