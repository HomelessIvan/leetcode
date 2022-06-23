package leetcode412;

import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n+1).mapToObj(i -> {
            boolean isDiv3 = i % 3 == 0;
            boolean isDiv5 = i % 5 == 0;
            if (isDiv3 && isDiv5)
                return "FizzBuzz";
            if (isDiv3)
                return "Fizz";
            if (isDiv5)
                return "Buzz";
            return String.valueOf(i);

        }).toList();
    }
}
