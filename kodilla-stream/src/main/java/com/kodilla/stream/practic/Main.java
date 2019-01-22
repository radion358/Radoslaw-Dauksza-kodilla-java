package com.kodilla.stream.practic;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static long getCountEmptyStringUsingJava8(List<String> strings) {
        return strings.stream().filter(s -> s.length() == 0)
                .count();
    }

    static long getCountLength3UsingJava8(List<String> strings) {
        return strings.stream().filter(s -> s.length() == 3)
                .count();
    }

    static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        return strings.stream().filter(s -> s.length() > 0)
                .collect(Collectors.toList());
    }

    static String getMergedStringUsingJava8(List<String> strings, String s) {
        return strings.stream().filter(s1 -> s1.length() > 0 )
                .collect(Collectors.joining(s));
    }

    static List<Integer> getSquaresJava8(List<Integer> numbers) {
        return numbers.stream().distinct().map(integer -> integer * integer)
                .collect(Collectors.toList());
    }

    static Integer getMaxJava8(List<Integer> numbers) {
        return numbers.stream().mapToInt(value -> value).max().orElse(0);
    }

    static Integer getMinJava8(List<Integer> numbers) {
        return numbers.stream().mapToInt(value -> value).min().orElse(0);
    }

    static Integer getSumJava8(List<Integer> numbers) {
        return numbers.stream().mapToInt(value -> value).sum();
    }

    static Integer getAverageJava8(List<Integer> numbers) {
        return (int) numbers.stream().mapToInt(value -> value).average().orElse(0);
    }
}
