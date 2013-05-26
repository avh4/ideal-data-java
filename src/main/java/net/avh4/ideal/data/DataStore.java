package net.avh4.ideal.data;

public interface DataStore {
    void put(String key, String value);

    String get(String key);
}
