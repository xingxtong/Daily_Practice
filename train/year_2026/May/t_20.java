package train.year_2026.May;

import java.util.Scanner;


public class t_20 {

    //    第三题
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("请输入括号");
        String str=inp.next();
        System.out.println(Third(str));
    }

    //第一题
    public static int First(int n, int a) {
        int ten = 1;
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += a * ten * i;
            ten *= 10;
        }
        return sum;
    }

    //第二题
    public static void Second(double height, int n) {
        double q_n = 1;
        for (int i = 1; i < n; i++) {
            q_n /= 2;
        }
        n = 1 << n;
        double height1 = height / n;
        double sum = height + 2 * height * (1 - q_n) + height1;

        System.out.println("最后的高度为:" + height1);
        System.out.println("总共的行程为：" + sum);
    }

    //第三题目
    public static boolean Third(String str) {
        System.out.println(str);
        char[] kuohao = new char[(int) (1e4 + 10)];
        int leng = str.length();
        int id = 0;
        if (leng <= 1) {
            return false;
        }
        char zifu;
        for (int i = 0; i < leng; i++) {
            zifu = str.charAt(i);
            if (zifu == '[' || zifu == '{' || zifu == '(') {
                ++id;
                kuohao[id] = zifu;
            }else if (id>0) {
                if (zifu == ']' && kuohao[id] == '[') {
                    --id;
                } else if (zifu == '}' && kuohao[id] == '{') {
                    --id;
                } else if (zifu == ')' && kuohao[id] == '(') {
                    --id;
                } else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        if(id==0) {
            return true;
        }
        else{
            return false;
        }
    }
}
