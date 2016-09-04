package com.courses.spalah.homework.multimap;

import java.util.Collection;

/**
 * Created by Татьяна on 04.09.2016.
 */
public class MyMultiMap<K, V> implements MultiMap<K, V> {
    @Override
    public boolean put(K key, V value) {
        return false;
    }

    @Override
    public Collection<V> get(K key) {
        return null;
    }

    @Override
    public Collection<V> removeAll(K key) {
        return null;
    }

    @Override
    public boolean remove(K key, V value) {
        return false;
    }

    @Override
    public Collection<V> allValues() {
        return null;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
