package train.year_2026.July;

import java.util.Objects;
import java.util.Scanner;

public class t_20 {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    public static void first1(){
        String str1="Hello";
        System.out.println(Objects.requireNonNull(str1));
        String str2=null;
        System.out.println(Objects.requireNonNullElse(str2,"默认值"));
        System.out.println(Objects.requireNonNullElseGet(str2, () -> "动态生成"));

        System.out.println(Objects.hash("张三"));
        System.out.println(Objects.hash(25));
        System.out.println(Objects.hash("男"));
        String str3="Java";
        System.out.println(Objects.toString(str3));
        System.out.println(Objects.toString(null, "空对象"));

    }
}
