package train.year_2026.July;

import java.util.Scanner;

public class t_03 {
    private static final Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    //1.Math类与String.format()
    public static void first1(){
        System.out.println(Math.max(156,238));
        System.out.println(Math.min(156,238));
        System.out.println(Math.abs(-99));
        System.out.println(Math.pow(2,10));
        System.out.println((int)(Math.random()*100));
        String str=String.format("%.2f",3.14159);
        System.out.println(str);

    }
}
