package train.year_2026.July;

import java.util.Arrays;
import java.util.Scanner;

public class t_21 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    }

//    Arrays二分查找与填充
    public static void first1() {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 6));
        System.out.println(Arrays.copyOf(new int[]{1, 2, 3}, 5));
        arr = new int[]{1, 2, 3, 4, 5};
        Arrays.fill(arr, 1, 3, 9);
        System.out.println(arr);
        System.out.println(Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
    }

}
