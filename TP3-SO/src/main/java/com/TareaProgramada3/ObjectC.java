package com.TareaProgramada3;

/**
 * Created by Sebastián on 19/7/2017.
 */
public class ObjectC {

    private int hour;
    private int minute;
    private int second;
    private Object value;
    private int key;
    private int tiempoVida;

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

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }




}
