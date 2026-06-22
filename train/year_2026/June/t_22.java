package train.year_2026.June;

import java.util.Scanner;

public class t_22 {

    private static final Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    //1.判断丑数
    public static void first1(){
        int a=scan.nextInt();
        if(a<=0){
            System.out.println("不是丑数");
            return;
        }
        while (a>1){
            if(a%2==0){
                a/=2;
                continue;
            }else if(a%3==0){
                a/=3;
                continue;
            }else if(a%5==0){
                a/=5;
                continue;
            }
            break;
        }
        if(a==1){
            System.out.println("是丑数");
        }
        else {
            System.out.println("不是丑数");
        }
    }

    //2.字符串相乘
    public static void second1(){
        String s1=scan.next();
        String s2=scan.next();
        int n1=s1.length(),n2=s1.length();
        StringBuilder outStr=new StringBuilder();
        int[] arr=new int[n1+n2+1];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                arr[i+j+1]+=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
            }
        }
        n1+=n2;
        for(int i=n1-1;i>=0;i--){
            if(arr[i]>=10){
                arr[i-1]+=arr[i]/10;
                arr[i]%=10;
            }
        }
        int id=0;
        while (arr[id]==0){
            id++;
        }
        while(id<n1){
            System.out.print(arr[id]);
            id++;
        }
    }


}
