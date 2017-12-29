package com.example.jenkins;


public class FizBuzz {
    public static FizBuzz createFizBuzz() {
        return new FizBuzz();
    }

    private FizBuzz() {

    }
    public String result(int number) {
        if (number % 15 == 0) {
            return "fizbuzz";
        }
        if (number % 3 == 0) {
            return "fiz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
