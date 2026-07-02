package train.year_2026.June;

import java.util.Scanner;

public class t_29 {

    private static final Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(first1(123));
    }

    //1.string.value
    public static String first1(int abc){
        return String.valueOf(abc);
    }

    //2.猴子选大王
    public static void second1(){
        int[] arr=new int[15];
        for(int i=1;i<=15;i++){
            arr[i-1]=i;
        }
        int id=0;
        boolean check;

        for(int i=1;i<15;i++){
            for(int j=0;j<7;j++){
                //过滤为0的地方
                check=false;
                while(arr[id]==0){
                    id=(id+1)%14;
                    check=true;
                }
                if(check){
                    id=(id+14-1)%14;
                }
                id=(id+1)%14;
            }
        }
    }

}
