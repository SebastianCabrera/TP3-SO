package com.TareaProgramada3;

import java.util.ArrayList;
import java.util.TimerTask;

/**
 * Created by Sebastián on 20/7/2017.
 */
public class TTask extends TimerTask{

    private final int i;
    //private final ArrayList<ObjectC> aL;
    private final ListaCache lCache;

    TTask(int i, ListaCache lCache)
    {
        this.i = i;
        this.lCache = lCache;
    }

    public void run()
    {
        //Se consigue la llave del objeto cuyo entry lifetime se acabó
        int llave = lCache.list.get(i).getKey();
        //Se saca el objeto de la lista con la funcion "evict"
        lCache.evict(llave);
    }
}
