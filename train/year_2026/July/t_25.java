package train.year_2026.July;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class t_25 {
    public static void main(String[] args) {
        System.out.println(Stream.of("A", "B", "C").collect(Collectors.toList()));
        System.out.println(Stream.of(1, 2, 2, 3, 3, 3).collect(Collectors.toSet()));
        System.out.println(Stream.of("Java", "Python", "C++").collect(Collectors.joining()));
        IntSummaryStatistics collect = Stream.of(10, 20, 30, 40, 50)
                .collect(Collectors.summarizingInt(a -> a));
        System.out.println("最大值:" + collect.getMax()
                + " 最小值:" + collect.getMin()
                + " 平均值:" + collect.getAverage()
                + " 总和:" + collect.getSum());
        Map<String, Integer> collect1 = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        Set<Map.Entry<String, Integer>> siM = collect1.entrySet();
        for(Map.Entry<String,Integer> M:siM){
            System.out.println(M.getKey()+"->"+M.getValue());
        }
        Map<Integer, List<String>> collect2 = Stream.of("cat", "dog", "elephant", "bird")
                .collect(Collectors.groupingBy(s -> s.length()));
        Set<Map.Entry<Integer, List<String>>> ilM = collect2.entrySet();
        for(Map.Entry<Integer, List<String>> M:ilM){
            System.out.println(M.getKey()+"->"+M.getValue().toString());
        }


    }
}
