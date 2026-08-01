package train.year_2026.July;

import java.util.Optional;
import java.util.function.Supplier;

public class t_23 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(Optional.of(s).get());
        s = null;
        System.out.println(Optional.ofNullable(s).orElse("默认值"));
        s = "Java";
        System.out.println(Optional.ofNullable(s).orElseGet(() -> "动态生成"));
        if (Optional.ofNullable(null).isPresent()) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
        System.out.println(Optional.of("123").map(s1 -> Integer.parseInt(s1)));
        System.out.println(Optional.ofNullable(null).orElseThrow(() -> new RuntimeException("值为空，抛出异常")));

    }
}
