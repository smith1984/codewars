package ru.smith;

import java.util.stream.Stream;

public class Solution {

    public int solution(int number) {
        return Stream.iterate(0,n -> n+1).limit(number)
                .filter(x -> x%3 == 0 || x%5 == 0).mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();
    }
}