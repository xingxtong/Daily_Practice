package train.year_2026.July;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class t_30 {
    public static void main(String[] args) {
        Map<String, List<String>> collect = Stream.of("apple", "banana", "apple", "cherry")
                .collect(Collectors.groupingBy(s -> s));
        System.out.println(Stream.of("apple", "banana", "apple", "cherry").collect(Collectors.counting()));

        System.out.println(Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a * b));
        String s = Stream.of("a", "b", "c", "d")
                .reduce((s1, s2) -> s1 = s1 + s2)
                .orElse(null);
        System.out.println(s);
        System.out.println(Stream.of(5, 2, 8, 1, 9, 3).max((i1, i2) -> i1 - i2).get());
        System.out.println(Stream.of(5, 2, 8, 1, 9, 3).min((i1, i2) -> i1 - i2).get());
        System.out.println(Stream.of(5, 2, 8, 1, 9, 3).count());
        IntSummaryStatistics intSS = Stream.of("hello", "world", "java")
                .mapToInt(String::length)
                .summaryStatistics();
        System.out.println("最大值"+intSS.getMax()+"\n"
                +"最小值"+intSS.getMin()+"\n"
                +"平均值"+intSS.getAverage()+"\n"
                +"总和"+intSS.getSum()+"\n");
    }
}
