package com.courses.spalah.homework.multimap;

import java.util.*;

/**
 * Created by Татьяна on 04.09.2016.
 */
public class MyMultiMap<K, V> implements MultiMap<K, V> {
    private Map<K, ArrayList<V>> map = new HashMap<>();

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
            if (!list.isEmpty()) {
                Iterator<V> iterator = list.iterator();
                while (iterator.hasNext()) {
                }
            }

        }
        return new ArrayList<>();
    }

    @Override
    public boolean remove(K key, V value) {
        if (map.containsKey(key)) {
            ArrayList<V> list = map.get(key);
            if (list.contains(value)) {
                list.remove(value);
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<V> allValues() {
        ArrayList<V> list = new ArrayList<>();
        for (Map.Entry<K, ArrayList<V>> pair : map.entrySet()) {
            for (V value : pair.getValue()) {
                list.add(value);
            }
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
        return map.size() == 0;
    }

    @Override
    public int size() {
        int size = 0;
        for (Map.Entry<K, ArrayList<V>> pair : map.entrySet()) {
            size += pair.getValue().size();
        }
        return size;
    }
}
