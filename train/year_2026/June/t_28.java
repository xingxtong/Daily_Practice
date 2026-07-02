package train.year_2026.June;

import java.util.Scanner;

public class t_28 {

    private static final Scanner scan=new Scanner(System.in);
    static int[] ret=new int[200];

    public static void main(String[] args) {
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        second1(arr,0,n);
    }

    //2.归并排序(不包含最后一个)
    public static void second1(int[] arr,int first1,int end){
        if(first1>=end){
            return;
        }

        //从first1到一半
        second1(arr,first1,(first1+end)/2);
        //从一般到end
        second1(arr,(first1+end)/2,end);
        int e1=(first1+end)/2;
        //写入数组(从first1到e1)
        for(int i=first1;i<e1;i++){
            ret[i]=arr[i];
        }
        //写入数组(从e1到end)
        for(int i=e1;i<end;i++){
            ret[i]=arr[i];
        }
        int left=first1,right=e1,id=first1;
        //合并数组
        while(left<e1&&right<end){
            if(ret[left]>=ret[right]){
                arr[id]=ret[right];
                right++;
            }
            else {
                arr[id]=ret[left];
                left++;
            }
            id++;
        }
        while(left<e1){
            arr[id]=ret[left];
            left++;
        }
        while(right<end){
            arr[id]=ret[right];
            right++;
        }
    }

}
