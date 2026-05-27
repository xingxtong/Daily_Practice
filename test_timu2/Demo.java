package test_timu2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    //Java:

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menuView();
    }


    // -------------------- 数据设计 --------------------
/*
    棋盘:
        board[i][j]表示坐标(i,j)的值
        0表示空地
        1表示黑子
        2表示白子
    如: board[3][6] = 1  表示(3,6)的位置是黑子
*/
    public static int board[][] = new int[19][19];

    // 表示当前回合数  偶数表示黑棋落子  奇数表示白棋落子
// 如: flag = 20 表示当前是第[20]次落子  由黑方落子
    public static int flag;
// -------------------- 数据设计 --------------------


    // -------------------- service --------------------
/*
    负责人: 张三
    功能: 初始化游戏数据
        将棋盘的值初始化为0
        当前回合设为黑棋(flag设为0)
    参数: void
    返回值: void
*/
    public static void init() {
        //在此处完成代码
        //用两层循环将每个格子初始化为0(外面一层帮助判断谁胜利，所以从1开始，到18结束)
        for (int i = 1; i < 18; i++) {
            for (int j = 1; j < 18; j++) {
                board[i][j] = 0;
            }
        }
        flag = 0;
    }

    /*
        *难点1
        负责人: 张三
        功能: 根据传入的坐标(board对应位置)和flag值 判断落点后是否获胜
        参数:
            x: 当前回合落子的x坐标
            y: 当前回合落子的y坐标
        返回值:
            0表示没有获胜
            1表示黑子胜利
            2表示白子胜利
    */
    public static int isWin(int x, int y) {
        //在此处完成代码
        return 0;
    }

    /*
        负责人: 张三
        功能: 在指定位置落子
            如果board[x][y]是空地 则修改board[x][y]的值:改为相应颜色(flag对应颜色)
                   否则不操作
        参数:
            x: 当前回合落子的x坐标
            y: 当前回合落子的y坐标
        返回值:
            0表示落子失败 (棋盘已经有子)
            1表示落子成功

    */
    public static int playerMove(int x, int y) {
        //在此处完成代码
        //检查x，y的合法性
        if ((x > 0 && x < 18) && (y > 0 && y < 18)) {
            //判断该位置(x,y)是否为0(空地)
            if (board[x][y] == 0) {
                board[x][y] = flag % 2;
                return 1;
            }
        }
        return 0;
    }
// -------------------- service --------------------


    // -------------------- view --------------------
/*
    功能: 展示选项, 玩家可以在这里选择进入游戏, 进入设置或退出游戏
        while(1){
            1. 展示选项
            2. 用户输入
            3. 根据输入进行对应处理
                进入游戏: 调用游戏界面函数gameView();
                进入设置: 打印敬请期待... 重新循环
                退出游戏: 调用exit(0);
        }
*/
    public static void menuView() {
        //在此处完成代码
        //接收用户的输入
        int inp;
        //主循环，先接收用户输入再运行指定函数
        while (true) {
            System.out.println("1.进入游戏");
            System.out.println("2.进入设置");
            System.out.println("3.退出游戏");

            inp = scan.nextInt();
            //根据用户输入去调用函数
            switch (inp) {
                case 1:
                    gameView();
                    break;
                case 2:
                    System.out.println("敬请期待");
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }

    /*
        负责人: 张三
        功能: 根据board数组 打印游戏棋盘
        参数: void
        返回值: void
    */
    public static void gameView_ShowBoard() {
        //在此处完成代码
        //渲染横轴
        System.out.print("\n请根据横纵坐标下棋，轮到：");
        if (flag % 2 == 0) {
            System.out.print("黑棋\n");
        } else {
            System.out.println("白棋\n");
        }
        System.out.print("   0  1");
        for (int i = 2; i < 18; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        //两层循环打印棋盘
        for (int i = 1; i < 18; i++) {
            //渲染纵坐标和每一行的左边界
            System.out.printf("%4d ", i);
            //渲染每一个格子和右边界
            for (int j = 1; j < 18; j++) {
                System.out.print(" ");
                //根据这个格子的值渲染对应的字符
                switch (board[i][j]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("●");
                        break;
                    case 2:
                        System.out.print("○");
                }
                System.out.print(" |");
            }
            System.out.println();
        }
    }

    /*
        负责人: 张三
        功能: 根据flag的值  打印游戏胜利界面  用户可以按回车键回到主菜单
        参数: void
        返回值: void
    */
    public static void winView() {
        //在此处完成代码
        if (flag % 2 == 0) {
            System.out.println("恭喜黑棋获得胜利！！！");
        } else {
            System.out.println("恭喜白棋获得胜利！！！");
        }
        //延迟600ms
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n按回车回到主界面");
        // 用于接收用户的空格，但是不用赋值给变量
        scan.next();
    }

    /*
        *难点2
        负责人: 张三
        功能: 游戏界面整合
            初始化游戏数据(调用函数init())
            while(1){
                打印游戏界面(调用函数gameView_ShowBoard())
                接收玩家坐标输入

                落子(调用落子函数playerMove())
                    (如果落子失败 重新开始循环)

                判断游戏是否胜利(调用胜利判断函数isWin())
                    (如果游戏胜利 调用胜利界面函数 然后结束当前界面)
                切换玩家(修改flag值)
            }
        参数: void
        返回值: void
    */
    public static void gameView() {
        //用于检测用户还想不想玩
        int check = 1;
        //表示棋子上限(用来检测是否平局)
        int upBound = 17 * 17;
        init();                                 //初始化棋盘
        int x = 0, y = 0;                       //表示棋子的坐标
        int win;                                //用来存本局有没有人胜利
        //这个循环用于让用户不停下棋，直到有人胜利
        while (true) {
            //检测平局
            if (upBound <= flag) {
                System.out.println("双方平局！！！,按回车回到菜单");
                scan.nextInt();
                //直接return就可以返回菜单
                return;
            }
            gameView_ShowBoard();               //渲染界面
            //检测输入是否异常
            try {
                //接收坐标轴
                x = scan.nextInt();
                y = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("类型匹配失败,请重新输入");
                scan.next();
                continue;
            }
            //判断是否落子成功
            if (playerMove(x, y) == 1) {
                System.out.println("落子成功");
                ++flag;
                win = isWin(x, y);
                //如果win>0说明有人赢了，谁赢了不重要
                if (win > 0) {
                    //展示谁赢了
                    winView();
                    return;
                }
            } else {
                System.out.println("落子失败,请重新输入");
            }
        }
    }
    // -------------------- view --------------------
}
