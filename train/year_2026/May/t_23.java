package train.year_2026.May;

import java.util.Scanner;

public class t_23 {
    public static void main(String[] args) {
        third();
    }

    //第一题
    public static void first() {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();              //读取这一行剩余的字符，直到换行符，或者没有东西
        char c;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                System.out.print((char) (c - 32));
            } else if (c >= 'A' && c <= 'Z') {
                System.out.print((char) (c + 32));
            } else {
                System.out.print(c);
            }
        }
    }

    //第二题
    public static void second() {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        char c;
        int leng = str.length();
        //A是65 a是97 0是48
        for (int i = 0; i < leng; i++) {
            c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                System.out.print((char) (97 + (c - 97 + 5) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                System.out.print((char) (65 + (c - 65 + 5) % 26));
            } else if (c >= '0' && c <= '9') {
                System.out.println((char) (48 + (c - 48 + 5) % 10));
            } else {
                System.out.print(c);
            }
        }
    }

    //第三题
    public static void third() {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String strA = inp.nextLine();                 //子串A
        String strB = inp.nextLine();                 //子串B
        final int A = str.length(), B = strA.length();
        for (int i = 0; i < A; i++) {
            if (str.charAt(i) == strA.charAt(0)) {
                boolean check = true;
                for (int j = 1; j < B; j++) {
                    if (i + j < A && str.charAt(i + j) != strA.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.print(strB);
                } else {
                    System.out.print(str.charAt(i));
                }

            } else {
                System.out.print(str.charAt(i));
            }
        }
    }

}
