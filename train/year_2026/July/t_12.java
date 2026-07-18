package train.year_2026.July;

import java.util.Scanner;
import java.util.StringJoiner;

public class t_12 {
    private static Scanner scan = new Scanner(System.in);
    private static boolean[] check = new boolean[100];
    private static int[] arr = new int[100];
    static int n = 1;
    static String[] sarr=new String[100];

    public static void main(String[] args) {
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        n--;
        third1(0);
    }

    //1.String和StringJoiner
    public static void first1() {
        String str = "abc";
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(" Hello World ".strip());
        System.out.println("Java".repeat(3));
        System.out.println("abc\ndef\nghi".lines());
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.add("A");
        stringJoiner.add("B");
        stringJoiner.add("C");
        System.out.println(stringJoiner);
    }

    //3.全排列
    public static void third1(int k) {
        if (k == n) {
            for (int i = 0; i <= n; i++) {
                if (!check[i]) {
                    sarr[k]=String.valueOf(arr[i]);
                    for(int j=0;j<=n;j++){
                        System.out.print(sarr[j]);
                    }
                    System.out.println();
                    return;
                }
            }

        }
        for (int i = 0; i <= n; i++) {
            if (!check[i]) {
                sarr[k]=String.valueOf(arr[i]);
                check[i] = true;
                third1(k + 1);
                check[i] = false;
            }
        }

    }
}
