package org.cacheImpl;

import org.interfaces.ICache;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FIFOCache implements ICache {

    private static final int CAPACITY = 10;

    private final Map<String, Integer> cache = new LinkedHashMap<>();

    @Override
    public void put(String key, int value) {
        if (cache.size() >= CAPACITY) {
            // удаляем самый старый элемент (FIFO)
            String firstKey = cache.keySet().iterator().next();
            cache.remove(firstKey);
        }
        cache.put(key, value);
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
