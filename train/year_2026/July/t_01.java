package train.year_2026.July;

import java.util.Arrays;
import java.util.Scanner;

public class t_01 {
    private static final Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        t_01 ret=new t_01();
        ret.first1();
    }

    //1.String 与 Arrays 工具类
    public void first1(){
        String[] sArr1={"A","B","C"};
        System.out.println(String.join("-",sArr1));
        int[] iArr1=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(iArr1));
        System.out.println(Arrays.toString(Arrays.copyOfRange(iArr1, 2, 4)));
        System.out.println("Hello".toCharArray());
    }
}
