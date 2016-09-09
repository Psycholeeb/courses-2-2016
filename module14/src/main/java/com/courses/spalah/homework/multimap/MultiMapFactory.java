package com.courses.spalah.homework.multimap;

/**
 * @author Ievgen Tararaka
 */
public class MultiMapFactory {
    public static <K, V> MultiMap<K, V> createMultiMap() {
        return new MultiMapImplementation<K, V>();
    }
}
