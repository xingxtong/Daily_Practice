package train.year_2026.July;

import java.util.*;

public class t_10 {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        third1();
    }
    //1.字符串反转
    public static void first1(){
        StringBuilder sBu= new StringBuilder(scan.next());
        System.out.println(sBu.reverse());
    }
    //3.统计字符串中单词出现的次数
    public static void third1(){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        StringBuilder str;
        int n= scan.nextInt(),k;
        for(int i=0;i<n;i++){
            str=new StringBuilder(scan.next());
            char c = str.charAt(str.length() - 1);
            if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z'))){
                str.delete(str.length()-1,str.length());
            }
            lhm.put(str.toString(),lhm.get(str)==null?1:lhm.get(str)+1);
        }
        Set<Map.Entry<String, Integer>> entries = lhm.entrySet();
        for(Map.Entry<String,Integer> mp:entries){
            System.out.println(mp.getKey()+":"+mp.getValue());
        }
    }
}
