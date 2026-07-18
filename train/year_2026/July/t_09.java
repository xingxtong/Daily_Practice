package train.year_2026.July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class t_09 {
    public static void main(String[] args) {
        ArrayList<String> sal=new ArrayList<>(Arrays.asList("apple","apple","app","banana"));
        System.out.println(Collections.frequency(sal,"apple"));
        Collections.replaceAll(sal,"apple","orange");
        System.out.println(sal);
        Collections.rotate(sal,1);
        System.out.println(sal);
        System.out.println(Objects.deepEquals(new int[][]{{1,2},{3,4}},new int[][]{{1,2},{3,4}}));
    }
}
