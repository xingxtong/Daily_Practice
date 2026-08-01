package train.year_2026.July;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class t_28 {
    private static Scanner scan = null;

    public static void main(String[] args) {
        try {
            InputStream IS = new FileInputStream("src/test.txt");
            System.setIn(IS);
            scan = new Scanner(System.in);
            third1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void third1() {
        String str = scan.next();
        int k = str.length();
        int max = 0;
        for (int i = 0; i < k; i++) {
            int left = i, right;
            int sum;
            if (left + 1 < k && str.charAt(left) == str.charAt(left + 1)) {
                right = left + 1;
                sum = 0;
            } else {
                right = left;
                sum = -1;
            }
            while (left >= 0 && right < k) {
                if (str.charAt(left) == str.charAt(right)) {
                    sum += 2;
                    left--;
                    right++;
                } else break;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
