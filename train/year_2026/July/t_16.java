package train.year_2026.July;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class t_16 {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(ConfigManager.getInstance());
        System.out.println(ConfigManager.getInstance());
        ConfigManager.getInstance().setConfig("app.name","图书管理系统");
        System.out.println(ConfigManager.getInstance().getConfig("app.name"));
    }

    //1.LocalDate与DateTimeFormatter
    public static void first1(){
        System.out.println(LocalDate.now());
        LocalDate localDate = LocalDate.of(2025,12,25);
        System.out.println(localDate);
        LocalDate localDate1=LocalDate.parse("2025-07-15");
        System.out.println(localDate1);
        System.out.println(localDate1.plusDays(30));
        System.out.println(localDate1.getDayOfWeek());
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(LocalDate.parse("2026年07月16日",date));
    }


}


//2.单例模式
class ConfigManager{
    private Map<String,String> config;
    private static final ConfigManager configManager=new ConfigManager();
    private ConfigManager(){
        config=new HashMap<>();
    };

    public static ConfigManager getInstance(){
        return configManager;
    }

    public String getConfig(String key){
        return config.get(key);
    }

    public void setConfig(String key,String value){
        config.put(key,value);
    }
}