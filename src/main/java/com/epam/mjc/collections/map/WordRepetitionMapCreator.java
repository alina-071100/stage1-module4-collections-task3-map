package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        return Pattern.compile(",|\\s|\\.")
                .splitAsStream(sentence)
                .map(String::toLowerCase)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(x -> 1)));

    }
}
