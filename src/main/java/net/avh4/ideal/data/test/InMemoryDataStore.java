package net.avh4.ideal.data.test;


import net.avh4.ideal.data.DataStore;

import java.util.HashMap;

/**
 * This can be used for unit tests where we can simulate persistence by adding
 * a singleton instance of InMemoryDataStore to the DI container.
 */
public class InMemoryDataStore implements DataStore {
    HashMap<String, String> map = new HashMap<>();

    @Override
    public void put(String key, String value) {
        map.put(key, value);
    }

    @Override
    public String get(String key) {
        return map.get(key);
    }

    public void clear() {
        map.clear();
    }
}
