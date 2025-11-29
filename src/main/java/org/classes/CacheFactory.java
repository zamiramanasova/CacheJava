package org.classes;

import org.cacheImpl.FIFOCache;
import org.cacheImpl.LRUCache;
import org.interfaces.ICache;

import java.text.MessageFormat;

public class CacheFactory {
    public ICache createCasheInstance(CacheTypeEnum cacheTypeEnum, int capacity) {
        switch (cacheTypeEnum) {
            case FIFO:
                return new FIFOCache(capacity);
            case LRU:
                return new LRUCache(capacity);
            default:
                System.out.println(MessageFormat.format("Cache with type {0} is not implemented yet", cacheTypeEnum));
                throw new AssertionError();


        }
    }
}
