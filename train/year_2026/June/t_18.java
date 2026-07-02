package train.year_2026.June;
import java.util.Scanner;

public class t_18 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        second1();
    }

    //1.统计字符串中每个字符出现次数
    public static void first1() {
        int[] arr = new int[150];
        StringBuilder str = new StringBuilder();
        String s = scan.nextLine();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i)] == 0) {
                str.append(s.charAt(i));
            }
            arr[s.charAt(i)] += 1;

        }
        n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i) + ":" + arr[str.charAt(i)]);
        }
    }

    //2.两数之和
    public static void second1() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }


}
