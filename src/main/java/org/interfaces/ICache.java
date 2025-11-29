package org.interfaces;

public interface ICache {
    void put(String k, int v);

    int get(String k);

    void remove(String key);

    void clear();

    int getSize();

    boolean containsKey(String key);
}
