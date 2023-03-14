package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> keysMap = new HashMap<>();
        sourceMap.keySet().forEach(key -> {
            int newKey = key.length();
            keysMap.putIfAbsent(newKey, new HashSet<>());
            keysMap.get(newKey).add(key);
        });
        return keysMap;
    }
}
