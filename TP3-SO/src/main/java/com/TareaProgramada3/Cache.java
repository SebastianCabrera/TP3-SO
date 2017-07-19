package com.TareaProgramada3;

/**
 * Created by Sebastián on 19/7/2017.
 */
public interface Cache{
     String getName();
     ObjectC get(int var1);
     void put(int var1, ObjectC var2);
     void evict(int var1);
     void clear();
}
