package test_timu;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int d=fibonacci(inp.nextInt());
        System.out.println(d);
    }

    public static int fibonacci(int k) {
        //在这里写函数实现
        int[] fi={0,1};
        int k1=(k-2)/2;
        for(int i=0;i<=k1;i++){
            fi[0]=fi[1]+fi[0];
            fi[1]=fi[1]+fi[0];
        }
        return fi[k%2];
    }
}
