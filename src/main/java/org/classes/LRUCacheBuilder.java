package org.classes;

import org.cacheImpl.LRUCache;

public class LRUCacheBuilder {
    private LRUCache lruCache;

    public LRUCacheBuilder(int capacity) {
        lruCache = new LRUCache(capacity);
    }

    public LRUCacheBuilder setName(String name) {
        lruCache.setName(name);
    }
}
