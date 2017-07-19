package com.TareaProgramada3;

/**
 * Created by Sebastián on 19/7/2017.
 */
public interface Cache<K, V> {
    String getName();
    V get(K var1);
    void put(K var1, V var2);
    void evict(K var1);
    void clear();
}
