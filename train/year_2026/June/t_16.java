package train.year_2026.June;

import java.util.Scanner;

public class t_16 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        second1();
    }

    //1.青蛙跳荷叶
    public static void first1() {
        int a = scan.nextInt(), b = scan.nextInt();
        int sum = 0;
        if (a > b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        while (a != b) {
            if (a + 1 == b) {
                sum += 1;
                break;
            }
            a += 2;
            sum += 1;
        }
        System.out.println(sum);
    }

    //2.数字贴纸计数
    public static void second1() {
        long M = scan.nextLong(), N = scan.nextLong();
        long n = 1, n1 = 1, sum = 0;
        while (n < M) {
            n *= 10;
            n1 += 1;
        }
        //如果两个数长度相同
        if (N < n) {
            System.out.println((N - M) * (n1 - 1));
            return;
        }
        //长度不同
        sum += (n - M - 1) * (n1 - 1);
        n *= 10;
        while (n < N) {
            sum += (n - (n / 10)) * n1;
            n *= 10;
            ++n1;
        }
        n /= 10;
        sum += (N - n + 1) * n1;

        System.out.println(sum);
    }

    //3.共享单车搬运
    public static void third1() {

    }

}
