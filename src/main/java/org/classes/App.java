package org.classes;

import org.cacheImpl.FIFOCache;
import org.interfaces.ICache;

public class App {
    public static void main(String[] args) throws Exception {
        testFIFO();
    }

    private static void testFIFO() {
        ICache fifoCache = new FIFOCache();
        fifoCache.put("key1", 1);
        fifoCache.put("key2", 123);
        System.out.println("Size: " + fifoCache.getSize());
        System.out.println("key2 = " + fifoCache.get("key2"));

        fifoCache.remove("key1");
        System.out.println("Size after remove: " + fifoCache.getSize());
    }
}
