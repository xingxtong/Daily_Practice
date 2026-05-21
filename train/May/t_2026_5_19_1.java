package train.May;

import java.util.Scanner;

public class t_2026_5_19_1
{
    //第三题
    public static void main(String[] args)
    {
        System.out.println("请输入1-10^9内的整数");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i=1;i*i<=n;i++)
        {
            System.out.print((i*i)+" ");
        }
    }
    //第三题
    public static void train_3(int n)
    {

        for(int i=1;;i++)
        {
            System.out.print((i*i)+" ");
        }
    }
    public static void train_4(boolean[] arr,int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j+=i)
            {
                //切换状态
                arr[j]=!arr[j];
            }
        }
        for(int i=1;i<=num;i++)
        {
            if(arr[i])
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void train_1()
    {
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        int sum=0;
        //计算年龄总和
        for(int i=0;i<n;i++)
        {
            sum += inp.nextInt();
        }
        //直接输出平均数
        double pj=(sum/(n*1.0));
        System.out.printf("%.2f",pj);
    }
    public static void train_2()
    {

    }
}
