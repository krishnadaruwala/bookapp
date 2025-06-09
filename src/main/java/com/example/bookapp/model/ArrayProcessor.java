package com.example.bookapp.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayProcessor {
    private String numbers;  // Input from user (e.g., "5,3,8,1")

    public ArrayProcessor() {}

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getSortedArray() {
        List<Integer> list = parseInput();
        Collections.sort(list);
        return list;
    }

    public List<Integer> getReversedArray() {
        List<Integer> list = parseInput();
        Collections.reverse(list);
        return list;
    }

    private List<Integer> parseInput() {
        return Arrays.stream(numbers.split(","))
                     .map(String::trim)
                     .map(Integer::parseInt)
                     .collect(Collectors.toList());
    }
}
