package train.year_2026.May;

import train.Aff_calss.t_5_26_3.BankAccount;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class t_26 {
    static int id = 0;

    public static void main(String[] args) {
        third();
    }

    //第一题(回文数判断)
    public static void first1() {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[50];
        int id = -1, id1 = 0;
        while (n > 0) {
            arr[++id] = n % 10;
            n /= 10;
        }
        boolean check = true;
        while (id1 <= id) {
            if (arr[id1] != arr[id]) {
                check = false;
                break;
            }
            id1++;
            id--;
        }
        if (check) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }

    //第二题(杨辉三角)
    public static void second() {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[12];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                arr[j] = arr[j - 1] + arr[j];
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    //第三题(模拟银行账户系统)
    public static void third() {
        ArrayList<BankAccount> acc = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        int check = 0, account, amount,dex,leng;               //check接收输入，account是账号，amount是金额,dex是索引，leng是数组长度
        String name;
        double balance;
        while (true) {
            System.out.println("1.开户(输入姓名和初始存款，自动生成账号)");
            System.out.println("2.存款(输入账号和金额)");
            System.out.println("3.取款(输入账号和金额)");
            System.out.println("4.查询账户(输入账号，显示姓名和余额)");
            System.out.println("5.显示所有账户(列出账号、姓名、余额)");
            System.out.println("6.退出");
            check = inp.nextInt();
            try {
                leng = acc.size();                                  //用户数量
                dex = -1;                                           //符合的索引
                if (check == 1) {                                   //开户
                    name = inp.next();                              //接收用户名
                    balance = inp.nextDouble();                     //接收存款金额
                    acc.add(new BankAccount(name, balance));
                }
                else if (check == 2) {                              //存款
                    System.out.println("请输入账号和金额");
                    account = inp.nextInt();
                    amount = inp.nextInt();                         //获取账号，获取要存的金额
                    for (int i = 0; i < leng; i++) {                //寻找相应的账号
                        if (acc.get(i).getAccountId() == account) {
                            dex = i;
                            break;
                        }
                    }
                    if (dex == -1) {
                        System.out.println("没有该用户");
                    } else {
                        acc.get(dex).deposit(amount);
                    }
                }
                else if (check == 3) {                                  //取款
                    System.out.println("请输入账号和金额");
                    account = inp.nextInt();amount = inp.nextInt();                             //获取账号，获取要存的金额
                    for (int i = 0; i < leng; i++) {
                        if (acc.get(i).getAccountId() == account) {
                            dex = i;
                            break;
                        }
                    }
                    if (dex == -1) {
                        System.out.println("没有该用户");
                    } else {
                        acc.get(dex).withdraw(amount);
                    }
                }
                else if (check == 4) {                                  //查询账户(输入账号，显示显示姓名和余额)
                    account = inp.nextInt();amount = inp.nextInt();                             //获取账号，获取要存的金额
                    for(int i=0;i<leng;i++){
                        if (acc.get(i).getAccountId() == account) {
                            dex = i;
                            break;
                        }
                    }
                    if (dex == -1) {
                        System.out.println("没有该用户");
                    } else {
                        acc.get(dex).getInfo();
                    }
                }
                else if (check==5){
                    if(leng==0){
                        System.out.println("没有任何用户");
                        continue;
                    }
                    for(int i=0;i<leng;i++){
                        System.out.print("1.");
                        acc.get(i).getInfo();
                    }
                }
                else if (check == 6) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("输入类型错误");
            }
        }
    }
}
