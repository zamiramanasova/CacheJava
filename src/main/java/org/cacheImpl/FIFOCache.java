package org.cacheImpl;

import org.interfaces.ICache;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FIFOCache implements ICache {

    int capacity;

    private final Map<String, Integer> cache = new LinkedHashMap<>();

    public FIFOCache(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void put(String key, int value) {

    }

    @Override
    public int get(String key) {
        Integer value = cache.get(key);
        return value == null ? 0 : value;
    }

    @Override
    public void remove(String key) {
        cache.remove(key);
    }

    @Override
    public void clear() {
        cache.clear();
    }

    @Override
    public int getSize() {
        return cache.size();
    }

    @Override
    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }
}
