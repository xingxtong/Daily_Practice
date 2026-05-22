package train.year_2026.May;

import java.util.Scanner;

public class t_21 {
    public static void main(String[] args) {
        Third();
    }

    //第一题
    public static void First() {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        int m = inp.nextInt();
        int id = (n - m) % 10;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[id] + " ");
            ++id;
            id = id >= n ? 0 : id;
        }

    }

    //第二题
    public static void Second() {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[100];
        int n = inp.nextInt();
        //构建模拟数组
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int m = inp.nextInt() - 1;
        int id = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                id = next(n, id, arr);
            }
            arr[id] = 0;
            id = next(n, id, arr);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
                return;
            }
        }
    }

    public static int next(int n, int id, int[] arr) {
        int Tid = (id + 1) % n;
        while (arr[Tid] == 0) {
            Tid = (Tid + 1) % n;
        }
        return Tid;
    }

    //第三题
    public static void Third() {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        char[] Carr = str.toCharArray();
        int len = Carr.length, left, right;
        int sum, Mleft = 0, Mright = 0, max1 = 1;
        for (int i = 0; i < len; i++) {
            left = i - 1;
            right = i + 1;
            sum = 1;
            while (left >= 0 && right < len) {
                if (Carr[left] == Carr[right]) {
                    --left;
                    ++right;
                    sum += 2;
                }
                else{
                    break;
                }
            }
            if (sum > max1) {
                Mleft = left+1;
                Mright = right-1;
                max1 = sum;
            }
        }
        for (int i = Mleft; i <= Mright; i++) {
            System.out.print(Carr[i]);
        }
    }
}
