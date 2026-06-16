package train.year_2026.June;

import java.util.Scanner;

public class t_15 {

    private final static  Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        second1();
    }

    public static void first1(){
        String str;
        str=scan.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    public static  void second1(){
        String str=scan.nextLine();
        if(str.matches("^\\d|\\w$\\d|\\w+"))
        {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }
    }

    public static  void third1(){

    }
}
