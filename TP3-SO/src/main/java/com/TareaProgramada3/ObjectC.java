package com.TareaProgramada3;

import java.time.LocalDateTime;
import java.util.Timer;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ObjectC {

    //La hora en la que se guarda el objeto en el cache
    LocalDateTime now;
    //La hora en la que se guarda el objeto en el cache (se vuelve a poner si el objeto es referenciado)
    LocalDateTime eLifeTime;
    //El objeto en sí
    private Object value=0;
    //La llave asignada a este objeto
    private int key=0;
    private int entryLifetime=0; //Esto debería estara aqui? Ya se define en ListaCache
    //Timer utilizado para medir el "entry lifetime" del objeto
    public Timer myTimer = new Timer(true);

    public ObjectC()
    {}

    public void seteLifeTime() //Que se guarde la hora también cada vez que es referenciado
    {
        eLifeTime = LocalDateTime.now();
    }

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

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getEntryLifetime() {
        return entryLifetime;
    }
    
    public void setEntryLifetime(int entryLifetime) {
        this.entryLifetime = entryLifetime;
    }




}
