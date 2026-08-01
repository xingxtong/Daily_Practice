package train.year_2026.July;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class t_24 {

    private static Scanner scan;

    public static void main(String[] args) {
        File test = new File("src", "test.txt");
        System.out.println(test.getAbsolutePath());
        InputStream ipS1 = null;
        try {
            ipS1 = new FileInputStream(test);
            System.setIn(ipS1);
            scan = new Scanner(System.in);
            third1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ipS1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            scan.close();
        }

    }

    public static void first1() {
        Stream.of("apple", "banana", "cherry", "date")
                .filter(s -> s.length() > 5)
                .forEach(s -> System.out.println(s));
        List<Integer> collect = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6})
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println(collect);
        Stream.iterate(0, i -> i + 2)
                .limit(5)
                .forEach(i -> System.out.println(i));
        Random random = new Random();
        Stream.generate(() -> random.nextInt())
                .limit(3)
                .forEach(i -> System.out.println(i));
        List<Integer> li = (List<Integer>) Stream
                .concat(Stream.of(1, 2, 3), Stream.of(4, 5, 6))
                .collect(Collectors.toList());
        System.out.println(li);
    }

    public static void third1() {

        int m = scan.nextInt(), n = scan.nextInt();
        int[][] arr = new int[m][n], dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        dp[1][1] = arr[0][0];
        //初始化数组左侧为正无穷
        for (int i = 2; i <= m; i++) {
            dp[i][0] = Integer.MAX_VALUE;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] =arr[i-1][j-1]+ Math.min(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        System.out.println(dp[m][n]);
    }
}
