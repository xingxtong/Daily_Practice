package train.year_2026.July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class t_22 {
    public static void main(String[] args) {
        first1();
    }

    public static void first1(){
        List<String> a = List.of("A", "B", "C");
        System.out.println(a);

        try{
            a.add("D");
        } catch (Exception e){
            System.out.println("不可变列表无法修改");
        }

        Map<String, String> name = Map.of("name", "张三", "age", "25");
        System.out.println(name);
        Map.Entry<String,String>[] ss=new Map.Entry[3];
        ss[0]=Map.entry("name","张三");
        ss[1]=Map.entry("age","25");
        ss[2]=Map.entry("time","Today");

        System.out.println(Map.ofEntries(ss));
        List<String> list=new ArrayList<>(Arrays.asList("X","Y","Z"));
        System.out.println(List.copyOf(list));
    }
}
