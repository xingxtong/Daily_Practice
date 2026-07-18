package train.year_2026.July;

import java.util.*;

public class t_18 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    public static void first1() {
        List<String> sl = new ArrayList<>();
        Collections.addAll(sl, "A", "B", "C", "D", "E");
        System.out.println(sl);
        Collections.fill(sl, "X");
        System.out.println(sl);
        System.out.println(Collections.disjoint(Arrays.asList("A", "B", "C"), Arrays.asList("D", "E", "F")));
        System.out.println(Collections.disjoint(Arrays.asList("A", "B", "C"), Arrays.asList("C", "D", "E")));
        final List<String> java = Collections.nCopies(5, "Java");
        System.out.println(java);
    }
}
