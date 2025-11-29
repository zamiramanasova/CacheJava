package org.classes;

import org.cacheImpl.FIFOCache;
import org.interfaces.ICache;

public class CacheFactory {
    public ICache createCasheInstance(CacheTypeEnum cacheTypeEnum, int capacity) {
        switch (cacheTypeEnum) {
            case FIFO:
                return new FIFOCache(capacity)
                break;
            case LRU:
                return new LRUCache(capacity);
                break;
            default:
                System.out.println();

        }
    }
}
