package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;

public class Practise3 {

    public int sumsSquares(List<Integer> numbers) {
        // TODO: implement method that accepts list of integers and returns sum of their squares.

        return numbers
                .stream()
                .map(x -> x * x)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
