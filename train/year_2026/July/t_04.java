package train.year_2026.July;

import java.util.*;
import java.util.stream.Collectors;

public class t_04 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    public static void first1() {
        StringJoiner strJ = new StringJoiner("-", "[", "]");
        strJ.add("A");
        strJ.add("B");
        strJ.add("C");
        System.out.println(strJ);
        StringJoiner strJ1 = new StringJoiner("");
        strJ1.add("D");
        strJ1.add("E");
        strJ.merge(strJ1);
        System.out.println(strJ);

        List<String> arrStr =Arrays.asList("apple", "banana", "cherry");
        String sstr = arrStr.stream().collect(Collectors.joining(","));
        System.out.println(sstr);
        sstr = String.join("|", Arrays.asList("X", "Y", "Z"));
        System.out.println(sstr);
    }
}
