package com.example.katastdd2;

import java.util.Arrays;

public class StringCalculator {
    int Add(String s) {
        if(s.equals("")) return 0;
        String[] numbers = s.replace("\n",",").split(",");
        return Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
    }
}
