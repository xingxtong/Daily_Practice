package train.year_2026.July;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class t_31 {
    private static Scanner scan;

    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("src/test.txt");
            System.setIn(is);
            scan = new Scanner(System.in);
            third1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            scan.close();
        }
    }

    public static void third1() {
        int m = scan.nextInt(), n = scan.nextInt();
        int[] arr = new int[n + 1];
        arr[1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }
        System.out.println(arr[n]);
    }
}
