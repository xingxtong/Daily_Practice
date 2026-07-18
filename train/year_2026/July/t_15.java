package train.year_2026.July;

import java.util.Scanner;

public class t_15 {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    public static void first1(){
        int a=scan.nextInt(),b=scan.nextInt();
        int d=a,e=b;
        int c=0;
        while(b>0){
            c=b;
            b=a%b;
            a=c;
        }
        System.out.println("公约数:"+a);
        System.out.println("公倍数"+(d/a)*e);
    }
}
