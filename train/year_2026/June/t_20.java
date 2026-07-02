package train.year_2026.June;

import java.util.Scanner;

public class t_20 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        second1();
    }

    //1.判断回文串
    public static void first1() {
        String str = scan.nextLine();
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (!pan(str.charAt(left))) {
            left++;
        }

        while (!pan(str.charAt(right))) {
            right--;
        }
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("不是回文");
                return;
            }
            left++;
            right--;
            while (!pan(str.charAt(left))) {
                left++;
            }

            while (!pan(str.charAt(right))) {
                right--;
            }

        }
        System.out.println("是回文");
    }

    //判断是不是字母
    public static boolean pan(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }

    //2.最长连续递增序列
    public static void second1() {
        int n = scan.nextInt();
        //存原始数组
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int first = 0, end = 0, maxLeng = 0;
        if (n == 1) {
            System.out.println(1);
        }
        for (int i = 1; i < n; i++) {
            if (arr[end + 1] > arr[end]) {
                end++;
            } else {
                int a = end - first + 1;
                if (maxLeng < a) {
                    maxLeng = a;
                }
                first = ++end;
            }
        }
        //检测maxLeng是否为最大
        int a = end - first + 1;
        if (maxLeng < a) {
            maxLeng = a;
        }
        System.out.println(maxLeng);
    }
}
