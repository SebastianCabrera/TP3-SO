package com.TareaProgramada3;

import java.time.LocalDateTime;
import java.util.Timer;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ObjectC {

    //private int hour=0;
    //private int minute=0;
    //private int second=0;
    LocalDateTime now;
    LocalDateTime eLifeTime;
    private Object value=0;
    private int key=0;
    private int entryLifetime=0; //Esto debería estara aqui? Ya se define en ListaCache
    public Timer myTimer = new Timer(true);

    public ObjectC()
    {}

    public void seteLifeTime() //Que se guarde la hora también cada vez que es refrerenciado
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

    /*
    public void setAge(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    */

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
