package com.courses.spalah.homework.multimap;

import java.util.*;

/**
 * Created by Artem Uskov on 03.09.2016.
 */
public class MultiMapImplementation<K, V> implements MultiMap<K, V> {
    private int size;

    private Collection<V> valueMap = new ArrayList<V>();
    private HashMap<K, Collection<V>> map = new HashMap<K, Collection<V>>();


    @Override
    public boolean put(K key, V value) {
        if(map.containsKey(key)) {
            valueMap = map.get(key);
            valueMap.add(value);
            //map.put(key, valueMap);
        }
        else {
            valueMap = new ArrayList<V>();
            valueMap.add(value);
            map.put(key, valueMap);
        }
        return true;
    }

    @Override
    public Collection<V> get(K key) {
        if(map.containsKey(key)) {
            return map.get(key);
        }
        else {
            valueMap.clear();
            return valueMap;
        }
    }

    @Override
    public Collection<V> removeAll(K key) {
        if(map.containsKey(key)) {
            valueMap = map.remove(key);
            return valueMap;
        }
        else {
            return new ArrayList<V>();
        }
    }

    @Override
    public boolean remove(K key, V value) {
        if(map.containsKey(key)) {
            valueMap = map.get(key);
            if(valueMap.contains(value)) {
                valueMap.remove(value);
                if(valueMap.size() == 0) {
                    map.remove(key);
                    return true;
                }
                if(valueMap.size() != 0) {
                    map.put(key, valueMap);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Collection<V> allValues() {
        ArrayList<V> allValues = new ArrayList<V>();
        for(Map.Entry<K, Collection<V>> entry : map.entrySet()) {
            allValues.addAll(entry.getValue());
        }
        return allValues;
    }

    @Override
    public boolean containsValue(V value) {
        for(Map.Entry<K, Collection<V>> entry : map.entrySet())
            if(entry.getValue().contains(value)) {
            return true;
            }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public int size() {
        ArrayList<V> allValues = new ArrayList<V>();
        for(Map.Entry<K, Collection<V>> entry : map.entrySet()) {
            allValues.addAll(entry.getValue());
        }
        return allValues.size();
    }
}
