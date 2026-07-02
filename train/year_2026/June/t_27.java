package train.year_2026.June;

import java.util.Scanner;

public class t_27 {
    private static final Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    //1.水仙花数
    public static void first1(){
        int sum=0;
        int k=0;
        for(int i=100;i<1000;i++){
            sum=0;
            for(int j=i;j>0;j/=10){
                k=j%10;
                sum+=k*k*k;
            }
            if(sum==i){
                System.out.println(i+" ");
            }
        }
    }

}
