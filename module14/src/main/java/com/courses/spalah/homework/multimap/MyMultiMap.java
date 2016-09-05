package com.courses.spalah.homework.multimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Татьяна on 04.09.2016.
 */
public class MyMultiMap<K, V> implements MultiMap<K, V> {
    private Map<K, ArrayList<V>> map = new HashMap<>();
    private int size;

    @Override
    public boolean put(K key, V value) {
        if (map.containsKey(key)) {
            ArrayList<V> list = map.get(key);
            list.add(value);
        } else {
            ArrayList<V> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
        size++;
        return true;
    }

    @Override
    public Collection<V> get(K key) {
        for (Map.Entry<K, ArrayList<V>> pair : map.entrySet()) {
            if (key.equals(pair.getKey())) {
                return pair.getValue();
            }
        }
        return new ArrayList<>();
    }

    @Override
    public Collection<V> removeAll(K key) {
        if (map.containsKey(key)) {
            ArrayList<V> list = map.get(key);
            map.remove(key);
            size -= list.size();
            return list;
        }
        return new ArrayList<>();
    }

    @Override
    public boolean remove(K key, V value) {
        if (map.containsKey(key)) {
            ArrayList<V> list = map.get(key);
            if (list.contains(value)) {
                list.remove(value);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<V> allValues() {
        ArrayList<V> list = new ArrayList<>();
        for (Map.Entry<K, ArrayList<V>> pair : map.entrySet()) {
            list.addAll(pair.getValue());
        }
        return list;
    }

    @Override
    public boolean containsValue(V value) {
        for (Map.Entry<K, ArrayList<V>> pair : map.entrySet()) {
            if (pair.getValue().contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyMultiMap{" +
                "map=" + map +
                '}';
    }
}
