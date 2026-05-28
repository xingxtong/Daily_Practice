package train.year_2026.May;

import java.util.Random;
import java.util.Scanner;

public class t_28 {
    static Scanner inp = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        second();
    }

    //1.数组元素求和与平均值
    public static void first1() {
        int n = inp.nextInt();
        double average = 0;
        for (int i = 0; i < n; i++) {
            average += inp.nextInt();
        }
        System.out.printf("%.2f", average / n);
    }

    //2.排序并去重
    public static void second() {
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        quick_sort(arr, 0, n - 1);
        int id = 1;
        int sum = 0;
        while (id < n) {
            while (arr[id] == arr[id - 1]) {
                id++;
            }
            System.out.print(arr[id]);
            id++;
        }
    }

    //快速排序
    public static void quick_sort(int[] arr, int left, int right) {
        if (right - left < 1) {
            return;
        }
        int rand1 = rand.nextInt(right - left + 1) + left;
        int l1 = left;              //数组最左边的指针
        int r1 = right;             //数组最右边的指针
        int c;                      //用于交换的中间数组
        int key = arr[rand1];       //记录随机到的值
        int id = left;              //用于移动的指针
        while (id <= r1) {

            if (arr[id] > key) {
                c = arr[r1];
                arr[r1] = arr[id];
                arr[id] = c;
                r1--;
            } else if (arr[id] < key) {
                c = arr[l1];
                arr[l1] = arr[id];
                arr[id] = c;
                l1++;
                id++;
            } else {
                id++;
            }
        }
        quick_sort(arr, left, l1-1);
        //从center到right
        quick_sort(arr, r1+1, right);
    }

    //3.两路合并
    public static void third() {

    }
}
