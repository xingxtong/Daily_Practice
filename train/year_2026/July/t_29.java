package train.year_2026.July;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class t_29 {
    public static void main(String[] args) {
        List<String> collect1 = Stream.of("Tom", "Jerry", "Alice", "Bob", "Charlie")
                .filter(s -> s.length() > 3)
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect1);
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .mapToInt(s -> s)
                .sum();
        System.out.println(sum);
        List<Character> collect2 = Stream.of("hello", "world", "java")
                .flatMap(s -> s.codePoints().mapToObj(s1 -> (char) s1))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect2);
        List<Integer> collect3 = Stream.iterate(1, n -> n + 1)
                .limit(100)
                .filter(s -> {
                    for (int i = 2; i <= s / 2; i++) {
                        if (s % i == 0) {
                            return false;
                        }
                    }
                    return false;
                })
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(collect3);
    }
}
