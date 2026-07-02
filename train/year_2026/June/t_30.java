package train.year_2026.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t_30 {


    public static void main(String[] args) {
        second1();
    }
    //1.字符串与数字互转
    public static void first1(){
        System.out.println(String.valueOf(123));
        System.out.println(Integer.parseInt("456"));
        System.out.println(Double.parseDouble("3.14"));
    }

    //2.集合与数组互转
    public static void second1(){
        ArrayList<String> str=new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        String[] sStr= str.toArray(new String[0]);
        for(String s:sStr){
            System.out.print(s+" ");
        }
        String[] ss={"X","Y","Z"};
        List<String> listStr= Arrays.asList(ss);
        System.out.println();
        for(String s:listStr){
            System.out.print(s+" ");
        }

    }


}
