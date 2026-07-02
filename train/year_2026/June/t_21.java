package train.year_2026.June;

import java.util.ArrayList;
import java.util.Scanner;

public class t_21 {
    private static final Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        second1();
    }

    //1.十进制转二进制
    public static void first1(){
        int a=scan.nextInt();
        String str;
        while(a>0){
            System.out.print(a%2==0?1:0);
            a/=2;
        }
    }

    //2.字符串中单词出现次数
    public static void second1(){
        ArrayList<String> sArr=new ArrayList<>();
        ArrayList<Integer> iArr=new ArrayList<>();
        String str=scan.nextLine(),str1;
        StringBuilder strb=new StringBuilder();
        int n=str.length();
        char c;
        for(int i=0;i<n;i++){
            c=str.charAt(i);
            if(c!=' ')
                strb.append(c);
            else{

                str1=strb.toString();
                if(str1.equals("")){
                    continue;
                }
                boolean check=true;
                int n1=sArr.size();
                for(int j=0;j<n1;j++){
                    if(str1.equals(sArr.get(j))){
                        iArr.set(j,iArr.get(j)+1);
                        check=false;
                        break;
                    }
                }
                if(check){
                    sArr.add(str1);
                    iArr.add(1);
                }
                strb= new StringBuilder();
            }
        }

        //最后再检查一下是否空余
        str1=strb.toString();
        boolean check=true;
        int n1=sArr.size();
        for(int j=0;j<n1;j++){
            if(str1.equals(sArr.get(j))){
                iArr.set(j,iArr.get(j)+1);
                check=false;
                break;
            }
        }
        if(check){
            sArr.add(str1);
            iArr.add(1);
        }
        n=sArr.size();

        for(int i=0;i<n;i++){
            System.out.println(sArr.get(i)+":"+iArr.get(i));
        }
    }
}
