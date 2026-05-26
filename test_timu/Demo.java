package test_timu;

public class Demo {
    /*
        功能: 计算两个整数的最大公约数
        参数:
            a: 第一个整数
            b: 第二个整数
        返回值:
            两个整数的最大公约数
    */
    public static int gcd(int a, int b) {
        //在这里写函数实现
        int c;
        while (b != 0) {               //辗转相除法
            c = a;
            a = b;
            b = c % b;
        }
        return a;
    }

    /*
        功能: 计算斐波那契数列的第k个数
        参数:
            k: 在斐波那契数列中的位置(从1开始), k的值不大于40
        返回值:
            斐波那契数列的第k个数的值
    */
    public static int fibonacci(int k) {
        //在这里写函数实现
        int[] fi = {0, 1};
        int k1 = (k - 2) / 2;
        if (k >= 2) {
            for (int i = 0; i <= k1; i++) {
                fi[0] = fi[1] + fi[0];
                fi[1] = fi[1] + fi[0];
            }
        }
        return fi[k % 2];
    }

    /*
        功能: 查找数组中第k大的元素
        参数:
            arr: 整数数组
            size: 数组的大小
            k: 需要查找的位置(从1开始)
        返回值:
            数组中第k大的元素
    */
    public static int getKthLargest(int[] arr, int size, int k) {
        //在这里写函数实现
        //直接k次遍历(但是太慢)
        int[] arrC = new int[k];
        int id = -1;
        boolean check;
        int max1 = 0;
        for (int l = 0; l < k; l++) {
            for (int i = 0; i < size; i++) {
                check = true;
                for (int j = 0; j <= id; j++) {
                    if (i == arrC[j]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    max1 = i;
                    break;
                }
            }
            for (int i = 0; i < size; i++) {
                check = true;
                for (int j = 0; j <= id; j++) {
                    if (arrC[j] == i) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    max1 = arr[max1] > arr[i] ? max1 : i;
                }
            }
            arrC[++id] = max1;
        }
        return arr[arrC[k - 1]];
    }

    public static int getKthLargest1(int[] arr,int size,int k){
        //使用快排进行排序再选第k个
        quick_sort(arr,0,size-1);
        return arr[k-1];
    }

    public static void quick_sort(int[] arr,int left,int right){

    }

    public static void insert_sort(int[] arr,int left,int right){
        int j,cen=arr[left];
        for(int i=left;i<right;i++){
            for(j=i;j>=left;j++){
                if(arr[j]<arr[j-1]) {
                    arr[j]=cen;
                    arr[j] = arr[j - 1];
                    arr[j-1]=cen;
                }
            }
            arr[j]=arr[j-1];
        }
    }

    /*
        功能: 登录验证
            检查输入的账号和密码是否与存储的数据匹配
        参数:
            accounts: 存储的账号数组
            passwords: 存储的密码数组(与账号对应)
            size: 传入数组的长度
            inputAccount: 用户输入的账号
            inputPassword: 用户输入的密码
        返回值:
            1: 登录成功
            0: 登录失败
    */
    public static int login(int accounts[], int passwords[], int size, int inputAccount, int inputPassword) {
        //在这里写函数实现
        for (int i = 0; i < size; i++) {
            if (accounts[i] == inputAccount && passwords[i] == inputPassword) {
                return 1;
            }
        }
        return 0;
    }

    /*
        功能: 日期验证
            传入年,月,日三个整数参数,判断这个日期是否合法.
            注意处理闰年的天数问题.
            闰年判断规则:
              1. 年份是4的倍数 -> 是闰年
              2. 但是,年份是100的倍数 -> 不是闰年
              3. 但是,年份是400的倍数 -> 是闰年
        参数:
            year: 年
            month: 月
            day: 日
        返回值:
            0: 日期错误
            1: 日期正确
    */
    public static int isValidDate(int year, int month, int day) {
        //在这里写函数实现
        int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {       //能被4整除但不能被100整除，或者能直接被400整除的是闰年
            mon[1] = 29;
        }
        if (month > 0 && month < 13) {
            if (day > 0 && day <= mon[month - 1]) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println("测试gcd函数:");
        int[][] gcdTestCases = {
                {48, 18, 6},
                {7, 13, 1},
                {0, 5, 5},       // 边界情况:一个数字为零
                {12, 12, 12},    // 边界情况:相同数字
                {1071, 462, 21}, // 更大数字:1071和462
                {270, 192, 6}    // 附加测试用例
        };

        for (int i = 0; i < gcdTestCases.length; i++) {
            int result = gcd(gcdTestCases[i][0], gcdTestCases[i][1]);
            System.out.printf("gcd(%d, %d) = %d [%s]\n",
                    gcdTestCases[i][0], gcdTestCases[i][1], result,
                    result == gcdTestCases[i][2] ? "通过" : "失败");
        }
        System.out.println();

        System.out.println("测试fibonacci函数:");
        int[][] fibTestCases = {
                {1, 1},
                {2, 1},
                {5, 5},
                {10, 55},      // 第10个斐波那契数
                {15, 610},     // 第15个斐波那契数
                {20, 6765}     // 第20个斐波那契数
        };

        for (int i = 0; i < fibTestCases.length; i++) {
            int result = fibonacci(fibTestCases[i][0]);
            System.out.printf("fibonacci(%d) = %d [%s]\n",
                    fibTestCases[i][0], result,
                    result == fibTestCases[i][1] ? "通过" : "失败");
        }
        System.out.println();

        System.out.println("测试getKthLargest函数:");
        int[] arr1 = {4, 2, 7, 1, 3, 9, 5, 8, 6};
        int size1 = arr1.length;

        int[][] kthTestCases = {
                {1, 9},  // 第1大
                {2, 8},  // 第2大
                {5, 5},  // 第5大
                {9, 1}   // 第9大(最小)
        };

        for (int i = 0; i < kthTestCases.length; i++) {
            int result = getKthLargest(arr1, size1, kthTestCases[i][0]);
            System.out.printf("getKthLargest(arr1, %d, %d) = %d [%s]\n",
                    size1, kthTestCases[i][0], result,
                    result == kthTestCases[i][1] ? "通过" : "失败");
        }
        System.out.println();

        System.out.println("测试login函数:");
        int[] accounts = {1001, 1002, 1003, 1004, 0, 0, 0, 0, 0, 0};
        int[] passwords = {1234, 5678, 9012, 3456, 0, 0, 0, 0, 0, 0};

        int[][] loginTestCases = {
                {1001, 1234, 1},  // 正确
                {1002, 5678, 1},  // 正确
                {1001, 9999, 0},  // 错误密码
                {9999, 1234, 0},  // 不存在的账号
                {1003, 9012, 1},  // 正确
                {1004, 0000, 0}   // 错误密码
        };

        for (int i = 0; i < loginTestCases.length; i++) {
            int result = login(accounts, passwords, 10, loginTestCases[i][0], loginTestCases[i][1]);
            System.out.printf("login(%d, %d) = %d [%s]\n",
                    loginTestCases[i][0], loginTestCases[i][1], result,
                    result == loginTestCases[i][2] ? "通过" : "失败");
        }
        System.out.println();

        System.out.println("测试isValidDate函数:");
        int[][] dateTestCases = {
                {2023, 2, 28, 1},  // 有效日期:平年2月28日
                {2020, 2, 29, 1},  // 有效日期:闰年2月29日
                {2000, 2, 29, 1},  // 有效日期:世纪闰年2月29日
                {2023, 2, 29, 0},  // 无效日期:平年2月29日
                {2023, 4, 31, 0},  // 无效日期:4月31日
                {2023, 13, 1, 0},  // 无效日期:13月
                {2023, 0, 1, 0},   // 无效日期:0月
                {2023, 1, 0, 0},   // 无效日期:0日
                {2023, 12, 31, 1}, // 有效日期:12月31日
                {2023, 11, 30, 1}, // 有效日期:11月30日
                {2023, 10, 31, 1}  // 有效日期:10月31日
        };

        for (int i = 0; i < dateTestCases.length; i++) {
            int result = isValidDate(dateTestCases[i][0], dateTestCases[i][1], dateTestCases[i][2]);
            System.out.printf("isValidDate(%d, %d, %d) = %d [%s]\n",
                    dateTestCases[i][0], dateTestCases[i][1], dateTestCases[i][2], result,
                    result == dateTestCases[i][3] ? "通过" : "失败");
        }
    }
}