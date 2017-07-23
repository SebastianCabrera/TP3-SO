package com.TareaProgramada3;

/**
 * Created by sebastian on 22/7/2017.
 */
public class Pagina
{
    int id;
    int namespace;
    String title;
    int counter;
    int is_redirect;
    int is_new;
    double random;
    int latest;
    int len;

    Pagina()
    {

    }

    public int getId() {
        return id;
    }

    public int getNamespace() {
        return namespace;
    }

    public String getTitle() {
        return title;
    }

    public int getCounter() {
        return counter;
    }

    public int getIs_redirect() {
        return is_redirect;
    }

    public int getIs_new() {
        return is_new;
    }

    public double getRandom() {
        return random;
    }

    public int getLatest() {
        return latest;
    }

    public int getLen() {
        return len;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNamespace(int namespace) {
        this.namespace = namespace;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setIs_redirect(int is_redirect) {
        this.is_redirect = is_redirect;
    }

    public void setIs_new(int is_new) {
        this.is_new = is_new;
    }

    public void setRandom(double random) {
        this.random = random;
    }

    public void setLatest(int latest) {
        this.latest = latest;
    }

    public void setLen(int len) {
        this.len = len;
    }



}
