package train.year_2026.July;

import java.util.stream.Stream;

public class t_27 {
    public static void main(String[] args) {
        Stream.of(5, 2, 8, 1, 9, 3).forEach(s -> System.out.println(s));
        Integer i1 = Stream.of(1, 2, 3, 4, 5)
                .reduce((a, b) -> a + b)
                .orElse(0);
        System.out.println(i1);
        String s3 = Stream.of("a", "b", "c", "d")
                .reduce((s1, s2) -> s1 = s1 + s2)
                .orElse("");
        System.out.println(s3);
        System.out.println(Stream.of(10, 20, 30, 40, 50).anyMatch(s -> s > 25));
        System.out.println(Stream.of(10, 20, 30, 40, 50).allMatch(i -> i > 5));
        System.out.println(Stream.of(10, 20, 30, 40, 50).noneMatch(i -> i > 100));
    }
}
