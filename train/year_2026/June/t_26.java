package train.year_2026.June;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class t_26 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        second1();
    }

    //1.第一个不重复的字符
    public static void first1() {
        String str = scan.nextLine();
        int n = str.length();
        int i = 0;
        for (i = 0; i < n; i++) {
            int j;
            for (j = i; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                System.out.println(i);
                return;
            }
        }
        if (i == n) {
            System.out.println(-1);
        }
    }

    //2.鸡兔同笼
    public static void second1() {
        int heads = scan.nextInt(), feets = scan.nextInt();
        int x = heads * 2 - feets / 2, y = heads - x;
        
        if ((2 * x + 4 * y == feets) && (x > 0 && y > 0)) {
            System.out.println("鸡:" + x + "只" + "\n兔:" + y + "只");
        } else {
            System.out.println("无解");
        }
    }

    //3.通过ArrayList的结构思路, 实现该接口:
    class MyList<E> {
        E[] list1;
        int id = -1;

        MyList() {
        }

        /**
         * 获取元素数量
         *
         * @return: 集合中存储的元素数量
         */
        int size() {
            return id;
        }

        /**
         * 判断集合中是否有存储元素
         *
         * @return: 如果有存储元素 返回true 否则返回false
         */
        boolean isEmpty() {
            return id > -1;
        }

        /**
         * 设置指定下标的元素值
         *
         * @param index: 指定下标
         * @param e:     修改后的元素
         * @return: 修改前的元素, 如果下标越界 返回null
         */
        E set(int index, E e) {
            E ret = list1[index];
            list1[index] = e;
            return ret;
        }


    }

}
