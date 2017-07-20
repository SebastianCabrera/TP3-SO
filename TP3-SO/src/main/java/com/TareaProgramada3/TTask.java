package com.TareaProgramada3;

import java.util.ArrayList;
import java.util.TimerTask;

/**
 * Created by Sebastián on 20/7/2017.
 */
public class TTask extends TimerTask{

    private final int i;
    private final ArrayList<ObjectC> aL;

    TTask(int i, ArrayList<ObjectC> aL)
    {
        this.i = i;
        this.aL = aL;
    }

    public void run()
    {
        aL.remove(i);
    }
}
