package com.example.katastdd2;

import java.util.Arrays;

public class StringCalculator {
    int Add(String s) {
        if(s.equals("")) return 0;
        //fake implementation
        //if(s.equals("4")) return 4;
        //if(s.equals("5")) return 5;

        //obvious implementation

        //fake implementation
        //if (s.equals("1,2")) return 3;
        //if (s.equals("2,3")) return 5;

        //fake implementation
      //  if (s.equals("1\n2,3")) return 6;
      //  if (s.equals("2\n2,3")) return 7;

        String[] numbers = s.replace("\n",",").split(",");
        return Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
    }
}
