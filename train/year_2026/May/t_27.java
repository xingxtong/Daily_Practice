package train.year_2026.May;

import java.util.Scanner;

public class t_27 {
    static Scanner inp=new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={1,3,57,7,8,9,9,0,3,21,33,3123};
        sort1(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //1.统计字符串中的单词个数
    public static void first1(){
        String str=inp.nextLine();
        int leng=str.length(),sum=0;
        char ret;
        int[] arrC=new int[30];
        for(int i=0;i<leng;i++) {
            ret = str.charAt(i);
            if (ret >= 'a' && ret <= 'z') {
                arrC[ret - 97] = 1;
            }else if (ret>='A'&& ret<='Z'){
                arrC[ret-65]=1;
            }
        }
        for(int i=0;i<30;i++){
            if(arrC[i]==1){
                ++sum;
            }
        }
        System.out.println(sum);
    }
    //2. 颈椎病治疗
    public static void second(){
        int n=inp.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
    //3.写出任意一种排序算法(简单的插入排序)
    public static void sort1(int[] arr,int left,int right){
        //会排序到arr[right]
        for(int i=left+1;i<=right;i++){
            int j;
            int k=arr[i];
            for(j=i-1;j>=left&&arr[j]>k;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=k;
        }
    }


}
