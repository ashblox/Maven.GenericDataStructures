package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry> entries;

    private class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K key) {
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                return (V)entry.value;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        if (contains(key)) {
            remove(key);
        }
        Entry entry = new Entry(key, value);
        entries.add(entry);
    }

    public boolean contains(K key) {
        boolean contains = false;
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                contains = true;
            }
        }
        return contains;
    }

    public void remove(K key) {
        Entry entryToRemove = null;
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                entryToRemove = entry;
            }
        }
        entries.remove(entryToRemove);
    }
}
