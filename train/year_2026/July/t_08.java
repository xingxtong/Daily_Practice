package train.year_2026.July;

import java.util.*;

public class t_08 {
    public static void main(String[] args) {
        int[] arr1=new int[]{5,2,9,1,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Integer[] arr2=Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        String[] strarr={"banana","apple","cherry","date"};
        Arrays.sort(strarr,(s1,s2)->s1.length()-s2.length());
        System.out.println(Arrays.toString(strarr));
        ArrayList<Integer> itarr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(itarr1);
        System.out.println(itarr1);
    }
}
