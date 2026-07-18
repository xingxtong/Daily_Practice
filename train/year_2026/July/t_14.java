package train.year_2026.July;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class t_14 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        first1();
    }

    //1.日期计算器
    public static void first1() {
        //获取年月日
        int year = scan.nextInt(), month = scan.nextInt(), day = scan.nextInt();
        LocalDate localDate = LocalDate.of(year, month, day);
        LocalDate localYear = LocalDate.of(localDate.getYear(), 1, 1);
        long days = localDate.toEpochDay() - localYear.toEpochDay() + 1;
        System.out.println(days);
    }
}
