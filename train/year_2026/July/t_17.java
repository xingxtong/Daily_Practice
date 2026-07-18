package train.year_2026.July;

import java.time.*;
import java.util.Scanner;

public class t_17 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    }

    //1.Period与Duration
    public void first1() {
        LocalDate yearStart = LocalDate.of(2025, 1, 1);
        LocalDate yearEnd = LocalDate.of(2025, 12, 31);
        System.out.println(yearStart + "到" + yearEnd + "间隔：" + Period.between(yearStart, yearEnd));
        LocalTime localTime1 = LocalTime.of(8, 30, 0);
        LocalTime localTime = LocalTime.of(17, 45, 30);
        Duration between = Duration.between(localTime, localTime1);
        System.out.println(localTime + "到" + localTime1 + between.toHoursPart() + "小时" + between.toMinutesPart() + "分钟" + between.toSecondsPart() + "秒");
        LocalDateTime now = LocalDateTime.now();
        now.plusDays(3).plusHours(5);
        System.out.println(now);
    }
}

class User {
    Long id;
    String username;
    String email;
    String phone;
    Integer age;

    public static class UserBuilder {
        Long id;
        String username;
        String email;
        String phone;
        Integer age;

        public UserBuilder(Long id, String username) {
            this.id = id;
            this.username = username;
        }

        public UserBuilder email(String email){
            this.email=email;
            return this;
        }
        public UserBuilder phone(String phone){
            this.phone=phone;
            return this;
        }
        public UserBuilder age(Integer age){
            this.age=age;
            return this;
        }
        public User build(){
            User user = new User();
            user.id=this.id;
            user.username=this.username;
            user.email=this.email;
            user.phone=this.phone;
            user.age=this.age;
            return user;
        }
    }
}
