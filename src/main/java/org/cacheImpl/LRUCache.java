package org.cacheImpl;

import org.classes.LRUCacheBuilder;
import org.interfaces.ICache;

public class LRUCache implements ICache {
    int capacity;
    String name;
    String serverName;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public void put(String k, int v) {

    }

    @Override
    public int get(String k) {
        return 0;
    }

    @Override
    public void remove(String key) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean containsKey(String key) {
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
