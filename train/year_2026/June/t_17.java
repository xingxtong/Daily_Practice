package train.year_2026.June;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t_17 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] arc) {
        first1();

    }
    //1.数组逆序输出
    public static void first1() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        System.out.println();
        while (n-- != 0) {
            System.out.print(arr.get(n) + " ");
        }
    }
}
