package train.year_2026.July;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class t_07 {
    private static final Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    //1.BigDecimal与System
    public static void first1(){
        BigDecimal bd=new BigDecimal("0.2");
        BigDecimal bd1=new BigDecimal("0.1");
        System.out.println(bd.add(bd1));

        bd=new BigDecimal("1.5");
        System.out.println(bd.divide(new BigDecimal("0.3"),2, RoundingMode.HALF_UP));

        System.out.println(System.currentTimeMillis());
        int[] src=new int[]{1,2,3,4,5};
        int[] alI=new int[20];
        System.arraycopy(src,0,alI,0,3);
        System.out.println(Arrays.toString(alI));

    }
}
