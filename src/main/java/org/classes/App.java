package org.classes;

import org.cacheImpl.FIFOCache;
import org.interfaces.ICache;

public class App {
    public static void main(String[] args) throws Exception {
        testFIFO();
        testFIFOwithFactory();
        testLRUwithFactory();
        testLRUCacheBuilder();
    }

    private static void testLRUCacheBuilder() {
        LRUCacheBuilder lruCacheBuilder = new LRUCacheBuilder(15);
        ICache lruCache = lruCacheBuilder.setName("LRU custom cache").setServerName("localhost").build();
        lruCache.put("key1", 1);
        lruCache.put("key2", 123);
        System.out.println("Size: " + lruCache.getSize());
        System.out.println("key2 = " + lruCache.get("key2"));

        lruCache.remove("key1");
        System.out.println("Size after remove: " + lruCache.getSize());

    }
    private static void testLRUwithFactory() {
        ICache fifoCache = new CacheFactory().createCasheInstance(CacheTypeEnum.LRU, 10);
        fifoCache.put("key1", 1);
        fifoCache.put("key2", 123);
        System.out.println("Size: " + fifoCache.getSize());
        System.out.println("key2 = " + fifoCache.get("key2"));

        fifoCache.remove("key1");
        System.out.println("Size after remove: " + fifoCache.getSize());
    }

    private static void testFIFOwithFactory() {
        ICache fifoCache = new CacheFactory().createCasheInstance(CacheTypeEnum.FIFO, 10);
        fifoCache.put("key1", 1);
        fifoCache.put("key2", 123);
        System.out.println("Size: " + fifoCache.getSize());
        System.out.println("key2 = " + fifoCache.get("key2"));

        fifoCache.remove("key1");
        System.out.println("Size after remove: " + fifoCache.getSize());
    }

    private static void testFIFO() {
        ICache fifoCache = new FIFOCache(9);
        fifoCache.put("key1", 1);
        fifoCache.put("key2", 123);
        System.out.println("Size: " + fifoCache.getSize());
        System.out.println("key2 = " + fifoCache.get("key2"));

        fifoCache.remove("key1");
        System.out.println("Size after remove: " + fifoCache.getSize());
    }
}
