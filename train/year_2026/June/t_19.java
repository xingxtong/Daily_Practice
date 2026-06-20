package train.year_2026.June;

import java.util.Scanner;

public class t_19 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    //1.罗马数字转整数
    public static void first1() {
        String str = scan.next();
        char c;
        int n = str.length(), sum = 0;
        for (int i = 0; i < n; i++) {
            c = str.charAt(i);
            switch (c) {
                case 'I':
                    if (i + 1 < n && str.charAt(i + 1) == 'V') {
                        sum += 4;
                        i++;
                        break;
                    } else if (i + 1 < n && str.charAt(i + 1) == 'X') {
                        sum += 9;
                        i++;
                        break;
                    }
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (i + 1 < n && str.charAt(i + 1) == 'L') {
                        sum += 40;
                        i++;
                        break;
                    } else if (i + 1 < n && str.charAt(i + 1) == 'C') {
                        sum += 90;
                        i++;
                        break;
                    }
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (i + 1 < n && str.charAt(i + 1) == 'D') {
                        sum += 400;
                        i++;
                        break;
                    } else if (i + 1 < n && str.charAt(i + 1) == 'M') {
                        sum += 900;
                        i++;
                        break;
                    }
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        System.out.println(sum);
    }

}
