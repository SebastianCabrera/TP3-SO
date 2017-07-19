package com.TareaProgramada3;

/**
 * Created by Sebastián on 19/7/2017.
 */
public interface Cache <K, V>{
     public abstract String getName();
     public abstract V get(K var1);
     public abstract void put(K var1, V var2);
     public abstract void evict(K var1);
     public abstract void clear();
}
