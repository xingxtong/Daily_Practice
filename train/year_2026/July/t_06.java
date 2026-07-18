package train.year_2026.July;

import java.util.Arrays;

public class t_06 {
    public static void main(String[] args) {
        String name="张三";
        int age=25;
        double score=92.5;
        String str=String.format("学生:%s,年龄:%d,成绩:%.1f分",name,age,score);
        System.out.println(str);
        System.out.println(String.format("%,d",123456789));
        System.out.println(String.join("-","2025","07","04"));
        System.out.println(String.join(",", Arrays.asList("A","B","C","D")));
    }
}
