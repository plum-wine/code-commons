package com.github.map;

import java.util.Collection;
import java.util.Set;

/**
 * @author hangs.zhang
 * @date 2020/04/20 00:07
 * *****************
 * function:
 */
public class HashMap<K, V> implements Map<K, V> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public void put(K k, V v) {

    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public boolean containsKey(K k) {
        return false;
    }

    @Override
    public boolean containsValue(V v) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }
}
