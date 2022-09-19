package com.epam.mjc.collections.map;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Set<String> existing = new HashSet<>();
        return sourceMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey())
                .filter(entry -> existing.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }
}