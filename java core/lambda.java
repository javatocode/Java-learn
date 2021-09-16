
import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("original list: " + numbers);

        List<Integer> even = numbers.stream().map(s -> Integer.valueOf(s)).filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("processed list, only even numbers: " + even);

    }

}

// package com.fresco;

// import java.util.*;
// import java.util.function.Predicate;
// import java.util.stream.Collectors;

// public class LambdaFn {
// public boolean narcissistic(String s) {
// int sum = 0;
// int len = s.length();
// for (int i = 0; i < len; i++) {
// sum = sum + (int) Math.pow(s.charAt(i) - '0', len);
// }
// int number = Integer.parseInt(s);
// if (number == sum) {
// return true;
// } else {
// return false;
// }
// }

// public List<Long> functionalProgramming(List<String> listOfIntegers) {
// // Write your code here
// LambdaFn l = new LambdaFn();
// Predicate<String> n = x -> l.narcissistic(x);
// List<Long> outputList =
// listOfIntegers.stream().filter(n).map(Long::valueOf).collect(Collectors.toList());
// return outputList;
// }

// }
