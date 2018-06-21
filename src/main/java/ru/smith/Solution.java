package ru.smith;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Solution {

    public int solution(int number) {
        return Stream.iterate(0,n -> n+1).limit(number)
                .filter(x -> x%3 == 0 || x%5 == 0).mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();
    }

    public static String toCamelCase(String s){

       return s.substring(0,1) + Stream.of(s.split("[\\-_]")).map(w -> w.substring(0, 1).toUpperCase() +w.substring(1)).collect(joining())
               .substring(1);
    }

}