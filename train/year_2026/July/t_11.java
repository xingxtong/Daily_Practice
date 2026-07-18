package train.year_2026.July;

import java.util.Scanner;

public class t_11 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        second1();
    }

    //1.二进制中1的个数
    public static void first1() {
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                ++sum;
            }
            num >>= 1;
        }
        System.out.println(sum);
    }

    //2.二分查找
    public static void second1() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int left = 0, right = n - 1, center = (left + right) / 2;
        while (left < right) {
            if (arr[center] < target) {
                left = center + 1;
            } else {
                right = center;
            }
            center = (left + right) / 2;
        }
        System.out.println(arr[left] == target ? left : -1);
    }

    //3.奇偶交换
    public static void thrid1() {
        int n = scan.nextInt();
        int num, num1 = 0, num0 = 0;
        for (int i = 0; i < n; i++) {
            num = scan.nextInt();
            switch (num) {
                case 0:
                case 2:
                    ++num0;
                    break;
                case 1:
                case 3:
                    ++num1;
                    break;
            }
        }
        if (num0 > num1) num0 = num1;
        long sum = 0;
    }
}
