package com.jj.numberapp.number.repository;

import java.util.ArrayList;
import java.util.List;

public class NumberRepository {

    private static List<String> numbers = new ArrayList<>();

    public static List<String> getBubbleSort() {
        return NumberRepository.numbers;
    }
}
