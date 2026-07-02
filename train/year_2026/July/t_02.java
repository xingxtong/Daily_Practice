package train.year_2026.July;

import java.util.Scanner;

public class t_02 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        third1();
    }

    //1.StringBuilder与String常用方法
    public void first1() {
        StringBuilder strB = new StringBuilder();
        for (String s : new String[]{"A", "B", "C"}) {
            strB.append(s).append("-");
        }
        strB.append("D");
        System.out.println(strB);
        System.out.println(strB.reverse());
        String str = strB.toString();
        System.out.println(str.contains("C"));
        str = str.replace('-', ',');
        System.out.println(str);
        System.out.println(str.substring(0, 5));
    }

    //3.缺失的第一个正数
    public static void third1() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int a, b;
        for (int i = 0; i < n; i++) {
            a = arr[i] - 1;
            //交换
            while (a < n && a >= 0 && arr[a] != arr[i]) {
                b = arr[i];
                arr[i] = arr[a];
                arr[a] = b;
                a = arr[i] - 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
